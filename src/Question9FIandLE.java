import java.util.Scanner;
interface PrintSumOfDigits{
	void displaysum(int a,int b);
}
public class Question9FIandLE {
	public static void main(String[] args) {
		PrintSumOfDigits sum=(a,b)->{
			System.out.println(a+b);
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to add: ");
		sum.displaysum(sc.nextInt(), sc.nextInt());
		sc.close();
	}
}