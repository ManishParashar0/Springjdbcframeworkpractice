package Jdbc_template.SpringJdbcFramework.EmoloyeEntity;

public class EmployeEntity {
	private int id;
	private String name;
	private Float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public EmployeEntity(int id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmoloyeEntity [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
