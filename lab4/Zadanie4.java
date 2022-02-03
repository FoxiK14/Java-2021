import java.util.ArrayList;
import java.util.List;

public class Zadanie4
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>(List.of(1,4,9,16));
		System.out.println("Lista wynikowa to" + reversed(arrl1));
	}

	public static ArrayList<Integer> reversed(ArrayList<Integer> a)
	{
		ArrayList<Integer> arrl3 = new ArrayList<>(a);
		int size3arr = arrl3.size();
		
		int counter = size3arr / 2 ;
		for(int i = 0 ; i < counter ; i++)
		{
			int arrp = arrl3.get(i);
			int arrn = arrl3.get(counter-i);
			arrl3.set((counter-i),arrp);
			arrl3.set(i,arrn);
		}	
		return arrl3; 		
	}
}
