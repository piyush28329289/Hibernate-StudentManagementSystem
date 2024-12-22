package com.Studentproject.repository.impli;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Studentproject.config.Dataconfigue;
import com.Studentproject.dto.student;
import com.Studentproject.repository.Studenterepo;

public class Studentrepositoryimpl implements Studenterepo {
	private static final SessionFactory sessionfactory = Dataconfigue.getinstanceofsessionfactory();

	@Override
	public boolean save(student stud) {
		try {
			Session ses = sessionfactory.openSession();
			Transaction tra = ses.beginTransaction();
			ses.persist(stud);
			tra.commit();
			ses.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public student find(int Roll_no) {
		try {
			Session ses = sessionfactory.openSession();
			System.out.println(sessionfactory);
			System.out.println(ses);
			student stud = ses.get(student.class, Roll_no);
			return stud;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(int Roll_no) {
		try {
			Session ses = sessionfactory.openSession();
			Transaction tra = ses.beginTransaction();
			student stud = ses.getReference(student.class, Roll_no);
			System.out.println(stud);
			ses.remove(stud);
			tra.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

}
