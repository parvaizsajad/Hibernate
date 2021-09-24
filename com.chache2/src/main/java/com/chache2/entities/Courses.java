package com.chache2.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Courses {
	private String bechlors;
	private String masters;
	public String getBechlors() {
		return bechlors;
	}
	public void setBechlors(String bechlors) {
		this.bechlors = bechlors;
	}
	public String getMasters() {
		return masters;
	}
	public void setMasters(String masters) {
		this.masters = masters;
	}
	@Override
	public String toString() {
		return "Courses [bechlors=" + bechlors + ", masters=" + masters + "]";
	}
	

}
