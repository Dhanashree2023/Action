package Assignment;

public class CharCount {

	public static void main(String[] args) {
		
		 String string = "Java Programming";    
	        int count = 0;    
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }          
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);  

	}

}
