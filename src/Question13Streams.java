import java.util.*;

class Employe{
	String name;
	String designation;
	long contactNumber;
	String department;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", designation=" + designation + ", contactNumber=" + contactNumber
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	public Employe(String name, String designation, long contactNumber, String department, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.contactNumber = contactNumber;
		this.department = department;
		this.salary = salary;
	}
	
}
public class Question13Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1=new Employe("TNBK", "TL", 9966795977l, "Developement", 1600000);
		Employe e2=new Employe("yesasvi", "HR", 9966795977l, "HR", 9000);
		Employe e3=new Employe("Teluguntla", "SDE", 9966795977l, "Developement", 1200000);
		List<Employe> list=new ArrayList<Employe>();
		list.add(e1);list.add(e2);list.add(e3);
		Map<String,List<Employe>> map=new HashMap<>();
		departmentSort(map,list);
		System.out.println("Department vise employees");
		for(Map.Entry<String, List<Employe>> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println("List of employees with salary more than 10k");
		list.stream().filter(x->x.salary>100000).forEach(x->System.out.println(x));
	}

	private static void departmentSort(Map<String, List<Employe>> map, List<Employe> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			String department=list.get(i).department;
			if(map.containsKey(department)) {
				map.get(department).add(list.get(i));
			}
			else {
				List<Employe> ar=new ArrayList<>();
				ar.add(list.get(i));
				map.put(department, ar);
			}
		}
	}

}
