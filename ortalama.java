import java.io.*;
 
public class ortalama extends ogrenciIsleri{
	
 public ortalama(int vize,int finall) {
		super(vize, finall);
	}
 int i;
 int j;
 double ortalama;
 public void ortalamaalma(int no) {
 String a = String.valueOf(no);
 try{
 File f = new File("C:/vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String satir;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 satir = br.readLine();
 while (satir != null) {
 if((satir=br.readLine()).startsWith(a)){
 String[] not;
 not=satir.split(" ");
 i=Integer.parseInt(not[5]);
 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File file = new File("C:/finalnotlar.txt");
 FileReader fileReader2 = new FileReader(file);
 String satir;
 try (BufferedReader br = new BufferedReader(fileReader2)) {
 satir = br.readLine();
 while (satir != null) {
 if((satir=br.readLine()).startsWith(a)){
 String[] not;
 not=satir.split(" ");
 j=Integer.parseInt(not[5]);
 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 System.out.println("\n****************************************************************");
 System.out.println("Vize Yüzdesi :"+getvize() + " Vize Notu: " + i +" Final Yüzdesi: "+getfinall()+ " Final Notu: " + j);
 ortalama=((i*getvize()+j*getfinall())/100);
 System.out.println("Ortalama: "+ortalama);
 System.out.println("****************************************************************\n");
 } 
}