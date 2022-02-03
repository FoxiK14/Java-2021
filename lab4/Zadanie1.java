import java.util.ArrayList;
import java.util.List;


public class Zadanie1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>(List.of(1,4,9,16));
		ArrayList<Integer> arrl2 = new ArrayList<>(List.of(9,7,4,9,11));
		System.out.println("Lista wynikowa to" + append(arrl1,arrl2));
	}

	public static ArrayList<Integer> append(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		ArrayList<Integer> arrl3 = new ArrayList<>(a);
		int index = 0;
		int sizeb = b.size();
		int c;
		while(index < sizeb)
		{	
			c = b.get(index);
			arrl3.add(c);
			index++;
		}
		return arrl3; 		
	}
}
