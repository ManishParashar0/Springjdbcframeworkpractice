package Jdbc_template.SpringJdbcFramework.employedao;

import org.springframework.jdbc.core.JdbcTemplate;

import Jdbc_template.SpringJdbcFramework.EmoloyeEntity.EmployeeEntity;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveemploye(EmployeeEntity entity) {
		String query = "insert into employee values(" + entity.getId() + ",'" + entity.getName() + "',"
				+ entity.getSalary() + ");";
		return jdbcTemplate.update(query);

	}

	public int updateemploye(EmployeeEntity entity) {
		String query = "update employee set employeename='" + entity.getName() + "',employesalary='" + entity.getSalary()
				+ "' where id='" + entity.getId() + "'";
		return jdbcTemplate.update(query);

	}
 public int  DeleteEmploye( EmployeeEntity entity) {
String query="delete from employee where id="+entity.getId()+";";
	return jdbcTemplate.update(query);
	
}
}
