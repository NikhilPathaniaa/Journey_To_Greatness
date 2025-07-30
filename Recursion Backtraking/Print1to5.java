package recurisonBacktracking;

public class Print1to5 {

	public static void main(String[] args) {
		int num = 5;
		print(num);
	}
	
	public static int print(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		System.out.print(num+" ");
		return print(num-1);
				
	}

}
