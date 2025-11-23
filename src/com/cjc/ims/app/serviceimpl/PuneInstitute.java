package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Institute;

public class PuneInstitute implements Institute {

	Scanner sc=new Scanner(System.in);
	
	List<Course> clist=new ArrayList<Course>();
	List<Faculty> flist=new ArrayList<Faculty>();
	List<Batch> blist=new ArrayList<Batch>();
	List<Student> slist=new ArrayList<Student>();
	
	@Override
	public void addCourse() {
		Course c1=new Course();
		System.out.println("Enter course id: ");
		c1.setCid(sc.nextInt());
		System.out.println("Enter course name: ");
		c1.setCname(sc.next());
		clist.add(c1);
	}

	@Override
	public void viewCourse() {
		System.out.println("All courses: ");
		for(Course c:clist){
			System.out.println(c.getCid());
			System.out.println(c.getCname());
		}
	}

	@Override
	public void addFaculty() {
		Course c=new Course();
		Faculty f1=new Faculty();
		System.out.println("Enter faculty id: ");
		f1.setFid(sc.nextInt());
		System.out.println("Enter faculty name: ");
		f1.setFname(sc.next()+sc.nextLine());
		for(Course c1:clist){
			System.out.println(c1.getCid());
			System.out.println(c1.getCname());
		}
		System.out.println("Enter the course id: ");
		int i=sc.nextInt();
		for(Course c1: clist){
			if(c1.getCid() == i){
				c=c1;
			}
		}
		f1.setCourseObj(c);
		flist.add(f1);
		
	}

	@Override
	public void viewFaculty() {
		System.out.println("All faculty: ");
		for(Faculty f: flist){
			System.out.println(f.getFid());
			System.out.println(f.getFname());
			System.out.println(f.getCourseObj());
		}
	}

	@Override
	public void addBatch() {
		Faculty f=new Faculty();
		Batch b1=new Batch();
		System.out.println("Enter batch id: ");
		b1.setBid(sc.nextInt());
		System.out.println("Enter batch name: ");
		b1.setBname(sc.next()+sc.nextLine());
		System.out.println("All faculty: ");
		for(Faculty f1: flist){
			System.out.println(f1.getFid());
			System.out.println(f1.getFname());
			System.out.println(f1.getCourseObj());
		}
		System.out.println("Enter faculty id: ");
		int i=sc.nextInt();
		for(Faculty f1:flist){
			if(f1.getFid()==i){
				f=f1;
			}
		}
		b1.setFacultyObj(f);
		blist.add(b1);
	}

	@Override
	public void viewBatch() {
		System.out.println("All batches: ");
		for(Batch b:blist){
			System.out.println(b.getBid());
			System.out.println(b.getBname());
			System.out.println(b.getFacultyObj());
		}
	}

	@Override
	public void addStudent() {
		Batch b=new Batch();
		Student s1=new Student();
		System.out.println("Enter student id: ");
		s1.setSid(sc.nextInt());
		System.out.println("Enter student name: ");
		s1.setSname(sc.next()+sc.nextLine());
		System.out.println("All batches: ");
		for(Batch b1:blist){
			System.out.println(b1.getBid());
			System.out.println(b1.getBname());
			System.out.println(b1.getFacultyObj());
		}
		System.out.println("Enter batch id: ");
		int i=sc.nextInt();
		for(Batch b1:blist){
			if(b1.getBid()==i){
				b=b1;
			}
		}
		s1.setBatchObj(b);
		slist.add(s1);
		
	}

	@Override
	public void viewStudent() {
		System.out.println("All students: ");
		for(Student s:slist){
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getBatchObj());
		}
	}

		
}
