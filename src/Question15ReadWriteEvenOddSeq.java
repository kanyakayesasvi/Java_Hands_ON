import java.io.*;
import java.util.*;
public class Question15ReadWriteEvenOddSeq {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File if1=new File("file1");
		File if2=new File("file2");
		File outf=new File("output");
		
		BufferedReader buffread1=new BufferedReader(new FileReader(if1));
		BufferedReader buffread2=new BufferedReader(new FileReader(if2));
		BufferedWriter buffwrite=new BufferedWriter(new FileWriter(outf));
		
		String String1=buffread1.readLine();
		List<String> list=new ArrayList<String>();
		
		while(String1!=null) {
			list.add(String1);
			String1=buffread1.readLine();
		}
		
		String String2=buffread2.readLine();
		
		List<String> list1=new ArrayList<String>();
		
		while(String2!=null) {
			list1.add(String2);
			String2=buffread2.readLine();
		}
		
		int i=0,j=0;
		int S1=list.size();
		int S2=list1.size();
		
		StringBuilder strbuild=new StringBuilder();
		
		while(i<S1 && j<S2) {
			strbuild.append(list.get(i++)+"\n");
			strbuild.append(list1.get(j++)+"\n");
		}
		
		if(j>=S2) {
			while(i<S1)
			{
				strbuild.append(list.get(i++)+"\n");
			}
		}
		if(i>=S1) {
			while(j<S2)
			{
				strbuild.append(list1.get(j++)+"\n");
			}
		}
		
		buffwrite.append(strbuild);
		buffread1.close();
		buffread2.close();
		//System.out.println("check the file");
		buffwrite.close();
	}
}




