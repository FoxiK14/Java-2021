import java.util.ArrayList;
import java.util.List;

public class Zadanie2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>(List.of(1,4,9,16));
		ArrayList<Integer> arrl2 = new ArrayList<>(List.of(9,7,4,9,11));
		System.out.println("Lista wynikowa to" + merge(arrl1,arrl2));
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		ArrayList<Integer> arrl3 = new ArrayList<>();
		int sizeb = b.size();
		int sizea = a.size();
		
		if(sizea >= sizeb)
		{
			for(int i = 0 ; i < sizeb ; i++)
			{
				arrl3.add(a.get(i));	
				arrl3.add(b.get(i));
			}
			
			if(sizea > sizeb)
			{
				int diff = sizea - sizeb;
				for(int i = 0 ; i < diff ; i++)
				{
					arrl3.add(a.get(sizeb+i));
				}
			}	
		}

		else
		{
		
			for(int i = 0 ; i < sizea ; i++)
			{
				arrl3.add(a.get(i));	
				arrl3.add(b.get(i));
			}
			
			int diff = sizeb - sizea;
			for(int i = 0 ; i < diff ; i++)
			{
				arrl3.add(b.get(sizea+i));
			}	
		}

		return arrl3; 		
	}
}
