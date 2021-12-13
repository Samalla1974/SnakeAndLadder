public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int Playerposition=0;
		int d=0;
		int option=0;
		int player=0;
		int no_of_times_dice=0;
		int i=0;
		int position=0;

		for(Playerposition=0;Playerposition == 100;Playerposition++)
		{
			d = (int)(Math.random()*6) + 1;
			System.out.println("your die number is " + d);
			 i=i+1;
                        System.out.println("no of times the die rolls:" +i);

			option = (int)(Math.random()*3) + 1;
			switch(option)
			{
			case 1:
			System.out.println ("noplay");
			break;
			case 2:
			System.out.println ("ladder");
			break;
			case 3:
			System.out.println ("snake");
			default:

			if(option == 1)
			{
			Playerposition=Playerposition+0;
			System.out.println ("player = " + Playerposition);
			}
			else if(option == 2)
			{
			Playerposition=Playerposition+d;
			System.out.println ("player =" + Playerposition);
			}
			else
			{
			Playerposition=Playerposition-d;
			System.out.println("player =" + Playerposition);
			}

			if( Playerposition > 100 )
                        {
                        Playerposition=Playerposition-d;
                        System.out.println("player:" + Playerposition);
                        }
                        else
                        {
                        Playerposition=d;
                        System.out.println("player:" + Playerposition);
                        }

			}
		}
		System.out.println(" Winner ");
	}
}
