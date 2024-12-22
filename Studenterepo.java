package com.Studentproject.repository;

import com.Studentproject.dto.student;

public interface Studenterepo {
	public boolean save(student stud);

	public student find(int Roll_no);

	public boolean delete(int Roll_no);

}
