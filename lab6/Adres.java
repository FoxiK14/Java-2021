
public class Adres
	{
		private String ulica;
		private int numer_domu;
		private int numer_mieszkania;
		private String miasto;
		private String kod_pocztowy;

		public Adres(String ulica,int numer_domu,int numer_mieszkania,String kod_pocztowy,String miasto)
		{
			this.ulica=ulica;
			this.numer_domu=numer_domu;
			this.numer_mieszkania=numer_mieszkania;
			this.kod_pocztowy=kod_pocztowy;
			this.miasto=miasto;
		}

		public Adres(String ulica,int numer_domu,String kod_pocztowy,String miasto)
		{
			this.ulica=ulica;
			this.numer_domu=numer_domu;
			this.kod_pocztowy=kod_pocztowy;
			this.miasto=miasto;
		}

		public void pokaz(String kod_pocztowy,String miasto,String ulica, int numer_domu,int numer_mieszkania)
		{
			System.out.printf("%s "+"%s\n",kod_pocztowy,miasto);
			System.out.printf("%s "+"%d"+"m%d",ulica,numer_domu,numer_mieszkania);

		}




		public String getUlica()
		{
			return ulica;
		}

		public int getNumerDomu()
		{
			return numer_domu;
		}

		public int getNumerMieszkania()
		{
			return numer_mieszkania;
		}

		public String getKodPocztowy()
		{
			return kod_pocztowy;
		}

		public String getMiasto()
		{
			return miasto;
		}



	}
