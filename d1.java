package j1;
import java.util.*;
public class d1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matthew, Mark, "
				+ "Luke, John, Peter, Timothy or Jude ");
		String s1=sc.nextLine();
		int i;
		int l = s1.length();
		char ch;
		int c=0;
		String s=s1.toLowerCase();
		for(i=0; i<l; i++)
			{
			ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			c++;
			}
		System.out.printf("The number of vowels in "+ s1 + " are " +c);
			} 
			
}
