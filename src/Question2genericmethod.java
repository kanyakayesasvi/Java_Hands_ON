import java.text.*;
class Adder<T,S,B>
{
	T a;
	T b;
	
	
	T add(S a, B b)
	{
		Double sum = 0d;
		//return a + b;
		sum += Double.valueOf(a.toString());
		sum += Double.valueOf(b.toString());
		
		return (T)(String.valueOf(sum));
	}
}
public class Question2genericmethod {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Adder<String, Integer, Float> a = new Adder<>();
		System.out.println(a.add(10, 10.2f));
		
	}
}