public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int Playerposition1=0,Playerposition2=0;
		int d=0;
		int option=0;
		int player=0;
		int no_of_times_dice=0;
		int i=0;
		int position=0;

		for (Playerposition1 = 0;Playerposition1 == 100;Playerposition1++)
		{
		for (Playerposition2 = 0;Playerposition2 == 100;Playerposition2++)
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
			position=position+0;
			System.out.println ("player = " + position);
			}
			else if(option == 2)
			{
			position = position+d;
			System.out.println ("player =" + position);

			}
			else
			{
			position= position-d;
			System.out.println("player =" + position);
			}

			if( position > 100 )
                        {
                        position=position-d;
                        System.out.println("player:" + position);
                        }
                        else
                        {
                        position=d;
                        System.out.println("player:" + position);
                        }
			}
			Playerposition1 = position;
		}
		System.out.println("Playerposition1 is  winner" +position);
			Playerposition2 = position;
		}
		System.out.println(" Playerposition2 is winner" +position);
	}
}
