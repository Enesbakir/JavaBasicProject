package lab1;



public class Urun{
	
	private int ID;
	private String ad;
	private double fiyat;
	private static int zamSayisi;
	
	
	public Urun(int ID, String ad,double fiyat) {
		this.ID= ID;
		this.ad=ad;
		this.fiyat=fiyat;
	}
	
	public String getAd() {
		return ad;
	}
	
	public int getID() {
		return ID;
	}
	public double getFiyat() {
		return fiyat;
	}	
	
	public void setAd(String ad) {
		this.ad=ad;
	}	
	
	public void zamYap(double zamOraný) {
		this.fiyat += (this.fiyat * (zamOraný));
		zamSayisi++;
	}
	
	public static int getZamSayisi() {
		return zamSayisi;
	}
	 @Override
	 public String toString() {
		 return "Urun [" + "id =" + ID + ",ad=" + ad + ",fiyat=" + fiyat + ']';
    }
	
}


