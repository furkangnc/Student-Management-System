import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ogretimUyesi implements kisiler {
	 private String ad;
	 private String soyad;
	 private int no;
	 private String bolum;
	 private int sinif;
	 @Override
	 public void ekleme(String ad,String soyad,int no,String bolum,int sinif) {
	 PrintWriter out = null;
	 try {
	 this.ad=ad;
	 this.soyad=soyad;
	 this.no=no;
	 this.bolum=bolum;
	 this.sinif=sinif;
	  
	 out = new PrintWriter(new BufferedWriter(new FileWriter("C:/ogretimuyeleri.txt", true)));
	 out.println(no+" "+ad+" "+soyad+" "+sinif+" "+bolum);
	 } catch (IOException ex) {
	 Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
	 } finally {
	 out.close();
	 }
	  
	 }
	 
	 @Override
	 public void silme(int no) {
	 this.no = no;
	 String a = String.valueOf(no);
	 ArrayList<String> liste = new ArrayList<>();
	 try{
	 File f = new File("C:/ogretimuyeleri.txt");
	 FileReader fileReader = new FileReader(f);
	 String satir;
	 try (BufferedReader br = new BufferedReader(fileReader)) {
	 satir = br.readLine();
	 while (satir != null) {
	 if((satir=br.readLine()).startsWith(a)){continue;}
	 else{liste.add(satir);}
	 } 
	 }
	 }
	 catch(Exception e){
	 }
	 try{
	 File f = new File("C:/ogretimuyeleri.txt");
	 FileWriter outFile = new FileWriter(f);
	 PrintWriter out = new PrintWriter(outFile,true);
	 for (String d: liste){out.println(d);}
	 out.close();
	 }
	 catch (Exception e){
	 System.err.println("Hata: " + e.getMessage());
	 }
	 }
	 
	 @Override
	 public void guncelleme(String ad,String soyad,int no,String bolum,int sinif) {
	 this.ad=ad;
	 this.soyad=soyad;
	 this.no=no;
	 this.bolum=bolum;
	 this.sinif=sinif;
	  
	 String a = String.valueOf(no);
	 ArrayList<String> list = new ArrayList<>();
	 try{
	 File f = new File("C:/ogretimuyeleri.txt");
	 FileReader fileReader = new FileReader(f);
	 String satir;
	 try (BufferedReader br = new BufferedReader(fileReader)) {
	 satir = br.readLine();
	 while (satir != null) {
	 if((satir=br.readLine()).startsWith(a)){list.add(no+" "+ad+" "+soyad+" "+sinif+" "+bolum);}
	 else{ list.add(satir);}
	 } 
	 }
	 }
	 catch(Exception e){
	 }
	 try{
	 File f = new File("C:/ogretimuyeleri.txt");
	 FileWriter outFile = new FileWriter(f);
	 PrintWriter out = new PrintWriter(outFile,true);
	 for (String d: list){out.println(d);}
	 out.close();
	 }catch (Exception e){
	 System.err.println("Hata: " + e.getMessage());
	 }
	 }
	  
	}