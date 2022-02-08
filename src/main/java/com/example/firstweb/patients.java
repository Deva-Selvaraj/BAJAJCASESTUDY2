package com.example.firstweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class patients {
	
	
	
	
	String PID	;	
	String PNAME;		
	String DISEASE;		
	String SEX	;	
	String ADMIT_STATUS;		
	int AGE	;
	public patients()
	{
		
	}
	public patients(String pID, String pNAME, String dISEASE, String sEX, String aDMIT_STATUS, int aGE) {
		super();
		PID = pID;
		PNAME = pNAME;
		DISEASE = dISEASE;
		SEX = sEX;
		ADMIT_STATUS = aDMIT_STATUS;
		AGE = aGE;
	}
	
	@Id
	@Column(name="PID",nullable=false)
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	@Column(name="PNAME",nullable=false)
	public String getPNAME() {
		return PNAME;
	}
	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}
	@Column(name="DISEASE",nullable=false)
	public String getDISEASE() {
		return DISEASE;
	}
	public void setDISEASE(String dISEASE) {
		DISEASE = dISEASE;
	}
	@Column(name="SEX",nullable=false)
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	@Column(name="ADMIT_STATUS",nullable=false)
	public String getADMIT_STATUS() {
		return ADMIT_STATUS;
	}
	public void setADMIT_STATUS(String aDMIT_STATUS) {
		ADMIT_STATUS = aDMIT_STATUS;
	}
	@Column(name="AGE",nullable=false)
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	

}
