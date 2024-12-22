package com.Studentproject;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.Studentproject.business.Studentservice;
import com.Studentproject.dto.student;

public class mainApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Studentservice studentservice = new Studentservice();
		student stud = new student();
		int choice=0;
		while (choice != 5) {
		
		System.out.println("ch1:save new Student");
		System.out.println("ch2:Find Student");
		System.out.println("ch3:Delete Student");
		 choice= sc.nextInt();
		
			switch (choice) {
			case 1: {
				System.out.println("enter rollno");
				int rollno = sc.nextInt();
				sc.nextLine();
				System.out.println("enter name ");
				String name = sc.nextLine();
				System.out.println("enter address");
				String address = sc.nextLine();
				System.out.println("enter mobno");
				long mobno = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter Dob");
				String dobInput = sc.nextLine();
				LocalDate localDate = LocalDate.parse(dobInput, DateTimeFormatter.ISO_LOCAL_DATE);
				Date dob = Date.valueOf(localDate);
				stud.setRoll_no(rollno);
				stud.setSname(name);
				stud.setAddress(address);
				stud.setMob_no(mobno);
				stud.setDob(dob);
				studentservice.Savestudent(stud);
				break;
				
			}
			case 2: {
				System.out.println("enter roll no of student you wann find");
				int rollno = sc.nextInt();
				System.out.println( studentservice.findStudent(rollno));
				break;
			}
			case 3: {
				System.out.println("enter roll no to delete student");
				int rollno = sc.nextInt();
				studentservice.deleteStudent(rollno);
				break;
			}

			default:
				break;
			}
		}
		sc.close();
	}
}
