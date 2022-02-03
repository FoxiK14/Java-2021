public class PointTestSet
{
	public static void main(String[] args)
	{
		Point p=new Point(3,4);
		p.setX(1);
		p.setY(3);
		p.setScaleX(0.5);
		p.setScaleY(0.5);
		System.out.print(p.getX()+"\n");
		System.out.print(p.getY());

	}

	public static class Point
	{
		private double x;
		private double y;

		public Point()
		{
			this.x=0;
			this.y=0;
		}

		public Point(double x,double y)
		{

		this.x=x;
		this.y=y;
		}

		public double getX()
		{
			return x;
		}

		public double getY()
		{
			return y;
		}

		public void setX(double dx)
		{
			this.x=x+dx;
			
		}

		public void setY(double dy)
		{
			this.y=y+dy;
		}

		public void setScaleX(double sx)
		{
			this.x=x*sx;
		}

		public void setScaleY(double sy)
		{
			this.y=y*sy;
		}




	}
}
