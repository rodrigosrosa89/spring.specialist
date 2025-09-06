-- Exemplo de como criar uma tabela com arquivo .sql
CREATE TABLE PRODUCT (
    id VARCHAR(255) NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(300) NOT NULL,
    price NUMERIC(18, 2) NOT NULL,
);