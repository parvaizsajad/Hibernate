package com.chache2.entities.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

private int A_id;
	
private String answer;

@ManyToOne
private Question question;

public int getA_id() {
	return A_id;
}

public void setA_id(int a_id) {
	A_id = a_id;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

@Override
public String toString() {
	return "Answer [A_id=" + A_id + ", answer=" + answer + ", question=" + question + "]";
}


}
