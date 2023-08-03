import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
public class DersAtama {
 public void dersatama(){
 String ders;
 ArrayList<String> liste = new ArrayList<>();
 try{
 File f = new File("C:/ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 Scanner d=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((satir = br.readLine()) != null) {
 System.out.println(satir+" Öðretim Üyesinin Verdiði Dersi Giriniz:");
 ders=d.nextLine();
 liste.add(satir+" "+ders);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("C:/dersler.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: liste)
 {out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 } 
}