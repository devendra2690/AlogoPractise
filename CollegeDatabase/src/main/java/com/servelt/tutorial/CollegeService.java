package com.servelt.tutorial;

import java.util.ArrayList;
import java.util.List;

public class CollegeService{

	public static List<Student> stdList;

	static {
		stdList = new ArrayList<Student>();

		Student std1 = new Student(1L, "Dev", "Kham");
		Student std2 = new Student(2L, "Abhi", "Pune");
		Student std3 = new Student(3L, "Ras", "Mum");

		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
	}

	public List<Student> getAllStd() {
		return stdList;
	}

}
