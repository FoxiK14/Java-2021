import java.util.ArrayList;
import java.util.List;

public class Zadanie5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>(List.of(1,4,9,16));
		reverse(arrl1);
		System.out.println("Lista wynikowa to" + arrl1);
	}

	public static void reverse(ArrayList<Integer> a)
	{
		int sizearr = a.size();
		
		int counter = sizearr / 2 ;
		for(int i = 0 ; i < counter ; i++)
		{
			int arrp = a.get(i);
			int arrn = a.get(counter-i);
			a.set((counter-i),arrp);
			a.set(i,arrn);
		}	 		
	}
}
