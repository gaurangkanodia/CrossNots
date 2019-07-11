package SDJ_Prog;

import java.util.Scanner;

public class SystemPlays1st extends CrosNots
{
	//make a different comparelog class.
	static int chance=-1;
	static Scanner sc = new Scanner(System.in);
	private static String[] args;
	
	public static void main(String[] args) 
	{
		
		for(int i=0;i<5;i++)
		{
			
			int check=0;
			
			//we check if will win
			check= CheckWin.main();
			
			if(check!=-1&&game[check]==0)
			{
				game[check]=1;
				System.out.println("The Computer plays at position= "+check);
				System.out.println("Computer wins");
				chance++;
				gamepos[chance]=check;
				WriteLog.main(1);
				break;
			}
			
			
			//to stop from losing 
			check=CheckLose.main();
			
			if(check!=-1&&game[check]==0)
			{
				game[check]=1;
				System.out.println("The Computer plays at position= "+check);
				chance++;
				gamepos[chance]=check;
			}
			
			//to check from log file
			else if((check=CompareLog2.main(args))!=-1)
			{
				if(game[check]==0)
				{
					
					game[check]=1;
					System.out.println("The Computer plays at position= "+check);
					chance++;
					gamepos[chance]=check;
				}
				else
				{
					check=-99;
				}
			}
			
			if(check==-99)
			{
				while(gamepos[8]==0)
				{
					check=(int)(Math.random()*8);
					if(game[check]==0)
					{
						game[check]=1;
						System.out.println("The Computer plays at position= "+check);
						chance++;
						gamepos[chance]=check;
						break;
						
					}
				}
			}
					
			
			//to check for draw
			if(gamepos[8]!=0)
			{
				System.out.println("Its a draw.");
				break;
			}
			if(getchance()==-1)
			{
				break;
			}
		}
	}
	static int ch;
	public static void getMove()
	{
		System.out.println("Enter your position :-");
		ch = sc.nextInt();
		if(ch>8||ch<0)
		{
			System.out.println("Please input moves from between 0 to 8");
			getMove();
		}
	
	}
	
	public static int getchance()
	{
		
			getMove();
			
			//player plays
			if(game[ch]==0)
			{
				game[ch]=2;
				chance++;
				gamepos[chance]=ch;
				
			}
			else 
			{
				System.out.println("Wrong Entry.\n");
				getchance();
				
			}
						
			//to check if the computer lost.
			int check=CheckLost.main(args);
			if(check==-1)
			{
				System.out.println("You win! ;-;");
				WriteLog.main(2);
				return -1;
			}
			return 0;
		
	}
}


