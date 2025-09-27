package com.example;

public class Test {

	public static void main(String[] args) {
		Student stud = new Student();
		
		stud.setRollno(100);
		stud.setName("vignesh");
		stud.setAddress("Tenkasi");
		
		StudentDAO studDAO = new StudentDAOimpl();
		studDAO.insert(stud);

	}

}
