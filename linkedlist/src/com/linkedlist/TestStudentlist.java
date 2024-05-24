package com.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student
{
	private int id;
	private String name;
	private int marks;
	public Student() {
		super();
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString()
	{
		return id+name+marks;
	}
	
}
public class TestStudentlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<Student> list = new  ArrayList<Student>();
		
		list.add(new Student(101,"ram",60));
		list.add(new Student(102,"raghu",66));
		list.add(new Student(103,"rajan",76));
		
		for(int i=0;i<3;i++)
		{
			System.out.println(list.get(i).getMarks());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getId());
			
			System.out.println(list);
			
			Iterator<Student> itr=list.iterator();
			
			while(itr.hasNext())
			{
				Student s = itr.next();
				System.out.println(s.getName().toUpperCase());
			}
			
			
		}
		
	}

}
