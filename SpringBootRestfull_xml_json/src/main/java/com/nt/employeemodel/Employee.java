package com.nt.employeemodel;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Employee {
	
	private String id;
	private String name;
	private double salary;
	private String add;

}
