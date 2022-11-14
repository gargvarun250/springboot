package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SalesDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public SalesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Sale> list(){
		String sql = "SELECT * FROM SALES";
		List<Sale> listSale = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sale.class));
		
		return listSale;
	}
	public void save(Sale sale) {
		
	}
	public Sale get(int id) {
		return null;
	}
	public void update(Sale sale) {
		
	}
	public void delete(Sale sale) {
		
	}
}
