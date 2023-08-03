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
		System.out.println("Kullan�c� ad�:");
		Scanner gir = new Scanner(System.in); 
		String girilenKullanici = gir.next();
		System.out.println("�ifre:");
		String girilenSifre = gir.next();
		if(Giris.kay�tl�Kullan�c�.equals(girilenKullanici) && Giris.kay�tl�Kullan�c�.equals(girilenSifre))
		{
			System.out.println("\n***Giri� yap�ld�***\n");
		System.out.println("*****************************************");
		}
		else
		{
			System.out.println("*****************************************");
			System.out.println("\n***Giri� izniniz yok***\n");
			System.exit(0);
		}
		int x=0;
		while(x!=5){
		System.out.println("        ��renci ��leri Otomasyonu        ");
		System.out.println("*****************************************");
		System.out.println("��lem Se�iniz:");
		System.out.println("1 ��renci Listesi");
		System.out.println("2 ��renci ��lemleri");
		System.out.println("3 ��retim �yesi Listesi");
		System.out.println("4 ��retim �yesi ��lemleri");
		System.out.println("5 ��k��");
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
		System.out.println("        ��renci ��leri Otomasyonu        ");
		System.out.println("*****************************************");
		System.out.println("��lem Se�iniz:");
		System.out.println("1 ��renci Ekleme");
		System.out.println("2 ��renci Silme");
		System.out.println("3 ��renci G�ncelleme");
		System.out.println("4 ��renciye Vize Notu Ekle");
		System.out.println("5 ��renciye Final Notu Ekle");
		System.out.println("6 ��rencilerin Vize Notu Listele");
		System.out.println("7 ��rencilerin Final Notu Listele");
		System.out.println("8 ��rencilerin Ortalama Notunu Listele");
		System.out.println("9 �st Men�ye D�n");
		System.out.println("*****************************************");
		secim=s.nextInt();
		switch (secim) {
		case 1: {
			System.out.println("��renci Ad�n� Girin:");
			Scanner a=new Scanner(System.in);
			String ad=a.nextLine();
			System.out.println("��renci Soyad�n� Girin:");
			Scanner b=new Scanner(System.in);
			String soyad=b.nextLine();
			System.out.println("��renci Numaras�n� Girin:");
			Scanner c=new Scanner(System.in);
			int no=c.nextInt();
			System.out.println("��renci B�l�m�n� Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("��renci S�n�f�n� Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogrenci ogr =new ogrenci();
			ogr.ekleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(ad+" "+soyad+" Sisteme Eklenmi�tir.\n");
			System.out.println("*****************************************");
		}
		break;
		case 2: {
		System.out.println("Silmek �stedi�iniz ��renci No Girin:");
		Scanner a=new Scanner(System.in);
		int no=a.nextInt();
		ogrenci ogr1 = new ogrenci();
		ogr1.silme(no);
		System.out.println("*****************************************");
		System.out.println(no+" No 'lu ��renci Silinmi�tir.");
		System.out.println("*****************************************");
		}
		break;
		case 3: {
			System.out.println("Guncellemek �stedi�iniz ��renci No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			System.out.println("Guncellemek �stedi�iniz ��renci Ad�n� Girin:");
			Scanner b=new Scanner(System.in);
			String ad=b.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��renci Soyad�n� Girin:");
			Scanner c=new Scanner(System.in);
			String soyad=c.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��renci B�l�m�n� Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��renci S�n�f�n� Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogrenci ogr2 = new ogrenci();
			ogr2.guncelleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(no+" Numaral� ��renci Bilgileri G�ncellendi");
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
			System.out.println("Vize Notunu G�rmek �stedi�iniz ��renci No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			vizenotlar yeninot = new vizenotlar();
			yeninot.listeleme(no);
		}
		break;
		case 7: {
			System.out.println("Final Notunu G�rmek �stedi�iniz ��renci No Girin");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			finalnotlar yeninot=new finalnotlar();
			yeninot.listeleme(no);
		}
		break;
		case 8: {
			System.out.println("Vize Y�zdesini Girin: ");
			Scanner v = new Scanner(System.in);
			int vize=v.nextInt();
			System.out.println("Final Y�zdesini Girin: ");
			Scanner f = new Scanner(System.in);
			int finall=f.nextInt();
			System.out.println("Ortalama Notunu G�rmek �stedi�iniz ��renci No Girin");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			ortalama yeninot=new ortalama(vize,finall);
			yeninot.ortalamaalma(no);
		}
		break;
		case 9: y=9;
		break;
		default:System.out.println("\n***Hatal� Se�im Yapt�n�z***\n");
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
			System.out.println("        ��renci ��leri Otomasyonu        ");
			System.out.println("*****************************************");
			System.out.println("1 ��retim �yesi Ekle");
			System.out.println("2 ��retim �yesi Silme");
			System.out.println("3 ��retim �yesi G�ncelleme");
			System.out.println("4 ��retim �yesine Ders Atama");
			System.out.println("5 ��retim �yeleri Ders Listesi");
			System.out.println("6 �st Men�ye D�n");
			System.out.println("*****************************************");
			secim=s.nextInt();
			switch (secim) {
			case 1: {
			System.out.println("��retim �yesi Ad� Girin:");
			Scanner a=new Scanner(System.in);
			String ad=a.nextLine();
			System.out.println("��retim �yesi Soyad� Girin:");
			Scanner b=new Scanner(System.in);
			String soyad=b.nextLine();
			System.out.println("��retim �yesi No Girin:");
			Scanner c=new Scanner(System.in);
			int no=c.nextInt();
			System.out.println("��retim �yesi B�l�m�n� Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("��retim �yesi S�n�f�n� Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogretimUyesi ogr =new ogretimUyesi();
			ogr.ekleme(ad, soyad, no, bolum, sinif);	
			System.out.println("*****************************************");
			System.out.println(ad+" "+soyad+" Sisteme Eklenmi�tir.");
			System.out.println("*****************************************");
			}
			break;
			case 2: {
			System.out.println("Silmek �stedi�iniz ��retim �yesi No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			ogretimUyesi ogr1 = new ogretimUyesi();
			ogr1.silme(no);
			System.out.println("*****************************************");
			System.out.println(no+" No 'lu ��retim �yesi Silinmi�tir.");
			}
			break;
			case 3: {
			System.out.println("Guncellemek �stedi�iniz ��retim �yesi No Girin:");
			Scanner a=new Scanner(System.in);
			int no=a.nextInt();
			System.out.println("Guncellemek �stedi�iniz ��retim �yesi Ad�n� Girin:");
			Scanner b=new Scanner(System.in);
			String ad=b.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��retim �yesi Soyad�n�:");
			Scanner c=new Scanner(System.in);
			String soyad=c.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��retim �yesi B�l�m�n� Girin:");
			Scanner d=new Scanner(System.in);
			String bolum=d.nextLine();
			System.out.println("Guncellemek �stedi�iniz ��retim �yesi S�n�f�n� Girin:");
			Scanner e=new Scanner(System.in);
			int sinif=e.nextInt();
			ogretimUyesi ogr2 = new ogretimUyesi();
			ogr2.guncelleme(ad, soyad, no, bolum, sinif);
			System.out.println("*****************************************");
			System.out.println(no+" Numaral� ��retim �yesi Bilgileri G�ncellendi");
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
			default:System.out.println("\n***Hatal� Se�im Yapt�n�z***\n");
			break;
			}
			}
			}
			break;
			case 5: x=5;
			break;
			 
			default: System.out.println("\n***Hatal� Se�im Yapt�n�z***\n");
			 
			break;
			 
			}
			}
			}
			}