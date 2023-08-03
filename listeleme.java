import java.io.*;
 
public class listeleme {
 public void ogrencilisteleme(){
 try{
 File f = new File("C:/ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 System.out.println("No " + " Ad  Soyad "+"Sýnýf " + "Bölüm ");
 System.out.println("*****************************************");

 try (BufferedReader br = new BufferedReader(fileReader)) {

 while ((satir=br.readLine()) != null) {
 System.out.println(satir);

 } 
 System.out.println("*****************************************");

 }
 }
 
 catch(Exception e){
 }
 }
  
 public void ogretimuyesilisteleme(){
 try{
 File f = new File("C:/ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 System.out.println("No " + " Ad  Soyad "+"Sýnýf " + "Bölüm ");
 System.out.println("*****************************************");
 try (BufferedReader br = new BufferedReader(fileReader)) {
  
 while ((satir=br.readLine()) != null) {
 System.out.println(satir);

  
 } 
 }
 System.out.println("*****************************************");
 }
 catch(Exception e){
 }
 }
 
 public void ogretimuyesiderslisteleme(){
 try{
 File f = new File("C:/dersler.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 System.out.println("No " + " Ad  Soyad "+"Sýnýf " + "Bölüm " + "Verdiði Ders"  );
 System.out.println("*****************************************");
 try (BufferedReader br = new BufferedReader(fileReader)) {
  
 while ((satir=br.readLine()) != null) {
 System.out.println(satir);

  
 } 
 }
 System.out.println("*****************************************");
 }
 catch(Exception e){
 }
 }
 
}