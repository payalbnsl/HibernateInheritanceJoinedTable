package com.java.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	 int id;
	@Column(name="stName",unique=true)
	 String name;
	
	public Person(String name) {
		this.name= name;
	}
}
/*student_phone*/