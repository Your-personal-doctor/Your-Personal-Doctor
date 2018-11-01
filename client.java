package test;

import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {
        try {
            //create a server for connection
            Socket s = new Socket("localhost", 8080);;
            //read messgage from server
            DataInputStream mesin = new DataInputStream(s.getInputStream());
            //send message to server
            DataOutputStream mesout = new DataOutputStream(s.getOutputStream());
            //create a scanner of BufferedReader
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                //write messages to server
                String messageout = kb.readLine(); 
                mesout.writeUTF("User:" + messageout);
                //read messages from server
                String messagein = mesin.readUTF();
                System.out.println(messagein);
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
