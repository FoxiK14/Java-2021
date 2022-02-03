import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class Zadanie1_e
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj łańcuch główny");
		String str = input.next();

		while(true)
		{
			System.out.println("Podaj łańcuch do wyszukania");
			String subStr = input.next();

			if(subStr.length() < str.length())
			{	
				input.close();
				int arr_lng = (int)Math.floor(str.length()/subStr.length());
					
				int[] arr = new int[str.length()];
				arr = where(str,subStr);
				int check1st = 0;

				for(int y = 0;y < arr_lng;y++)
				{	
					int arr_arg = arr[y];
					//System.out.printf("%d ",arr_arg);
					if(arr_arg == 0 && check1st == 1)
					{
						break;
					}

					else if(arr_arg == 0 && check1st == 0)
					{
						System.out.printf("%d ",arr_arg);
						check1st = 1;
					}

					else
					{
						System.out.printf("%d ",arr_arg);
					}
				}
				System.out.println("");
				break;	
			}

			else
			{
				System.out.println("Łańcuch do wyszukania nie może być dłuższy od łańcucha głównego");
			}
		}
	}

	public static int[] where(String str,String subStr)
	{
		int str_lng = str.length();
		int subStr_lng = subStr.length();
		int arr_lng = (int)Math.floor(str_lng/subStr_lng);
		int[] arr = new int[str_lng];
		int m = 0;

		for(int y = 0;y < (str_lng-subStr_lng+1);y++)
		{
			if(subStr.equals(str.substring((y),(subStr_lng+y))))
			{
				arr[m] = y;
				m++;
			}	
		}

		return arr;	
	}
}
