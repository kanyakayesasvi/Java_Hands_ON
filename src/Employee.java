import java.util.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	long contactNumber;
	Employee(int id,String name,long cN){
		this.id=id;
		this.name=name;
		this.contactNumber=cN;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return Objects.equals(this.id, other.id) ;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ContactNumber=" + contactNumber + "]";
	}
	
	@Override 
	public int compareTo(Employee o)
    {
        if (this.id > o.id) {
 
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.id < o.id) {
 
            // if current object is greater,then return -1
            return -1;
        }
        else {
 
            // if current object is equal to o,then return 0
            return 0;
        }
    }
	
}