package com.crime.branch.crimesystem.model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class UserInfo {
	@Id
	@Size(min=6,max=20,message="Invalid Userid")
	@NotBlank(message="UserID is required")
	private String user_id;
	
	@Size(min=5,max=10,message="Invalid password")
	@NotBlank(message="Password is required")
	@Column(unique=true)
	private String passwd;
	
	
	private int unit_name_id;
	private int crime_id;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getUnit_name_id() {
		return unit_name_id;
	}
	public void setUnit_name_id(int unit_name_id) {
		this.unit_name_id = unit_name_id;
	}
	public int getCrime_id() {
		return crime_id;
	}
	public void setCrime_id(int crime_id) {
		this.crime_id = crime_id;
	}
	

}
