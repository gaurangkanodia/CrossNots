package SDJ_Prog;

public class CrosNots {

	static int j, k=0,h=0;
static long rem,n,c1,c2;
	static int[] game= new int[9];
	static int[] gamepos= new int[9];
	
	public static void main(String[] args) 
	{

		if((int)System.currentTimeMillis()%2==0)
		//if(false)
		{
			
			SystemPlays1st.main(args);
			/*
			 
			 check if we will win. (Play accordingly)
			 *Update Log
			 OR
			 check if we will lose. (Play accordingly)
			 OR
			 check Log file. (Play accordingly)
			 
			 user plays
			 
			 Check to see if we lost.
			 *Update Log
			 
			 */
		}
		else
		{
			UserPlays1st.main(args);
			
			/*
			 
			 user plays
			 
			 Check to see if we lost.
			 *Update Log
			 
			 
			 check if we will win. (Play accordingly)
			 *Update Log
			 OR
			 check if we will lose. (Play accordingly)
			 OR
			 check Log file. (Play accordingly)
			 
			 
			 */
		}
	}
}
	
