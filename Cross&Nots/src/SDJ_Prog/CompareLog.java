package SDJ_Prog;

public class CompareLog 
{
	public static int main(String[] args) 
	{
		ReadLog.main(2);
		int windef[][]= new int[ReadLog.winarr2nd.length][9];
		int k=0;
		for(int j=0;j<windef.length;j++)
		{
			if(CrosNots.game[windef[j][UserPlays1st.chance]]==2)
			{
				for(int i=0;i<9;i++)
				{
					windef[k][i]=windef[j][i];
				}
				k++;
			}
		}
		k=1;
		int popular=-1;
		int max=0;
		for(int j=0;j<k;j++)
		{
			int pop=windef[j][UserPlays1st.chance];
			int temp=0;
			for(int i=0;i<windef.length;i++)
			{
				if(windef[i][UserPlays1st.chance]==pop)
				{
					temp++;
				}
			}
			if(temp>max)
			{
				max=temp;
				popular=windef[j][UserPlays1st.chance];
			}
		}

		return popular;
	}
}


