package org.jsp.onetomanyuni;
import java.util.List;

import javax.persistence.*;
@Entity
public class QuestionData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String question,questionedBy;
	@OneToMany(cascade=CascadeType.ALL)
	private List<AnswerData> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestionedBy() {
		return questionedBy;
	}
	public void setQuestionedBy(String questionedBy) {
		this.questionedBy = questionedBy;
	}
	public List<AnswerData> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerData> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "QuestionData [id=" + id + ", question=" + question + ", questionedBy=" + questionedBy + "]";
	}
	
	
	
	
	
	

}
