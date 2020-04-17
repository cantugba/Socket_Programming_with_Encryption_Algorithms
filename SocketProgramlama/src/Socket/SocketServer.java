package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) {
        try {
            System.out.println("Istemci Bekleniyor..");
            ServerSocket s = new ServerSocket(5757);
            Socket soc = s.accept(); 

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str= in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("\n Mesaj :  " +str);
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
    }


}
