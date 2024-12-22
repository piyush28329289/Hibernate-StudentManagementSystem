
package com.Studentproject.business;

import com.Studentproject.dto.student;
import com.Studentproject.repository.Studenterepo;
import com.Studentproject.repository.impli.Studentrepositoryimpl;

public class Studentservice   {
	private Studenterepo stdentrepo= new Studentrepositoryimpl() ;
	public boolean Savestudent(student stud) {
		return stdentrepo.save(stud);
	}
	public student findStudent(int Roll_no) {
		return stdentrepo.find(Roll_no);
	}
	public boolean deleteStudent(int Roll_no) {
		return stdentrepo.delete(Roll_no);
	}


}
