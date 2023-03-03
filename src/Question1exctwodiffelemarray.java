import java.util.*;


class GenericSwap<T>{
	T[] swap(T[] arr,int x,int y) {
		T var=arr[x];
		arr[x]=arr[y];
		arr[y]=var;
		return arr;
	}
}
public class Question1exctwodiffelemarray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Swapping Integer Array\n");
		Integer arr[]= {1,2,3,4,5,6};
		GenericSwap<Integer> integer_swap=new GenericSwap<>();
		System.out.println("before \n"+Arrays.toString(arr));
		System.out.println("after \n"+Arrays.toString(integer_swap.swap(arr, 0, 3)));
		
		
		System.out.println("\n\n\nSwaping String Array\n");
		String arr1[]= {"A1","A2","A3","A4","A5","A6"};
		GenericSwap<String> string_swap=new GenericSwap<>();
		System.out.println("before \n"+Arrays.toString(arr1));
		System.out.println("after \n"+Arrays.toString(string_swap.swap(arr1, 4, 2)));
	}
}