package a1_constructor;

public class Constructor {

	String name;
	int marathimarks;
	int mathmarks;
	int Englishmarks;

	Constructor(String name,int marathimarks,int mathmarks,int Englishmarks){
		
		  this.name=name;
		  this.marathimarks=marathimarks;
		  this.mathmarks=mathmarks;
		  this.Englishmarks=Englishmarks;
		
		  System.out.println(this.name+": " +this.marathimarks+"    |"+" "+this.mathmarks+"|"+" "+this.Englishmarks);
		
	}

	public static void main(String[] args) {
	
		System.out.println("id.name"+":"+" marathimarks |"+"mathmarks |"+" Englishmarks|");
		
		System.out.println("------------------------------------------------------------");
		
		Constructor a=new Constructor("1.vijay",90,97,89);
		Constructor a1=new Constructor("2.Kaustubh",92,98,87);
		Constructor a2=new Constructor("3.Priyanka",91,94,89);
		Constructor a3=new Constructor("4.Prakash",87,97,89);
		Constructor a4=new Constructor("5.Krishna",80,97,84);
		

	}

}
