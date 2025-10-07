public class Fibonacci
{
	public static void  main(string[] args)
	{
		int n = 10;
		int first_term = 0;
		int second_term = 1;
		System.out.println("Fibonacci series upto" + n + "terms:");
		for(int i=0;i<n;i++)
		{
			int series = first_term + second_term;
			first_term = second_term;
			second_term = series;
			System.out.println(String.fomat("%d",series));
		}
	}
}

