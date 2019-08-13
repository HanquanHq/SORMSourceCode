package com.bjsxt.vo;

public class EmpVO {
	
	private Integer id;
	private String empname;
	private Integer salary; 
	private Integer bonus;
	private Long money;
	private Integer age;
	private String deptName;
	private String deptAddr;
	

	public EmpVO() {
		
	}
	
	public EmpVO(Integer id, String empname, Integer salary, Integer bonus, Long money, Integer age, String deptName,
			String deptAddr) {
		super();
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.bonus = bonus;
		this.money = money;
		this.age = age;
		this.deptName = deptName;
		this.deptAddr = deptAddr;
	}

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public Integer getBonus() {
		return bonus;
	}



	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}



	public Long getMoney() {
		return money;
	}



	public void setMoney(Long money) {
		this.money = money;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public String getDeptAddr() {
		return deptAddr;
	}



	public void setDeptAddr(String deptAddr) {
		this.deptAddr = deptAddr;
	}



	@Override
	public String toString() {
		return "EmpVO [id=" + id + ", empname=" + empname + ", salary=" + salary + ", bonus=" + bonus + ", money="
				+ money + ", age=" + age + ", deptName=" + deptName + ", deptAddr=" + deptAddr + "]";
	}
//	public String toString() {
//		return id + "\t" + empname + "\t" + salary + "\t" + bonus + "\t" + money + "\t" + deptName + "\t" + deptAddr;
//	}
}
