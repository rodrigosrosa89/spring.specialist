package com.rodrigo.spring.specialist.java.product.controller;

import com.rodrigo.spring.specialist.java.product.model.ProductDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products/")
public class ProductController {

    @PostMapping()
    public void saveProducts(@RequestBody ProductDTO productDTO) {
        System.out.println("Produto salvo com sucesso!");
    }
}
