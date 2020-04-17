package Socket;

public class Vigenere {
	private String mesaj;
	public Vigenere (String mesaj) {
		this.mesaj= mesaj;
	}
	
	public void cevir(String anahtar) {
        char []alfabe=new char [26];
        char [][]tablo=new char [26][26];
		int k=0,t=0,tut = 0,tut2 = 0;
		for (int i = 65; i <91; i++) {//büyük harfler harfler dizisine atıldı.
	         alfabe[k]=(char)i;
	         k++;	            
	    }	
		for (int i = 0; i < 26; i++) {//vigenere tablosu oluşturma 
	        // System.out.println("");
	        for (int j = 0; j < 26; j++) {
	            t=t%26;
	            tablo[i][j]=alfabe[t];
	            t++;
	         }
	         t++;
	     }
		 for (int j = 0; j < mesaj.length(); j++) {//Şifreleme Yaptığımız Bölüm
             for (int l = 0; l < 26; l++) {
                  if(alfabe[l]==anahtar.charAt(j%(anahtar.length()))){
                     tut=l;
                   }
                   if(alfabe[l]==mesaj.charAt(j%26)){
                     tut2=l;
                   }
             }
             System.out.print(tablo[tut][tut2]);   
          }		
	}
	
	public String toString() {
		return mesaj;
	}
}
