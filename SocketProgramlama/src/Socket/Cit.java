package Socket;

public class Cit {
    private String mesaj;
    char dizi2[];
    char dizi3[];
    char dizi4[];
    int j = 0;
    int k = 0;
    public Cit(String mesaj) {
        this.mesaj = mesaj;
        dizi2 = new char[mesaj.length()];
        if ((dizi2.length)%2==0) {
            dizi3=new char[mesaj.length()/2];
            dizi4=new char[mesaj.length()/2];
        }
        else
        {
            dizi3=new char[(mesaj.length()/2)+1];
            dizi4=new char[mesaj.length()/2];
        }
    }

    public void cevir(){
        for (int i = 0; i < mesaj.length(); i++) {
            dizi2[i]=mesaj.charAt(i);
        }
        for (int i = 0; i < dizi2.length; i++) {
            if (i%2==0) {
                dizi3[j]=dizi2[i];
                j++;
            }
            else
            {
                dizi4[k]=dizi2[i];
                k++;
            }
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.print(dizi3[i]);
        }
        for (int i = 0; i < dizi4.length; i++) {
            System.out.print(dizi4[i]);
        }
    }
    
    public String toString() {
    	return mesaj;
    }
}

