package Jdbc_template.SpringJdbcFramework.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Jdbc_template.SpringJdbcFramework.EmoloyeEntity.EmployeeEntity;
import Jdbc_template.SpringJdbcFramework.employedao.EmployeeDao;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao bean = context.getBean("employee", EmployeeDao.class);
		/*
		 * EmployeeEntity entity = new EmployeeEntity(1, "manish", 123); int saveemploye
		 * = bean.saveemploye(entity); System.out.println(saveemploye);
		 */
		/*
		 * EmployeeEntity entity = new EmployeeEntity(1, "gshan", 1243f); int i =
		 * bean.updateemploye(entity); System.out.println(i);
		 */
		EmployeeEntity entity = new EmployeeEntity();
		entity.setId(1);
		int employe = bean.DeleteEmploye(entity);
		System.out.println(employe);
		

	}
}
