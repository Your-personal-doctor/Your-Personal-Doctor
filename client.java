package server;

import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {
        try {
            //create a server for connection
            Socket s = new Socket("local host", 8080);
            //read messgage from client
            DataInputStream mesin = new DataInputStream(s.getInputStream());
            //send message to client
            DataOutputStream mesout = new DataOutputStream(s.getOutputStream());
            //create a scanner of BufferedReader
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                //read message from server
                String messagein = "", messageout = "";
                messageout = kb.readLine();
                mesout.writeUTF("User:"+ messageout);
                messagein = mesin.readUTF();
                System.out.println(messagein);
            }

        } catch (Exception e) {

        }

    }
}
