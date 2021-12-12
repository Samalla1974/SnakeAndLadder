public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int position=0;
		int d=0;
		int player=0;
		int option=0;
		
		d = (int)(Math.random()*6) + 1;
		System.out.println("your die number is " + d);
		while (position == 100)
		{
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
			position=position+0;
			System.out.println ("player = " +position);
		}
		else if(option == 2)
		{
			position=position+d;
			System.out.println ("player =" +position);
		}
		else
		{
			position=position-d;
			System.out.println("player =" +position);
		}
		position ++;
		}

	}
}
