package org.jsp.onetomanyuni;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class FindingAllAnsersByQustionId {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter id:");
		int id=s.nextInt();
		
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		
		String jpql="select q.answers from QuestionData q where q.id=?1";
		Query q=manager.createQuery(jpql);
		q.setParameter(1, id);
		
		List<AnswerData> answers=q.getResultList();
		if(answers.isEmpty())
		{
			System.err.println("Id Not Found");
		}
		else
		{
			for (AnswerData data : answers) {
				System.out.println(data);
			}
		}
		
	}

}
