
public class bugspotter {
	

	public static void main(String[] args) {
		int a=50;
		int b=80;
		
	// Arithmetic Operators =+,-,*,/,%
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
        System.out.println(a%b);
        
     // Relational Operators   >, <,>=,<=,==,!=
        
        System.out.println(a>b); // T
        System.out.println(a<b); // F
        System.out.println(a>=b);// T
        System.out.println(a<=b); //F
        System.out.println(a==b); // F
        System.out.println(a!=b); // T
        
        // Logical Operators ---&& || !(Statement)
        
        //---&&(AND)
        
        System.out.println(a>b && a<b); //T && F  --->F
        System.out.println(a>b && a>=b); // T && T -->T
        System.out.println(a<b && a>b);  // F && T -->F
        System.out.println(a<b && a==b); // F && F -->F
        
        // -----||(OR) CASE
        
        System.out.println(a>b || a<b); //T && F  --->T
        System.out.println(a>b || a>=b); // T && T -->T
        System.out.println(a<b || a>b);  // F && T -->T
        System.out.println(a<b || a==b); // F && F -->F
        
        //-------!(Statement)
        
        System.out.println(!(a>b));// !(T)  --->F
        System.out.println(!(a==b)); // !(F) --->T
        
        
        
	}

}
