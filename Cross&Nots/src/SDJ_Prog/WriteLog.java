package SDJ_Prog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLog 
{
	public static void main(int who) 
	{
		File f1;
		FileWriter fw = null;
		StringBuffer sb= new StringBuffer();
		
		for(int i=0;i<CrosNots.gamepos.length;i++)
		{
			sb.append((CrosNots.gamepos[i])+1);
		}
		sb.append("!");
		
		try
		{
			if(who==2)
			{	
				f1 = new File("D:\\play2nd.txt");
				fw= new FileWriter(f1,true);
				fw.write(sb.toString());
			}
			else
			{
				f1 = new File("D:\\play1st.txt");
				fw= new FileWriter(f1,true);
				fw.write(sb.toString());
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
				fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
