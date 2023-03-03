import java.util.*;
public class Question12CountVowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.next();
		ArrayList<Character> Vowels=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			Vowels.add(s.charAt(i));
		}
		
		long count=Vowels.stream().filter(x->x=='a'||x=='e'||x=='i'||x=='o'||x=='u').count();
		
		System.out.println("Number of Vowels in String: "+count);
		
		sc.close();
	}
}