
public class Arithematicoperation {

	public static void main(String[] args) {
		int a=60;
		int d=80;
	
		// Arithmetic  operators
		System.out.println(a+d);
        System.out.println(a-d);
        System.out.println(a*d);
        System.out.println(a/d);
        System.out.println(a%d);
        
        
        // Relational Operator
         
        System.out.println(a>d); // F
        System.out.println(a<d); // T
        System.out.println(a>=d); //F
        System.out.println(a<=d); // T
        System.out.println(a==d); // F
        System.out.println(a!=d); // T
        
        // Logical operators---> &&(and),||(OR),!(statement)
        
        
       //------------->&&(and)
        
        System.out.println(a>d && a<d); //F && T  --->F
        System.out.println(a>d && a>=d); // F && F -->F
        System.out.println(a<d && a>d);  // T && F -->F
        System.out.println(a<d && a==d); // F && F -->F
        
      //------------->||(OR)
        
        System.out.println(a>d || a<d); //F || T  --->T
        System.out.println(a>d || a>=d); // F || F -->F
        System.out.println(a<d || a>d);  // T ||  F -->T
        System.out.println(a<d || a==d); // T || F -->T
        
      //------------->!(statement)
        
        System.out.println(!(a>d)); // !(F)-----T
        System.out.println(!(a==d)); // !(F)----T
        
        
        
        
        
	} 

}
