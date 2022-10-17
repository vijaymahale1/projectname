package Encapsulation;

public class Student {
	
	
	private int Rollno;   // data hiding
	
	public void setrollno(int rollno) {
		
		this.Rollno=rollno;
	}
   
	public int getRollno() {
		
		return Rollno;
		
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.setrollno(200);
		
		System.out.println(s.getRollno());

	}

}
