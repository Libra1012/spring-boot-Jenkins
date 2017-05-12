package com.venus.self.bean;

import java.util.Date;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Record(minOccurs = 1)
@Fields({
	@Field(name = "type", at = 0, rid = true, literal = "EMP")
})
public class Employee {
	
	@Field(at = 1)
	String firstName;
	@Field(at = 2)
	String lastName;
	@Field(at = 3)
	String title;
	@Field(at = 4)
	String salary;
	@Field(at = 5, format = "yyyyMMdd")
	Date hireDate;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
