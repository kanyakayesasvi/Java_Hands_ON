import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

interface Sample{
	void display();
}
public class Question11DescendingOrderStream {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,9,2,5,3,4,23,45,76,99));
		List<Integer> listDo=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//sort=use to sort Comparator.reverseOrder=helps to sort in descending order 
		System.out.println(listDo);
		
			
	}

}
