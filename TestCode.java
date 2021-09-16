import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class TestCode 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String ch;
		System.out.println("Enter any line inserted quit...");
		//ch =(char) br.read();
		do {
		ch = br.readLine();
		System.out.println(ch);
		}while(!ch.equals("quit"));
		br.close();
	}
}
