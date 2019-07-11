package SDJ_Prog;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLog 
{
	static int winarr2nd[][]=null;
	
	public static void main(int who) 
	{
		File f1= null;
		FileReader fr= null;
		StringBuffer whole= new StringBuffer();
		String wins[];
		
		
		try
		{
			if(who==2)
				f1 = new File("D:\\play2nd.txt");
			else 
				f1 = new File("D:\\play1st.txt");
				
			fr= new FileReader(f1);
			
			//reading the file
			int ch=0;
			while((ch=fr.read())!=-1)
			{
				whole.append((char)ch);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//splitting the games 
		wins=(whole.toString()).split("!");
			
		
		//splitting the chances into array winarr2ndst
		long rem=0;
		winarr2nd= new int[wins.length][9];
		long tem=0,tem2=0;
		for(int i=0;i<wins.length;i++)
		{
			rem= Long.parseLong(wins[i]);
			int pow=wins[i].length();
			for(int j=0;j<9;j++,pow--)
			{	
				if(pow<=0)
					break;
				
				tem2=(long)Math.pow(10,(pow-1));
				tem= (rem/(tem2));
				rem=rem%tem2;
				winarr2nd[i][j]=(int)(tem-1);
			}
		}
	}

}
