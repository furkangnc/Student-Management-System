import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class vizenotlar extends notlar {

	

int i;
  
 @Override
 public void listeleme(int no){
 int i;
 String a = String.valueOf(no);
 String[] not;
 try{
 File f = new File("C:/vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 BufferedReader br = new BufferedReader(fileReader);
  
 satir = br.readLine();
 while (satir != null) {
 if((satir=br.readLine()).startsWith(a)){
 not=satir.split(" ");
 System.out.println(not[5]);
 break;
 }
 else{continue;}
 } 
  
 }
 catch(Exception e) {}
 }
 
 @Override
 public void notekleme() {
  
 int not;
 ArrayList<String> liste = new ArrayList<>();
 try{
 File f = new File("C:/ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 Scanner vize=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((satir = br.readLine()) != null) {
 System.out.println(satir+" Öğrencinin Vize Notunu Giriniz.");
 not=vize.nextInt();
 liste.add(satir+" "+not);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("C:/vizenotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: liste){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 }
}