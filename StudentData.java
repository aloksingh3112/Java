
public class StudentData {

	private int rollNo;
	private String name;
	private String course;
	private Double  scienceMarks;
	private Double englishMarks;
	private Double  mathMarks;
	private Double totalMarks  ;
	private char grade;
	private double percentage;
	
	
	public StudentData( int rollNo,String name , String course,double scienceMarks, Double englishMarks,  Double mathMarks) {
		this(scienceMarks,englishMarks,mathMarks);
		this.name=name;
		this.course=course;
		this.rollNo=rollNo;
		
		
		
		
	}
	
	public StudentData(double scienceMarks, Double englishMarks,  Double mathMarks) {
		this.scienceMarks=scienceMarks;
		this.englishMarks=englishMarks;
		this.mathMarks=mathMarks;
		
	}
	public void Display() {
		
		System.out.printf("Name =%s\tRollno=%d\tCourse=%s\n",name,rollNo,course);
		System.out.println();
		
		System.out.printf("Subjects \t\t Marks\n");
		System.out.printf("Science \t\t %.1f\n",scienceMarks);
		System.out.printf("English \t\t %.1f\n",englishMarks);
		System.out.printf("Maths   \t\t %.1f\n",mathMarks);
		System.out.println();
		System.out.printf("Total Marks \t\t %.1f\n",totalMarks);
		
		System.out.printf("Percentage=%.1f\t\tGrade=%c\n",percentage,grade);
		
		
		
		
}
	
	
	
	
	
	public void calculation() {
		totalMarks=scienceMarks+englishMarks+mathMarks;
		percentage=totalMarks/3;
		if(percentage>=90&&percentage<=100) {
			grade='A';
			
		}
		else if(percentage>=80 && percentage<=90) {
			grade='B';
		}
		else if(percentage>=70 && percentage<=80) {
			grade='c';
		}
		else if(percentage>=60 && percentage<=70) {
			grade='B';
		}
		else {
			grade='D';
			
		}
		
		
		
}

	
	
	
	
}
