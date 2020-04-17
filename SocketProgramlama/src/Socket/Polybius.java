package Socket;

public class Polybius {
    private String mesaj;
    char [][] dizi = new char [5][5];

    public Polybius(String mesaj) {
        this.mesaj = mesaj;
        dizi[0][0] = 'A';
        dizi[0][1] = 'B';
        dizi[0][2] = 'C';
        dizi[0][3] = 'D';
        dizi[0][4] = 'E';

        dizi[1][0] = 'F';
        dizi[1][1] = 'G';
        dizi[1][2] = 'Ð';
        dizi[1][3] = 'H';
        dizi[1][4] = 'I';

        dizi[2][0] = 'J';
        dizi[2][1] = 'K';
        dizi[2][2] = 'L';
        dizi[2][3] = 'M';
        dizi[2][4] = 'N';

        dizi[3][0] = 'O';
        dizi[3][1] = 'P';
        dizi[3][2] = 'R';
        dizi[3][3] = 'S';
        dizi[3][4] = 'Þ';

        dizi[4][0] = 'T';
        dizi[4][1] = 'U';
        dizi[4][2] = 'V';
        dizi[4][3] = 'Y';
        dizi[4][4] = 'Z';

    }

    public void cevir() {
        char dizi2 [] = new char[mesaj.length()];
        for(int i =0 ; i<mesaj.length();i++) {
            dizi2[i] = mesaj.charAt(i);
        }
        
        for(int i = 0; i < dizi2.length; i++) {
            for(int j = 0;  j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    if(dizi2[i] != ' '){
                        if(dizi2[i] == dizi[j][k]) {
                            System.out.print((j+1) + "" + (k+1) + " ");
                        }
                    }
                }
            }
         }
    }
    
    public String toString() {
    	return mesaj;
    }


}

