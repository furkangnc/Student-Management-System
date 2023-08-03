import java.io.*;
import java.util.Scanner;

public class ogrenciIsleri {
	private int vize;
	private int finall;
	public ogrenciIsleri(int vize,int finall) {
		this.vize=vize;
		this.finall=finall;
	}
 
	 public void setvize(int vize) {
		 this.vize=vize;
	 }
	 
	 public int getvize() {
		 return vize;
	 }
	 
	 public void setfinall(int finall) {
		 this.finall=finall;
	 }
	 
	 public int getfinall() {
		 return finall;
	 }
	
	
	public static void main(String[] args) throws IOException{
		System.out.println("*****************************************");
		System.out.println("Kullanýcý adý:");
		Scanner gir = new Scanner(System.in); 
		String girilenKullanici = gir.next();
		System.out.println("Þifre:");
		String girilenSifre = gir.next();
		if(Giris.kayýtlýKullanýcý.equals(girilenKullanici) && Giris.kayýtlýKullanýcý.equals(girilenSifre))
		{
			System.out.println("\n***Giriþ yapýldý***\n");
		System.out.println("*****************************************");
		}
		else
		{
			System.out.println("*****************************************");
			System.out.println("\n***Giriþ izniniz yok***\n");
			System.exit(0);
		}
		int x=0;
		while(x!=5){
		System.out.println("        Öðrenci Ýþleri Otomasyonu        ");
		System.out.println("*****************************************");
		System.out.println("Ýþlem Seçiniz:");
		System.out.println("1 Öðrenci Listesi");
		System.out.println("2 Öðrenci Ýþlemleri");
		System.out.println("3 Öðretim Üyesi Listesi");
		System.out.println("4 Öðretim Üyesi Ýþlemleri");
		System.out.println("5 Çýkýþ");
		System.out.println("*****************************************");
		int secim;
		Scanner s= new Scanner(System.in);
		secim=s.nextInt();
		switch (secim) {
		case 1:{
			listeleme yeni=new listeleme();
			yeni.ogrencilisteleme();
		}
		break;
		case 2: {
		int y=0;
		while(y!=9){
		System.out.println("        Öðrenci Ýþleri Otomasyonu        ");
		System.out.println("*****************************************");
		System.out.println("Ýþlem Seçiniz:");
		System.out.println("1 Öðrenci Ekleme");
		System.out.println("2 Öðrenci Silme");
		System.out.println("3 Öðrenci Güncelleme");
		System.out.println("4 Öðrenciye Vize Notu Ekle");
		System.out.println("5 Öðrenciye Final Notu Ekle");
		System.out.println("6 Öðrencilerin Vize Notu Listele");
		System.out.println("7 Öðrencilerin Final Notu Listele");
		System.out.println("8 Öðrencilerin Ortalama Notunu Listele");
		System.out.println("9 Üst Menüye Dön");
		System.out.println("*****************************************");
		secim=s.nextInt();
		switch (secim) {
		case 1: {
			System.out.println("Öðrenci Adýný Girin:");
			Scanner a=new Scanner(System.in);
			String ad=a.nextLine();
			System.out.println("Öðrenci Soyadýný Girin:");
			Scanner b=new Scanner(System.in);
			String soyad=b.nextLine();
			System.out.println("Öðrenci Numarasýný Girin:");
			Scanner c=new Scanner(System.in);
			int no=c.nextInt();
			System.out.println("Öðrenci Bölümünü Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Öðrenci Sýnýfýný Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogrenci ogr =new ogrenci();
			ogr.ekleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(ad+" "+soyad+" Sisteme Eklenmiþtir.\n");
			System.out.println("*****************************************");
		}
		break;
		case 2: {
		System.out.println("Silmek Ýstediðiniz Öðrenci No Girin:");
		Scanner a=new Scanner(System.in);
		int no=a.nextInt();
		ogrenci ogr1 = new ogrenci();
		ogr1.silme(no);
		System.out.println("*****************************************");
		System.out.println(no+" No 'lu Öðrenci Silinmiþtir.");
		System.out.println("*****************************************");
		}
		break;
		case 3: {
			System.out.println("Guncellemek Ýstediðiniz Öðrenci No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			System.out.println("Guncellemek Ýstediðiniz Öðrenci Adýný Girin:");
			Scanner b=new Scanner(System.in);
			String ad=b.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðrenci Soyadýný Girin:");
			Scanner c=new Scanner(System.in);
			String soyad=c.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðrenci Bölümünü Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðrenci Sýnýfýný Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogrenci ogr2 = new ogrenci();
			ogr2.guncelleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(no+" Numaralý Öðrenci Bilgileri Güncellendi");
			System.out.println("*****************************************");
			}
		break;
		case 4: {
			vizenotlar yeninot=new vizenotlar();
			yeninot.notekleme();
		}
		break;
		case 5: {
			finalnotlar yeninot=new finalnotlar();
			yeninot.notekleme();
		}
		break;
		 
		case 6: {
			System.out.println("Vize Notunu Görmek Ýstediðiniz Öðrenci No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			vizenotlar yeninot = new vizenotlar();
			yeninot.listeleme(no);
		}
		break;
		case 7: {
			System.out.println("Final Notunu Görmek Ýstediðiniz Öðrenci No Girin");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			finalnotlar yeninot=new finalnotlar();
			yeninot.listeleme(no);
		}
		break;
		case 8: {
			System.out.println("Vize Yüzdesini Girin: ");
			Scanner v = new Scanner(System.in);
			int vize=v.nextInt();
			System.out.println("Final Yüzdesini Girin: ");
			Scanner f = new Scanner(System.in);
			int finall=f.nextInt();
			System.out.println("Ortalama Notunu Görmek Ýstediðiniz Öðrenci No Girin");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			ortalama yeninot=new ortalama(vize,finall);
			yeninot.ortalamaalma(no);
		}
		break;
		case 9: y=9;
		break;
		default:System.out.println("\n***Hatalý Seçim Yaptýnýz***\n");
		break;
		}
		}
		}
		break;
		case 3:{
			listeleme yeni=new listeleme();
			yeni.ogretimuyesilisteleme();
		}
		break;
		case 4: {
		int z=0;
		while(z!=6){
			System.out.println("        Öðrenci Ýþleri Otomasyonu        ");
			System.out.println("*****************************************");
			System.out.println("1 Öðretim Üyesi Ekle");
			System.out.println("2 Öðretim Üyesi Silme");
			System.out.println("3 Öðretim Üyesi Güncelleme");
			System.out.println("4 Öðretim Üyesine Ders Atama");
			System.out.println("5 Öðretim Üyeleri Ders Listesi");
			System.out.println("6 Üst Menüye Dön");
			System.out.println("*****************************************");
			secim=s.nextInt();
			switch (secim) {
			case 1: {
			System.out.println("Öðretim Üyesi Adý Girin:");
			Scanner a=new Scanner(System.in);
			String ad=a.nextLine();
			System.out.println("Öðretim Üyesi Soyadý Girin:");
			Scanner b=new Scanner(System.in);
			String soyad=b.nextLine();
			System.out.println("Öðretim Üyesi No Girin:");
			Scanner c=new Scanner(System.in);
			int no=c.nextInt();
			System.out.println("Öðretim Üyesi Bölümünü Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Öðretim Üyesi Sýnýfýný Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogretimUyesi ogr =new ogretimUyesi();
			ogr.ekleme(ad, soyad, no, bolum, sinif);	
			System.out.println("*****************************************");
			System.out.println(ad+" "+soyad+" Sisteme Eklenmiþtir.");
			System.out.println("*****************************************");
			}
			break;
			case 2: {
			System.out.println("Silmek Ýstediðiniz Öðretim Üyesi No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			ogretimUyesi ogr1 = new ogretimUyesi();
			ogr1.silme(no);
			System.out.println("*****************************************");
			System.out.println(no+" No 'lu Öðretim Üyesi Silinmiþtir.");
			}
			break;
			case 3: {
			System.out.println("Guncellemek Ýstediðiniz Öðretim Üyesi No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			System.out.println("Guncellemek Ýstediðiniz Öðretim Üyesi Adýný Girin:");
			Scanner b=new Scanner(System.in);
			String ad=b.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðretim Üyesi Soyadýný:");
			Scanner c=new Scanner(System.in);
			String soyad=c.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðretim Üyesi Bölümünü Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Guncellemek Ýstediðiniz Öðretim Üyesi Sýnýfýný Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogretimUyesi ogr2 = new ogretimUyesi();
			ogr2.guncelleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(no+" Numaralý Öðretim Üyesi Bilgileri Güncellendi");
			}
			break;
			case 4: {
				DersAtama yeni=new DersAtama();
				yeni.dersatama();
			}
			break;
			case 5: {
				listeleme yeni=new listeleme();
				yeni.ogretimuyesiderslisteleme();
			}
			break;
			case 6: z=6;
			break;
			default:System.out.println("\n***Hatalý Seçim Yaptýnýz***\n");
			break;
			}
			}
			}
			break;
			case 5: x=5;
			break;
			 
			default: System.out.println("\n***Hatalý Seçim Yaptýnýz***\n");
			 
			break;
			 
			}
			}
			}
			}