package SDJ_Prog;


public class CheckLose extends CrosNots
{
	public static int main() 
	{
		if(game[0]==2&&game[1]==2&&game[2]==0)
		{
			return 2;
		}
		else if(game[2]==2&&game[1]==2&&game[0]==0)
		{
			return 0;
		}
		else if(game[0]==2&&game[2]==2&&game[1]==0)
		{
			return 1;
		}
		
		else if(game[3]==2&&game[4]==2&&game[5]==0)
		{
			return 5;
		}else if(game[3]==2&&game[5]==2&&game[4]==0)
		{
			return 4;
		}else if(game[4]==2&&game[5]==2&&game[3]==0)
		{
			return 3;
		}
		
		else if(game[6]==2&&game[7]==2&&game[8]==0)
		{
			return 8;
		}else if(game[7]==2&&game[8]==2&&game[6]==0)
		{
			return 6;
		}else if(game[6]==2&&game[8]==2&&game[7]==0)
		{
			return 7;
		}
		
		else if(game[0]==2&&game[3]==2&&game[6]==0)
		{
			return 6;
		}else if(game[0]==2&&game[6]==2&&game[3]==0)
		{
			return 3;
		}else if(game[3]==2&&game[6]==2&&game[0]==0)
		{
			return 0;
		}
		
		else if(game[1]==2&&game[4]==2&&game[7]==0)
		{
			return 7;
		}else if(game[4]==2&&game[7]==2&&game[1]==0)
		{
			return 1;
		}else if(game[1]==2&&game[7]==2&&game[4]==0)
		{
			return 4;
		}
		
		
		else if(game[2]==2&&game[5]==2&&game[8]==0)
		{
			return 8;
		}
		else if(game[2]==2&&game[8]==2&&game[5]==0)
		{
			return 5;
		}
		else if(game[5]==2&&game[8]==2&&game[2]==0)
		{
			return 2;
		}
		
		
		else if(game[0]==2&&game[4]==2&&game[8]==0)
		{
			return 8;
		}else if(game[8]==2&&game[4]==2&&game[0]==0)
		{
			return 0;
		}else if(game[0]==2&&game[8]==2&&game[4]==0)
		{
			return 4;
		}
		
		
		else if(game[2]==2&&game[4]==2&&game[6]==0)
		{
			return 6;
		}else if(game[4]==2&&game[6]==2&&game[2]==0)
		{
			return 2;
		}else if(game[2]==2&&game[6]==2&&game[4]==0)
		{
			return 4;
		}
		else
		return -1;
		
	}
}

