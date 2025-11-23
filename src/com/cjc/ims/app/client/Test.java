package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.PuneInstitute;

public class Test {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int choice;
			PuneInstitute pi=new PuneInstitute();
			do{
				System.out.println("1. Enter course details");
				System.out.println("2. View course details");
				System.out.println("3. Enter faculty details");
				System.out.println("4. View faculty details");
				System.out.println("5. Enter batch details");
				System.out.println("6. View batch details");
				System.out.println("7. Enter student details");
				System.out.println("8. View student details");
				System.out.println("9. Exit");
				
				System.out.println("Please enter your choice:");
				choice=sc.nextInt();
				
				if(choice==1){
					pi.addCourse();
				}
				else if(choice==2){
					pi.viewCourse();
				}
				else if(choice==3){
					pi.addFaculty();
				}
				else if(choice==4){
					pi.viewFaculty();
				}
				else if(choice==5){
					pi.addBatch();
				}
				else if(choice==6){
					pi.viewBatch();
				}
				else if(choice==7){
					pi.addStudent();
				}
				else if(choice==8){
					pi.viewStudent();
				}
				else if(choice==9){
					System.out.println("Exiting...");
				}
				else{
					System.out.println("Wrong choice. Please enter correct choice.");
				}
				
				
			}while(choice!=9);
			
			sc.close();
			
	}

}
