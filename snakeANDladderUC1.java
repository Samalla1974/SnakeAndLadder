public class snakeANDladderUC1
{
	public static void main(String[] args)
	{
		int i,die;
		for(i=0;i<=100;i++)
		{
			die = (int)(Math.random()*6) + 1;
			System.out.println("your die number is " + die);
			i = die; 
		}
	}
}
