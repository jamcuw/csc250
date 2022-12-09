package modolus1;

import java.util.Scanner;

public class mod1 {

	public static void main(String[] args) throws Exception{
		
		
		System.out.println("Please input an Integer 0-999 ");
		Scanner scan = new Scanner(System.in);
			int no = scan.nextInt();
			
		
			
			int temp = no;
			no = no/2;
			String str ="";
			while( temp !=0) {	
				int rem = temp % 2;
				str = rem + str;
				temp = temp /2;
			}
			System.out.println(str);
			}
}
	
				
	
		
