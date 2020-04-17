package Socket;

public class Ceasar {
    private char dizi[] = new char [29];
    private String mesaj;

    public Ceasar(String mesaj) {
        this.mesaj = mesaj;
        dizi[0]='A';
        dizi[1]='B';
        dizi[2]='C';
        dizi[3]='C';
        dizi[4]='D';
        dizi[5]='E';
        dizi[6]='F';
        dizi[7]='G';
        dizi[8]='Ð';
        dizi[9]='H';
        dizi[10]='I';
        dizi[11]='Ý';
        dizi[12]='J';
        dizi[13]='K';
        dizi[14]='L';
        dizi[15]='M';
        dizi[16]='N';
        dizi[17]='O';
        dizi[18]='O';
        dizi[19]='P';
        dizi[20]='R';
        dizi[21]='S';
        dizi[22]='S';
        dizi[23]='T';
        dizi[24]='U';
        dizi[25]='Ü';
        dizi[26]='V';
        dizi[27]='Y';
        dizi[28]='Z';

    }

    public void cevir (int kaydir) {
        char dizi2[] = new char[mesaj.length()];

        for (int i = 0; i < mesaj.length(); i++) {
            dizi2[i] = mesaj.charAt(i);
        }


        for (int i = 0; i < dizi2.length; i++) {

            for (int j = 0; j < dizi.length; j++) {

                if (dizi2[i]==' ') {
                    dizi2[i]=' ';
                }

                else if (dizi2[i]==dizi[j]) {

                    if (j+kaydir>28) {
                        int a = j+kaydir-29;
                        dizi2[i]=dizi[a];
                        break;
                    }
                    else
                    {
                        int a = j + kaydir;
                        dizi2[i] = dizi[a];
                        System.out.print(a+" ");
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < dizi2.length; i++) {
            System.out.print(dizi2[i]+" ");
        }

    }
    
    public String toString() {
    	return mesaj;
    }
}
