package SistemaOperacioanal;

import java.net.*;
import java.io.*;
import java.util.Date;

public class DataServer {
    private static PrintStream pout;

    public static void main(String[] args){
        try{
            ServerSocket sock = new ServerSocket(6013);

            while(true){
                Socket client = sock.accept();

                pout.println(new Date().toString());
                client.close();

            }
        }
        catch (IOException e) {
            throw new RuntimeException( e );
        }
    }
}
