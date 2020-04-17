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
            System.out.println("Istemci A��k");

            Socket soc= new Socket("localhost",5757);
            BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
            
            String mesaj="";

            
            String islemler = "1. Ceasar �ifreleme \n"
                    +"2. Polybius �ifreleme \n"
                    +"3. Vigenere �ifreleme (B�y�k harflerle olusturuldu.��lemlerinizi b�y�k harfler �zerinden yap�n�z... ) \n"
                    +"4. Columnar �ifreleme \n"
                    +"5. �it ile �ifreleme\n"
                    +"6. Tomy ile �ifreleme\n"
                    +"��k�� i�in q 'ya bas�n�z";

            System.out.println("***************************");
            System.out.println(islemler);
            System.out.println("***************************");
            System.out.println("Mesaj�n�z� �ifrelemek istedi�iniz algoritmay� se�iniz...");

            
            while(true){
               
                String islem = scanner.nextLine();
                System.out.println("Mesaj�n�z� giriniz: ");
                String str = text.readLine();
                if(islem.equals("1")){
                    System.out.println("Ne kadar kayd�r�laca��n� giriniz :");
                    int k = scanner.nextInt();
                    Ceasar ceasar = new Ceasar(str.toUpperCase());
                    System.out.println("�ifrelenmi� Metin: ");
                    ceasar.cevir(k);
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesaj�n�z: \n" + ceasar.toString());
                }else if(islem.equals("2")){
                    Polybius polybius = new Polybius(str.toUpperCase());
                    System.out.println("�ifrelenmi� Metin: ");
                    polybius.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesaj�n�z: \n "+polybius.toString());
                   // System.out.println(polybius.toString());
                }else if(islem.equals("3")){
                	System.out.println("Anahtar� girin: ");
                	String anahtar = scanner.nextLine();
                	Vigenere vigenere = new Vigenere(str.toUpperCase());
                	System.out.println("�ifrelenmi� Metin: ");
                	vigenere.cevir(anahtar);
                	mesaj=str;
                	System.out.println();
                	System.out.println("\nMesaj�n�z:  \n" + vigenere.toString());	
                }else if(islem.equals("4")){
                    Columnar columnar = new Columnar(str.toUpperCase());
                    System.out.println("�ifrelenmi� Metin: ");
                    columnar.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesaj�n�z: \n" + columnar.toString());
                   
                }else if(islem.equals("5")){
                    Cit cit = new Cit(str);
                    System.out.println("�ifrelenmi� Metin: ");
                    cit.cevir();
                    mesaj= str;
                    System.out.println();
                    System.out.println("\nMesaj�n�z: \n" + cit.toString());
                }
                else if(islem.equals("6")){
                	Tomy tomy = new Tomy(str);
                	System.out.println("�ifrelenmi� metin: ");
                	tomy.cevir();
                	mesaj=str;
                	System.out.println();
                	System.out.println("\n Mesaj�n�z: \n"+tomy.toString());
                	
                }else  if(islem.equals("q")){
                    System.out.println("��k�� yap�l�yor...");
                    break;
                }else {
                
                    System.out.println("Ge�ersiz i�lem");
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
