

public class String_method {

	public static void main(String[] args) {
	
		String name = "barani"; 
		String n2=new String("Barani");
	
		
		
		System.out.println(name.isEmpty()); //checking empty or not
		System.out.println(name.isBlank()); //too checking blank or not
		System.out.println(name.toLowerCase());  //to convert any case to lower case
		System.out.println(name.toUpperCase()); //to convert any case to upper case
		System.out.println(name.compareTo(n2)); // to compare string and return int value
		int a = name.compareTo(n2);
		System.out.println(a);
		System.out.println(name.equals(n2)); // to compare string and return bool value
		System.out.println(name.equalsIgnoreCase(n2)); // to compare string and return bool value but here skip case sensitive
		System.out.println(name.charAt(0));// this is use to give index value of string.
		
		for(int i = 0; name.length()>i;i++) {			
			System.out.println(name.charAt(i));			
		}
				
		System.out.println(name.codePointAt(0)); // this is use to give unicode value of string
		
		for(int i = 0; name.length()>i;i++) {
			System.out.print(name.charAt(i)+"-");
			System.out.println(name.codePointAt(i));	}
		
		
		
	}

}
