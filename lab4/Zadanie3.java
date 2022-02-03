import java.util.ArrayList;
import java.util.List;

public class Zadanie3
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>(List.of(1,4,9,16));
		ArrayList<Integer> arrl2 = new ArrayList<>(List.of(9,7,4,9,11));
		System.out.println("Lista wynikowa to" + mergeSorted(arrl1,arrl2));
	}

	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		ArrayList<Integer> arrl3 = new ArrayList<>(a);
		for(int arg : b)
		{
			arrl3.add(arg);
		}
		
		int sizearrl3 = arrl3.size();

		for(int i = 0 ; i < sizearrl3; i++)
		{
			for(int m = i+1 ; m < sizearrl3; m++)
			{	
				int argp = arrl3.get(i);
				int argn = arrl3.get(m);
				
				if(argp >= argn)
				{
					arrl3.set(m,argp);
					arrl3.set(i,argn);
				}	
			}	
		}

		return arrl3;
	}
}
