import java.util.*;

public class Question10startingstreamfunction {
	static char firstLetter(int x) {
		String st=""+x;
		return st.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> in=new ArrayList<Integer>(Arrays.asList(8295,12373,673884,3671,1624,646,26,6785));
			in.stream().filter(c->firstLetter(c)==('6')).forEach(x->System.out.println(x));
	}

}
