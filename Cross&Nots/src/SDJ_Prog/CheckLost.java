package SDJ_Prog;

public class CheckLost
{
	public static int main(String[] args) 
	{
		
	if(((CrosNots.game[0]==2)&&(CrosNots.game[1]==2)&&(CrosNots.game[2]==2)||(CrosNots.game[0]==2)&&(CrosNots.game[3]==2)&&(CrosNots.game[6]==2)||
	    (CrosNots.game[6]==2)&&(CrosNots.game[7]==2)&&(CrosNots.game[8]==2)||(CrosNots.game[2]==2)&&(CrosNots.game[5]==2)&&(CrosNots.game[8]==2)||
	    (CrosNots.game[1]==2)&&(CrosNots.game[4]==2)&&(CrosNots.game[7]==2)||(CrosNots.game[3]==2)&&(CrosNots.game[4]==2)&&(CrosNots.game[5]==2)||
 	    (CrosNots.game[0]==2)&&(CrosNots.game[4]==2)&&(CrosNots.game[8]==2)||(CrosNots.game[2]==2)&&(CrosNots.game[4]==2)&&(CrosNots.game[6]==2)))
		{
			return -1;
		}
	else return 0;
	}

}
