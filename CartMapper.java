package com.training.weekmvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CartMapper implements RowMapper<Cart>{
	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Cart cart = new Cart();
		cart.setProdId(rs.getInt("PROD_ID"));
		cart.setProdName(rs.getString("PROD_NAME"));
		cart.setProdDesc(rs.getString("PROD_DESC"));
		cart.setPrice(rs.getDouble("PRICE"));
		return cart;
	}

}