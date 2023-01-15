package com.training.weekmvc.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.weekmvc.model.Cart;
import com.training.weekmvc.model.CartMapper;
import com.training.weekmvc.model.Product;
import com.training.weekmvc.model.ProductMapper;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PRODUCT = "select * from PRODUCT12 where prod_id = ?";
	private final String SQL_GET_PRODUCTS = "select * from PRODUCT12";
	private final String SQL_CREATE_PRODUCT = "insert into Cart"
									+ "	(PROD_ID, PROD_NAME, PROD_DESC, PRICE) "	
										+"values(?,?,?,? )";
	
	private final String SQL_DELETE_PRODUCT = "delete from product12 where PROD_ID = ?";
	private final String SQL_UPDATE_PRODUCT = "update product12 set prod_name = ?, prod_desc = ?, price = ? where prod_id = ?";
	private final String SQL_GET_CARTS = "select * from Cart";
	
	
	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Product getProductById(int id) {
		
		return jdbcTemplate.queryForObject(SQL_FIND_PRODUCT, new Object[] {id}, new ProductMapper());
	}

	@Override
	public List<Product> getProducts() {
		return jdbcTemplate.query(SQL_GET_PRODUCTS, new ProductMapper());
	}

	@Override
	public boolean createProduct(Product product) {
		
		return jdbcTemplate.update(SQL_CREATE_PRODUCT, product.getProdId(), product.getProdName()
				, product.getProdDesc(), product.getPrice()) > 0;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		
		return jdbcTemplate.update(SQL_DELETE_PRODUCT, prodId) > 0;
	}
	@Override
	public boolean updateProduct(Product product) {
		
		return jdbcTemplate.update(SQL_CREATE_PRODUCT,product.getProdId(), product.getProdName(), product.getProdDesc(),
				                                       product.getPrice())> 0;
	}

	@Override
	public List<Cart> getCart() {
		return jdbcTemplate.query(SQL_GET_CARTS, new CartMapper());
	}

}