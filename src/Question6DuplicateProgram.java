import java.util.*;

public class Question6DuplicateProgram {
	static void remove(List<String> str,String s) {
		str.remove(str.indexOf(s));
	}
	public static void main(String[] args) {
		Employee e1=new Employee(1,"TNBK",8501871096l);
		Employee e2=new Employee(2,"YESASVI",8501871096l);
		Employee e3=new Employee(1,"TNBK",8501871096l);
		Employee e4=new Employee(4,"PRIYANKA",8501871096l);
		Employee e5=new Employee(5,"yeshu",8501871097l);
		Employee e6=new Employee(5,"yeshu",8501871097l);
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		HashSet<Employee> mp=new HashSet<>();
		for(Employee e:list) {
			mp.add(e);
		}
		for(Employee e:mp)
			System.out.println(e);
	}

}
