package com.laughingenigmas.db.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerNumber;
	private String customerName;
	private String contactLastName;
	private String contactFirstName;

	private String phone;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String postalCode;

	private String country;

	private String salesRepEmployeeNumber;

	private double creditLimit;

}
