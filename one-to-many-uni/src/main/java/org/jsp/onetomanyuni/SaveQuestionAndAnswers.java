package org.jsp.onetomanyuni;
import java.util.Arrays;

import javax.persistence.*;
public class SaveQuestionAndAnswers {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		QuestionData q=new QuestionData();
		q.setQuestion("what is java?");
		q.setQuestionedBy("Nandiswar");
		
		AnswerData a1=new AnswerData();
		a1.setAnswer("java is a high level programming language");
		a1.setAnsweredBy("Abhi");
		
		AnswerData a2=new AnswerData();
		a2.setAnswer("java is a object oriented programming language");
		a2.setAnsweredBy("Vamshi");
		
		AnswerData a3=new AnswerData();
		a3.setAnswer("java is a Both Object And High Level Programming language");
		a3.setAnsweredBy("Praveen");
		
		q.setAnswers(Arrays.asList(a1,a2,a3));
		manager.persist(q);
		t.begin();
		t.commit();
	}

}
