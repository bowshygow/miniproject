package com.example.SSM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instances")
public class Model {
	
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	int instanceId;

    @Column
	String currentState;
	
    @Column
    int empid;
	
    @Column
    String purpose;
    
    @Column
    String TeamName;
	

	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		this.TeamName = teamName;
	}
	public int getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Model(int instanceId, String currentState, int empid, String purpose, String teamName) {
		super();
		this.instanceId = instanceId;
		this.currentState = currentState;
		this.empid = empid;
		this.purpose = purpose;
		this.TeamName = teamName;
	}

	public Model()
	{
		
	}

}
