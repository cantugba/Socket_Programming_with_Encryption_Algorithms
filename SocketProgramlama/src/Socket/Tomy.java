package Socket;

import java.util.Arrays;
import java.util.Random;

public class Tomy {

    private String mesaj;
    int[][] det1=new int[3][3];
    int[][] sonuc= new int[3][3];
    Random rndm = new Random();
    public Tomy(String mesaj) {
        this.mesaj = mesaj;
        det1[0][0]=3;
        det1[0][1]=2;
        det1[0][2]=2;
        det1[1][0]=0;
        det1[1][1]=1;
        det1[1][2]=0;
        det1[2][0]=1;
        det1[2][1]=0;
        det1[2][2]=1;
    }
    public void cevir()
    {
        char[] dizi2=new char[mesaj.length()];
        int[] dizi= new int[mesaj.length()];
        int[][] dizi3=new int[3][8];
        for (int i = 0; i < mesaj.length(); i++) {
            dizi2[i]=mesaj.charAt(i);
        }
        for (int i = 0; i < mesaj.length(); i++) {
            if (dizi2[i]==' ') {
                dizi[i]=0;
            }
            else 
            {
                while (true) {                    
                int a = rndm.nextInt(24);
                    if (a!=0) {
                    dizi[i]=a;   
                    break;
                    }
                }
            }
        }
        for (int i = 1; i < dizi.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dizi2[i]==dizi2[j]) {
                    dizi[i]=dizi[j];
                }
                else if (dizi2[i]!=dizi2[j]&&dizi[i]==dizi[j]) {
                    while (true) {                    
                int a = rndm.nextInt(24);
                    if (a!=0) {
                    dizi[i]=a;   
                    break;
                    }
                }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                dizi3[i][j]=dizi[(i*8)+j];
            }
        }
        for(int[] d : dizi3)
        {
            System.out.println(Arrays.toString(d)+" ");
        }
        }
    
    public String toString() {
    	return mesaj;
    }
}

