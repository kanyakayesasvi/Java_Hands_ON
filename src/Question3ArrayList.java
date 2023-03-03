import java.util.*;

class OwnDs<T> {
	T[] ar;
	int size;
	OwnDs(T[] ar23,int sizee) {
		this.ar=ar23;
		this.size=sizee;
	}
	
	
//	System.out.println(arnew.length);
	 void add(int idx,T ele) {
		 T[] arnew=(T[])new Object[size+1];
//		 System.out.println("Size "+size);
//		 System.out.println(arnew.length);
		for(int i=ar.length-1;i>=idx;i--) {
			arnew[i+1]=ar[i];
		}
		arnew[idx]=ele;
		for(int i=idx-1;i>=0;i--) {
			arnew[i]=ar[i];
		}
//		display(arnew);
		ar=arnew;
	}
	 
	 
	 void delete(T ele) {
		int k=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i].equals(ele)) {
				k=i;
			}
		}
		for(int i=k;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
//		display( Arrays.copyOf(ar, ar.length-1) );
		ar=Arrays.copyOf(ar, ar.length-1);
	}
	 
	 
	void display() {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}
public class Question3ArrayList {

	public static void main(String[] args) throws Exception{
		Object[] ar1= {1,264,5,265,24,72,6,2,4};
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+" ");
//		}
		OwnDs od=new OwnDs(ar1,ar1.length);
		od.display();
		
		System.out.println("After add : ");
		try {
			od.add(0, 45);
			od.display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("After delete : ");
		try {
			od.delete(4);
			od.display();
		}
		catch(Exception e) {
			
		}
		
		
		System.out.println("---------------------------------------");
		Object[] ar2= {"TNBK","Yesasvi","yeshu"};
		OwnDs od2=new OwnDs(ar2,ar2.length);
		
		od2.display();
		System.out.println("After add :");
		try {
			od2.add(3,"naga");
			od2.display();
		}
		catch(Exception e) {
			
		}
		System.out.println("After delete : ");
		try {
			od2.delete("naga");
			od2.display();
		}
		catch(Exception e) {
			
		}
		
	}

	

}
