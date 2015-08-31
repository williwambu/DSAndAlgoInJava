import java.io.*;
/*
 * Uses the Reverser class to reverse words
 */
public class ReverseApp {
	public static void main(String args []) throws IOException{
		String input, output;
		
		while(true){
			System.out.print("Enter a String: ");
			
			System.out.flush();
			input = getString();
			
			if(input.equals("")){
				break;
			}
			
			//Reverse the String
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();
			
			System.out.println("Reversed " + output);
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
