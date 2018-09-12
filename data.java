import java.util.Scanner;
import java.io.*;
public class data
{
	public static void main(String args[])
	{
		File f = new File("/home/shobhit/Desktop/data.txt");
		try
		{
			FileOutputStream fout = new FileOutputStream(f);
			String s = " C:/Users/Video/abc.mp4\nC:/Users/Video/def.mp4\nC:/Users/Video/ghi.mp4\nC:/Users/Video/jkl.mp4";

			char ch[] = s.toCharArray();
			for(int i = 0; i < s.length(); i++)
			{
				fout.write(ch[i]);
			}
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(" "+e);
		}

		try
		{

			FileInputStream fin = new FileInputStream(f);
			Scanner inFile = new Scanner(fin);
			int i;
			while(inFile.hasNextLine())
			{
				System.out.println(inFile.nextLine());
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(" "+e);
		}
	}
}
