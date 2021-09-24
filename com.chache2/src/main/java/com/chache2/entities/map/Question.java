package com.chache2.entities.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String auestion;
	@OneToMany(mappedBy = "question")
	private List<Answer> ans;
	
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", auestion=" + auestion + ", ans=" + ans + "]";
	}

	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getAuestion() {
		return auestion;
	}
	public void setAuestion(String auestion) {
		this.auestion = auestion;
	}

}
