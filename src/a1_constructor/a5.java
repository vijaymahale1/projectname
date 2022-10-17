package a1_constructor;

public class a5 {
   
	
	String name;
	int mathmarks;
	int englishmarks;
	int sciencemarks;
	int marathimarks;
	
	a5(String name,int mathmarks,int englishmarks,int sciencemarks,int marahthimarks){
	
		
	this.name=name;
	this.mathmarks=mathmarks;
	this.englishmarks=englishmarks;
	this.sciencemarks=sciencemarks;
	this.marathimarks=marathimarks;

	}
	
	public static void main(String[] args) {
		
		
		System.out.println("name  |"+" mathmarks |"+"englishmarks|"+"sciencemarks|"+"marathimarks");

		
		a5 a=new a5("vijay" ,70,60,50,80);
		a5 a1=new a5("kaustubh",60,70,80,75);
		a5 a2=new a5("priyanka",70,65,45,80);
		a5 a3=new a5("krishana",60,70,65,30);
		a5 a4=new a5("praksh",70,75,80,95);

	}

}
