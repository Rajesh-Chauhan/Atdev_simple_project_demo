package com.atdev.entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name ="student_dtls")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column( name = "student_name")
	private String name;
	
	@Column( name = "email_id")
	private String email;
	
	@Column( name = "address_name")
	private String address;
	
	@Column( name = "phone_no.")
	private String phoneno;
	
	@Column( name = "designation_name")
	private String designation;
	


}
