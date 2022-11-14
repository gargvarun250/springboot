package net.codejava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class SalesDAOTest {
	
	private SalesDAO dao;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@192.168.86.234:1521:xe");
		datasource.setUsername("system");
		datasource.setPassword("system");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new SalesDAO(new JdbcTemplate(datasource));
		
	}

	@Test
	void testList() {
		List<Sale> listSale = dao.list();
		assertTrue(listSale.isEmpty());
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
