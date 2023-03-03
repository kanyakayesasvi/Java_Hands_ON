import java.util.*;
import java.util.stream.Collectors;


public class Question7SameContactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Sai",8501871096l);
		Employee e2=new Employee(2,"Syeda",8501871096l);
		Employee e3=new Employee(3,"Mohan",8501873096l);
		Employee e4=new Employee(4,"Vishnu",8501871096l);
		Employee e5=new Employee(5,"Dara",8501871097l);
		Employee e6=new Employee(6,"Prudhvi",8501871097l);
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		Map<Long,Integer> hm=new HashMap<>();
		for(int i=0;i<list.size();i++) {
			Employee e=list.get(i);
			if(hm.containsKey(e.contactNumber)) {
				hm.put(e.contactNumber, hm.get(e.contactNumber)+1);	
			}
			else {
				hm.put(e.contactNumber, 1);
			}
		}
//		for(Map.Entry<Long,Integer> entry:hm.entrySet()){
//			if(entry.getValue()>1)
//				System.out.println(entry.getKey()+" count is "+entry.getValue());
//		}
//		list.stream().collect(Collectors.groupingBy(Employee::contactNumber));

		System.out.println(hm);
	}

}
