package SDJ_Prog;

public class CompareLog2 
{
	public static int main(String[] args) 
	{
		ReadLog.main(1);
		int windef[][]= new int[ReadLog.winarr2nd.length][9];

		//copying winarr2nd to windef
		for(int i=0;i<windef.length;i++)
		{	
			for(int j=0;j<9;j++)
			{
				windef[i][j]=ReadLog.winarr2nd[i][j];
			}
		}
		int k=1;
	
		//finding the most popular element
				int popular=-1;
				int max=0;
				
				for(int j=0;j<k;j++)
				{
					int pop=windef[j][SystemPlays1st.chance+1];
					int temp=0;
					for(int i=0;i<windef.length;i++)
					{
						if(windef[i][SystemPlays1st.chance+1]==pop)
						{
							temp++;
						}
					}
					if(temp>max)
					{
						max=temp;
						popular=windef[j][SystemPlays1st.chance+1];
					}
				}
				
		//refining the windef array
				k=0;
		for(int j=0;j<windef.length;j++)
		{
			if(CrosNots.game[windef[j][SystemPlays1st.chance+1]]==1)
			{
				for(int i=0;i<9;i++)
				{
					windef[k][i]=windef[j][i];
				}
				k++;
			}
		}
		
		return popular;
	}
}


