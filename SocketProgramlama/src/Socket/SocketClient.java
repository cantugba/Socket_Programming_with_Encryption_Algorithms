package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        //SocketServer.getNesne();
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Istemci Açýk");

            Socket soc= new Socket("localhost",5757);
            BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
            
            String mesaj="";

            
            String islemler = "1. Ceasar Þifreleme \n"
                    +"2. Polybius Þifreleme \n"
                    +"3. Vigenere Þifreleme (Büyük harflerle olusturuldu.Ýþlemlerinizi büyük harfler üzerinden yapýnýz... ) \n"
                    +"4. Columnar Þifreleme \n"
                    +"5. Çit ile Þifreleme\n"
                    +"6. Tomy ile Þifreleme\n"
                    +"Çýkýþ için q 'ya basýnýz";

            System.out.println("***************************");
            System.out.println(islemler);
            System.out.println("***************************");
            System.out.println("Mesajýnýzý þifrelemek istediðiniz algoritmayý seçiniz...");

            
            while(true){
               
                String islem = scanner.nextLine();
                System.out.println("Mesajýnýzý giriniz: ");
                String str = text.readLine();
                if(islem.equals("1")){
                    System.out.println("Ne kadar kaydýrýlacaðýný giriniz :");
                    int k = scanner.nextInt();
                    Ceasar ceasar = new Ceasar(str.toUpperCase());
                    System.out.println("Þifrelenmiþ Metin: ");
                    ceasar.cevir(k);
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesajýnýz: \n" + ceasar.toString());
                }else if(islem.equals("2")){
                    Polybius polybius = new Polybius(str.toUpperCase());
                    System.out.println("Þifrelenmiþ Metin: ");
                    polybius.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesajýnýz: \n "+polybius.toString());
                   // System.out.println(polybius.toString());
                }else if(islem.equals("3")){
                	System.out.println("Anahtarý girin: ");
                	String anahtar = scanner.nextLine();
                	Vigenere vigenere = new Vigenere(str.toUpperCase());
                	System.out.println("Þifrelenmiþ Metin: ");
                	vigenere.cevir(anahtar);
                	mesaj=str;
                	System.out.println();
                	System.out.println("\nMesajýnýz:  \n" + vigenere.toString());	
                }else if(islem.equals("4")){
                    Columnar columnar = new Columnar(str.toUpperCase());
                    System.out.println("Þifrelenmiþ Metin: ");
                    columnar.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesajýnýz: \n" + columnar.toString());
                   
                }else if(islem.equals("5")){
                    Cit cit = new Cit(str);
                    System.out.println("Þifrelenmiþ Metin: ");
                    cit.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesajýnýz: \n" + cit.toString());
                }
                else if(islem.equals("6")){
                	Tomy tomy = new Tomy(str);
                	System.out.println("Þifrelenmiþ metin: ");
                	tomy.cevir();
                	mesaj=str;
                	System.out.println();
                	System.out.println("\n Mesajýnýz: \n"+tomy.toString());
                	
                }else  if(islem.equals("q")){
                    System.out.println("Çýkýþ yapýlýyor...");
                    break;
                }else {
                
                    System.out.println("Geçersiz iþlem");
                }

                PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
                out.println(mesaj);

                BufferedReader  in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println(in.readLine());

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
