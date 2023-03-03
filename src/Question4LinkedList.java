class node<T> {
	T Data;
	node<T> Next;
	
	node(T Data)
	{
		this.Data = Data;
		this.Next = null;
	}
}
class list<T> {
	node<T> Head;
	private int length = 0;
	list() { this.Head = null; }
	void add(T Data)
	{
		node<T> temp = new node<>(Data);
		
		if (this.Head == null) {
			Head = temp;
		}
		else {
			node<T> X = Head;
			while (X.Next != null) {
				X = X.Next;
			}
			X.Next = temp;
		}
		length++;
	}
	void remove(T key)
	{
		node<T> prev = new node<>(null);
		prev.Next = Head;
		node<T> Next = Head.Next;
		node<T> temp = Head;
		boolean exists = false;
		if (Head.Data == key) {
			Head = Head.Next;
			exists = true;
		}
		while (temp.Next != null) {
			if (String.valueOf(temp.Data).equals(
					String.valueOf(key))) {
				prev.Next = Next;
				exists = true;
				break;
			}
			prev = temp;
			temp = temp.Next;
			Next = temp.Next;
		}
		if (exists == false && String.valueOf(temp.Data).equals(String.valueOf(key))) {
			prev.Next = null;
			exists = true;
		}
		if (exists) {
			length--;
		}
		else {
			System.out.println("value not found");
		}
	}
	public String toString()
    {
        String S = "";
        node<T> X = Head;
        if (X == null)
            return "list is empty";
        while (X != null) {
            S += String.valueOf(X.Data) + " -> ";
            X = X.Next;
        }
        return S;
    }
}
public class Question4LinkedList {
	public static void main(String[] args)
	{
		list<Integer> list1 = new list<>();
		System.out.println("Integer LinkedList :");
		list1.add(26);
		list1.add(9);
		list1.add(2001);
		System.out.println("list after adding Data : ");
		System.out.println(list1);
		list1.remove(9);
		System.out.println("list after removing 2 :");
		System.out.println(list1);
		list<String> list2 = new list<>();
		System.out.println("\nString LinkedList : ");
		list2.add("TNBK");
		list2.add("YESASVI");
		System.out.println("list2 after adding hello and world :");
		System.out.println(list2);
	}
}