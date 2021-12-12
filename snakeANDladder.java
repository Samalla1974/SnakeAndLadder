public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int position=0;
		int d;
		int player=0;
		int option;
		
		d = (int)(Math.random()*6) + 1;
		System.out.println("your die number is " + d);

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
	}

	if(option == 1)
	{
		player=player+0;
		System.out.println ("player = " +player);
	}
	else if(option == 2)
	{
		player=player+d;
		System.out.println ("player =" +player);
	}
	else
	{
		player=player-d;
		System.out.println("player =" +player);
		
	}

	}
}
