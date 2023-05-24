package studentManagementSystem;
import java.util.Scanner;

public class Student {    // main class with all data

	String firstName1;
	String lastName;
	int courseCode;
	int studentID;
    String courses="";
   // courses=courses.replace(null,"");
	int tutionBalance=0;
	int costOfCourse =1500;
	//int id=1;
	int NoofCourses=0;
	private static int id=10000;
	
	public Student()             //create a constructor to pass the values
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter student first name:");
		this.firstName1=in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName=in.nextLine();
		
		System.out.println("\n Enter in which course you are studying: - \n 1.-BE.\n 2.-B-Tech \n 3.-MCA \n 4.-MSC(computer Science) \n 5.-BCA \n 6.BSC(Computer Science)");
		this.courseCode=in.nextInt();
		/*if(courseCode>6)
		{
			System.out.println("Please enter valid courseCode");
		
		}
		*/
		
		setStudentID();
		

}
	private void setStudentID()
	{
		//id++;

		this.studentID = id++;
	}
	
	public void enroll(){      //this method is use for enroll the courses which we want to take
		
		do{
		System.out.print("Enter Enrolled Course for tution: (Q to Quit):");
		Scanner in=new Scanner(System.in);
		 String course = in.nextLine();
		if(!course.equalsIgnoreCase("Q"))
		{
			courses =courses+" \n"+course;//"\n"+course;// courses+"\n"+course;
			//courses=course+"\n"+courses;
			
			NoofCourses++;
			tutionBalance=tutionBalance +costOfCourse;
			
		}
		else {
			//System.out.println("BREAK");
			
			break;
			}
		}
		while(courseCode != 0);
		
		
	}
	public void viewBalance()

	{
		System.out.println("Your Tuition Fee Is : " +tutionBalance);
	}
	
	public void payTution(int payment)
	{
		viewBalance();
		System.out.print("Pay tuition fee: ");
		Scanner in=new Scanner(System.in);
		int payment1 =in.nextInt();
		tutionBalance=tutionBalance-payment1;
		System.out.println(("THANK YOU FOR Paying:  "+payment1));
		viewBalance();
	}
	
	public String show(){
		return  "\n************************"+""+ 
	            "\nShow Status: "+"\n************************"+
	            "\nName:" +firstName1 +" "+lastName+
				"\ncourseCode : "+courseCode +
				"\nStudentID   :  "+studentID+
				"\ncourses Enrolled :"+NoofCourses+"\nEnrolled courses are: "+courses+"\nYour Remaining tution fees is: "+tutionBalance+
				"\n************************";
				
	}
}
