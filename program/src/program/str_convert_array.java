package program;



public class str_convert_array {

	public static void main(String[] args) {
		
		String name ="barani";
		char Name[] = new char[name.length()];
		
		for(int i =0 ; name.length()>i;i++) {
			System.out.println(name.charAt(i));
			
		 Name[i]=name.charAt(i);
		}
		System.out.println(Name);
		
	}

}
