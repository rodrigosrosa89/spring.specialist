package com.rodrigo.spring.specialist.java.employee.core.controller;

import com.rodrigo.spring.specialist.java.employee.core.exceptions.EmployeeNotFoundException;
import com.rodrigo.spring.specialist.java.employee.core.entity.Employee;
import com.rodrigo.spring.specialist.java.employee.core.repositories.EmployeeRepository;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeDetails;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeForm;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeListItem;
import com.rodrigo.spring.specialist.java.employee.core.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    @GetMapping("")
    public ModelAndView index() {
        List<EmployeeListItem> employees = repository.findAll()
                .stream()
                .map(mapper::toEmployeeListItem)
                .toList();

        var model = Map.of("employees", employees);
        return new ModelAndView("employess/index", model);
    }


    @GetMapping("/{id}")
    public ModelAndView details(@PathVariable Long id) {
        EmployeeDetails employeeDetails = repository.findById(id)
                .map(mapper::toEmployeeDetails)
                .orElseThrow(EmployeeNotFoundException::new);

        var model = Map.of("employee", employeeDetails);
        return new ModelAndView("employee/details", model);
    }


    @GetMapping("/create")
    public ModelAndView create() {
        var model = Map.of("pageTitle", "Cadastro de funcionário",
                "employeeForm", new EmployeeForm());
        return new ModelAndView("employees/form", model);
    }

    @PostMapping("/create")
    public String create(EmployeeForm employeeForm) {
        Employee employee = mapper.toEmployee(employeeForm);
        repository.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        EmployeeForm employeeForm = repository.findById(id)
                .map(mapper::toEmployeeForm)
                .orElseThrow(EmployeeNotFoundException::new);
        var model = Map.of("pageTitle", "Edição de funcionário",
                "employeeForm", employeeForm);
        return new ModelAndView("employees/form", model);
    }

    @PutMapping("edit/{id}")
    public String edit(@PathVariable Long id, @RequestBody EmployeeForm employeeForm) {
        Employee employee = repository.findById(id)
                .orElseThrow(EmployeeNotFoundException::new);
        Employee employeeData = mapper.toEmployee(employeeForm);
        BeanUtils.copyProperties(employeeData, employee, "id");
        repository.save(employee);
        return "redirect:/employees";
    }


    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        Employee employeeADeletar = repository.findById(id)
                .orElseThrow(EmployeeNotFoundException::new);
        repository.delete(employeeADeletar);
        return "redirect:/employess";
    }
}
