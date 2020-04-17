package Socket;

import java.util.ArrayList;
import java.util.List;

public class Columnar {
    char[][] dizi = new char[5][5];
    List<Character> list = new ArrayList<Character>();
    private String mesaj;

    public Columnar(String mesaj) {
        this.mesaj=mesaj;
    }

    public void cevir(){
        int b = 0;

        for (int i = 0; i < mesaj.length(); i++) {
            list.add(mesaj.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==' ') {
                list.remove(i);
            }
        }
        b = 25 - list.size();
        if (b!=0) {
            for (int i = 0; i < b; i++) {
                list.add('V');
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dizi[i][j]=list.get((i*5)+j);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(dizi[j][i]);
                if (j==4) {
                    System.out.print(" ");
                }
            }
        }
    }
    
    public String toString() {
    	return mesaj;
    }
}
