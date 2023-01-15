package com.training.weekmvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product = new Product();
		product.setProdId(rs.getInt("PROD_ID"));
		product.setProdName(rs.getString("PROD_NAME"));
		product.setProdDesc(rs.getString("PROD_DESC"));
		product.setPrice(rs.getDouble("PRICE"));
		return product;
	}

}