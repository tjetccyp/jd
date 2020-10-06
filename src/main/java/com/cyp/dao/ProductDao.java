package com.cyp.dao;

import com.cyp.domain.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    int addProduct(Product product) throws SQLException;
    int removeProductById(int id) throws SQLException;
    int updateProduct(Product product) throws SQLException;
    Product findProductById(int id) throws SQLException;
    List<Product> list() throws SQLException;
}
