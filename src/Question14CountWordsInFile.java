import java.io.*;
import java.util.*;

public class Question14CountWordsInFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("abc");
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String str=br.readLine();
		int count=0;
		StringTokenizer tokens;
		while(str!=null) {
			tokens=new StringTokenizer(str);
			count=count+tokens.countTokens();
			str=br.readLine();
		}
		System.out.println(count);
		br.close();
	}

}
