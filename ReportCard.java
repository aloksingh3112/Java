import java.util.Scanner;

public class ReportCard {
	public static void main(String argv[]) {
		
		
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name = ");
		String name = scan.nextLine();
		
		System.out.print("Enter RollNo = ");
		int rollNo = scan.nextInt();
		
		
		System.out.print("Enter Course = ");
		String course =   scan.next();
	
		System.out.print("Enter ScienceMarks = ");
		Double scienceMarks=  scan.nextDouble();
		
		System.out.print("Enter EnglishMarks = ");
		Double englishMarks  =  scan.nextDouble();
	
		System.out.print("Enter MathMarks = ");
		Double mathMarks   = scan.nextDouble();
		System.out.println();
		
		
		
		
		
		StudentData ram = new StudentData(rollNo,name,course,scienceMarks,englishMarks,mathMarks);
		ram.calculation();
		ram.Display();
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
