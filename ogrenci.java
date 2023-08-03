import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ogrenci implements kisiler{
	 private String ad;
	 private String soyad;
	 private int no;
	 private String bolum;
	 private int sinif;
	 
	 
	 public void ekleme(String ad,String soyad,int no,String bolum,int sinif) {
		 PrintWriter out = null;
		 try {
		 this.ad=ad;
		 this.soyad=soyad;
		 this.no=no;
		 this.bolum=bolum;
		 this.sinif=sinif;
		 
	out = new PrintWriter(new BufferedWriter(new FileWriter("C:/ogrenci.txt", true)));
	out.println(no+" "+ad+" "+soyad+" "+sinif+" "+bolum);
}
	 catch (IOException ex) {
			 Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
			 }
			 out.close();
}
	 
	 
	 public void silme(int no) {
		 this.no = no;
		 String a = String.valueOf(no);
		 ArrayList<String> liste = new ArrayList<>();
		 try{
		 File f = new File("C:/ogrenci.txt");
		 FileReader fileReader = new FileReader(f);
		 String satir;
		 try (BufferedReader br = new BufferedReader(fileReader)) {
		 satir = br.readLine();
		 while (satir != null) {
		 if((satir=br.readLine()).startsWith(a)){
		 continue;
		 }
		 else
		 {
			 liste.add(satir);
		 }
		 } 
		 }
		 }
		 catch(Exception e){
		 }
		 try{
		 File f = new File("C:/ogrenci.txt");
		 FileWriter outFile = new FileWriter(f);
		 PrintWriter out = new PrintWriter(outFile,true);
		 for (String d: liste){out.println(d);}
		 out.close();
		 }
		 catch (Exception e){
		 System.err.println("Hata: " + e.getMessage());
		 }
		 ArrayList<String> liste2 = new ArrayList<>();
		 try{
		 File f = new File("C:vizenotlar.txt");
		 FileReader fileReader = new FileReader(f);
		 String satir;
		 try (BufferedReader br = new BufferedReader(fileReader)) {
		 satir = br.readLine();
		 while (satir != null) {
		 if((satir=br.readLine()).startsWith(a)){
		 continue;
		 }
		 else
		 {
			 liste2.add(satir);
		 }
		 } 
		 }
		 }
		 catch(Exception e){
		 }
		 try{
		 File f = new File("C:/vizenotlar.txt");
		 FileWriter outFile = new FileWriter(f);
		 PrintWriter out = new PrintWriter(outFile,true);
		 for (String d: liste2){out.println(d);}
		 out.close();
		 }
		 catch (Exception e){
		 System.err.println("Hata: " + e.getMessage());
		 }
		 ArrayList<String> liste3 = new ArrayList<>();
		 try{
		 File f = new File("C:/finalnotlar.txt");
		 FileReader fileReader = new FileReader(f);
		 String satir;
		 try (BufferedReader br = new BufferedReader(fileReader)) {
		 satir = br.readLine();
		 while (satir != null) {
		 if((satir=br.readLine()).startsWith(a)){
		 continue;
		 }
		 else
		 {
			 liste3.add(satir);
		 }
		 } 
		 }
		 }
		 catch(Exception e){
		 }
		 try{
		 File f = new File("C:/finalnotlar.txt");
		 FileWriter outFile = new FileWriter(f);
		 PrintWriter out = new PrintWriter(outFile,true);
		 for (String d: liste3){out.println(d);}
		 out.close();
		 }
		 catch (Exception e){
		 System.err.println("Hata: " + e.getMessage());
		 }
		 }
	 public void guncelleme(String ad,String soyad,int no,String bolum,int sinif)
	  {
		 this.ad=ad;
		 this.soyad=soyad;
		 this.no=no;
		 this.bolum=bolum;
		 this.sinif=sinif;
		  
		 String a = String.valueOf(no);
		 ArrayList<String> liste = new ArrayList<>();
		 try{
		 File f = new File("C:/ogrenci.txt");
		 FileReader fileReader = new FileReader(f);
		 String satir;
		 try (BufferedReader br = new BufferedReader(fileReader)) {
		 satir = br.readLine();
		 while (satir != null) {
		 if((satir=br.readLine()).startsWith(a)){
		 {
			 liste.add(no+" "+ad+" "+soyad+" "+sinif+" "+bolum);
			 }
		 }
		 else
		 {
			 liste.add(satir);
		 }
		 } 
		 }
		 }
		 catch(Exception e){
		 }
		 try{
		 File f = new File("C:/ogrenci.txt");
		 FileWriter outFile = new FileWriter(f);
		 PrintWriter out = new PrintWriter(outFile,true);
		 for (String d: liste){out.println(d);}
		 out.close();
		 }catch (Exception e){
		 System.err.println("Hata: " + e.getMessage());
		 }
		  
		 }
}