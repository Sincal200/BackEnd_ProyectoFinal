package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String project;
	private String dueDate;
	private String leader;
	private String consultant;
	private String member;
	private String member1;
	private String member2;
	private String member3;
	private String member4;
	private String performance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getMember1() {
		return member1;
	}
	public void setMember1(String member1) {
		this.member1 = member1;
	}
	public String getMember2() {
		return member2;
	}
	public void setMember2(String member2) {
		this.member2 = member2;
	}
	public String getMember3() {
		return member3;
	}
	public void setMember3(String member3) {
		this.member3 = member3;
	}
	public String getMember4() {
		return member4;
	}
	public void setMember4(String member4) {
		this.member4 = member4;
	}

	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	
}
