package studentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~~~~~~~~~~~~~1~~");
		System.out.println("STUDENT MANAGEMENT SYSTEM OF Amrutvahini Education Society");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter no of new student to enroll :");
		Scanner in=new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n=0;n < numOfStudents; n++)
		{
			students[n]  = new Student();
			students[n].enroll();
			students[n].payTution(n);
			
		}
		for(int n=0;n < numOfStudents; n++)
		{
		System.out.println(students[n].show());
		

		
	}

}
}
	


