package Jdbc_template.SpringJdbcFramework.EmoloyeEntity;

public class EmployeeEntity {
	private int id;
	private String name;
	private float salary;

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

	public void setSalary(float salary) {
		this.salary = salary;
	}


	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmoloyeEntity [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
