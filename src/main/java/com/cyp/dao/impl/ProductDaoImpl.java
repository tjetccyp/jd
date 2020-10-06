package com.cyp.dao.impl;

import com.cyp.dao.ProductDao;
import com.cyp.domain.Product;
import com.cyp.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Override
    public int addProduct(Product product) throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection connection=utils.getConnection();
        String sql="insert into product(pro_name,pro_infor,pro_price,pro_discount,pro_count,imgtype_id,type_id) values(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        int i=utils.addDeleteUpdate(preparedStatement,product.getName(),product.getInfor(),product.getPrice(),product.getDiscount(),product.getCount(),product.getImgType(),product.getProType());
        utils.release(preparedStatement,connection);
        return i;
    }

    @Override
    public int removeProductById(int id) throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection connection=utils.getConnection();
        String sql="delete from product where pro_id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        int i=utils.addDeleteUpdate(preparedStatement,id);
        utils.release(preparedStatement,connection);
        return i;
    }

    @Override
    public int updateProduct(Product product) throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection connection=utils.getConnection();
        String sql="update product set(pro_name,pro_infor,pro_price,pro_discount,pro_count,imgtype_id,type_id) values(?,?,?,?,?,?,?) where pro_id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        int i=utils.addDeleteUpdate(preparedStatement,product.getName(),product.getInfor(),product.getPrice(),product.getDiscount(),product.getCount(),product.getImgType(),product.getProType(),product.getId());
        utils.release(preparedStatement,connection);
        return i;
    }

    @Override
    public Product findProductById(int id) throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection connection=utils.getConnection();
        return null;
    }

    @Override
    public List<Product> list() throws SQLException {
        JDBCUtils utils=new JDBCUtils();
        Connection connection=utils.getConnection();
        String sql="";

        return null;
    }
}
