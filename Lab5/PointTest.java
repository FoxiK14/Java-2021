public class PointTest
{
	public static void main(String[] args)
	{
		Point p=new Point(3,4).translate(1,3).scale(0.5);
		System.out.println("Wspolrzędne punktu p wynoszą x=:"+p.getX());
		System.out.println("y="+p.getY());
	}
	public static class Point
	{
		public Point(double x,double y)
		{
			this.x=x;
			this.y=y;
		}

		public Point()
		{
			this.x=0;
			this.y=0;
	
		}

		private double x;
		private double y;

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public Point translate(double dx,double dy)
	{
		return new Point(this.x+dx,this.y+dy);

	}

	public Point scale(double s)
	{
		return new Point(this.x*s,this.y*s);
	}



	}
		
}

