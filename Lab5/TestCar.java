class TestCar
{
	public static void main(String[] args)
	{
		Car samochod=new Car(6);
		
		
		System.out.println("Samochód przejechał");
		samochod.przejedzOdleglosc(200);
		System.out.println(samochod.getOdleglosc()+" km");
		samochod.zatankujbenzyne(30);
		System.out.println("Zatankowano");
		System.out.println(samochod.getIlosc_Benzyny()+" l");
	//	System.out.println("Spalanie wynosi"+ samochod.toString());


	}

	public static class Car
	{
		private int odleglosc;
		private int ilosc_benzyny;
		private int spalanie;

		public Car(int spalanie)
		{
			this.spalanie=spalanie;
		}

		public void przejedzOdleglosc(int odleglosc)
		{
			this.odleglosc=0+odleglosc;
		
		}

		public void zatankujbenzyne(int ilosc_benzyny)
		{
			this.ilosc_benzyny=0+ilosc_benzyny;
		}

		public int getOdleglosc()
		{
			return odleglosc;
		}
		
		public int getIlosc_Benzyny()
		{
			return ilosc_benzyny;
		}

		

	}
}
