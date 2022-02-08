package com.example.firstweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicines")

public class medicines {
	
	
	
	public medicines(String mED_NAME, String mED_COMP, String eXP_DATE, Integer mED_COST, Integer cOUNT) {
		super();
		MED_NAME = mED_NAME;
		MED_COMP = mED_COMP;
		EXP_DATE = eXP_DATE;
		MED_COST = mED_COST;
		COUNT = cOUNT;
	}
	
	String	MED_NAME	;	
	String	MED_COMP	;	
	 String	EXP_DATE	;	
	 Integer	MED_COST	;
	 Integer	COUNT	;
	

	

 public medicines()
 {
	 
 }

 @Id
 @Column(name="MED_NAME")

 public String getMED_NAME() {
		return MED_NAME;
	}
	public void setMED_NAME(String mED_NAME) {
		MED_NAME = mED_NAME;
	}
	@Column(name="MED_COMP")
	public String getMED_COMP() {
		return MED_COMP;
	}
	public void setMED_COMP(String mED_COMP) {
		MED_COMP = mED_COMP;
	}
	@Column(name="EXP_DATE")
	public String getEXP_DATE() {
		return EXP_DATE;
	}
	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
	}
	@Column(name="MED_COST")
	public Integer getMED_COST() {
		return MED_COST;
	}
	public void setMED_COST(Integer mED_COST) {
		MED_COST = mED_COST;
	}
	@Column(name="COUNT")
	public Integer getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(Integer cOUNT) {
		COUNT = cOUNT;
	}

		
 
 
 
 
 
}