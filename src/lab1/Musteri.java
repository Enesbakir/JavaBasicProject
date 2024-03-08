package lab1;


public class Musteri {
	private String ad;
	private String soyad;
	private Siparis[] siparisler;
   
	public Musteri(String ad,String soyad) {
		this.ad = ad;
		this.soyad = soyad;	
        this.siparisler = new Siparis[3];
        for (int i = 0; i < 3; i++){
            siparisler[i] = new Siparis();
        }
	}
	
	public void siparisVer(int siparisNo,Urun urun) {
		siparisler[siparisNo].urunEkle(urun);
	}
	
	public void siparisBilgisi(int siparisNo) {
		 System.out.println(siparisler[siparisNo]);
	}
	public void tumSiparisler() {
		System.out.println(""+ ad + soyad + " isimli müþteriye ait sipariþ bilgileri:");
		
		for(int i=0;i<siparisler.length;i++) {
			System.out.println("" + i + "nolu sipariþe ait ürün bilgileri:");
			siparisler[i].urunleriGoster();
		}
	}
	
	public void kacSiparis(String urunAdý) {
		int miktarSayac=0;
		int siparisSayac=0;
        int n = siparisler.length;
        for (int i = 0; i < n; i++){
            for(Urun urun : siparisler[i].getUrunler()){
            	if (urun!= null)
                    if (urun.getAd().equals(urunAdý))
                    {
                        miktarSayac++;
                    }       
            }
        }
       System.out.println(""+siparisSayac+ " tane sipariþ içinde toplam "+ miktarSayac + "adet su sipariþ edilmiþ."); 
	}
    
	
	public void tumSiparislerdenUrunCikar(Urun urun) {
		for(int i=0; i < siparisler.length;i++) {
			siparisler[i].urunCikar(urun);
		}
	}
	
	public void urunCikar(int siparisNo,Urun urun) {
		siparisler[siparisNo].urunCikar(urun);
	}	
	
	public double getSiparisTutari(int siparisNo) {
		Urun[] urunler;
		double toplamTutar=0;
		urunler = siparisler[siparisNo].getUrunler();
		for(Urun urun : urunler) {
			if (urun != null)
			toplamTutar += urun.getFiyat();
		}
		
		return toplamTutar;
	}		
	
	
}
