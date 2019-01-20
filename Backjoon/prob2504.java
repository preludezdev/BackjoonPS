import java.io.*;
import java.util.*;

public class prob2504 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();

		String input = br.readLine();		
		
		result.append(getSum(input));
		bw.write(result.toString());		
		bw.flush();
		bw.close();
	}
	
	public static String getSum(String input) {
		Stack<Character> stack = new Stack<>();
		int sum = 0;
		int cof = 1;
		
		for(int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			switch(a) {
				case '(' :
					stack.push(a);
					cof = cof * 2;
					break;
				case '[' :
					stack.push(a);
					cof = cof * 3;
					break;
				case ')' :
					if(stack.isEmpty()) return "0";
						
					if(input.charAt(i-1) == '(')  
						sum = sum + cof;
					
					if(stack.peek() =='(') 
						stack.pop();
					
					cof = cof / 2;
					break;
				case ']' :
					if(stack.isEmpty()) return "0";
										
					if(input.charAt(i-1) == '[') 
						sum = sum + cof;
					
					if(stack.peek() =='[') 
						stack.pop();
					
					cof = cof / 3;
					break;
			}
		}
		
		return stack.isEmpty() ? sum + "" : "0";
	}
}

