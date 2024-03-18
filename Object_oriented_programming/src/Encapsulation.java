import java.util.Scanner;



public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Encap ec = new Encap();

        System.out.print("Enter your name: ");
        ec.setname(sc.nextLine());
        
        System.out.println("enter current year");        
       double year=sc.nextDouble();
        
        System.out.print("Enter your year: ");
        ec.setDob(sc.nextDouble());    
         year=year-ec.getDOb();
        System.out.println("\nUser Data:");
        System.out.println("Name: " + ec.getname());        
        System.out.println("Age: "+ year );
        
        
        
        sc.close();
		
	
		
	}

}



