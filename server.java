
package test;
import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {
        try {
            //create a server for connection
            ServerSocket ss = new ServerSocket(8080);
            //waiting for connection
            Socket s = ss.accept();
            //read messgage from client
            DataInputStream mesin = new DataInputStream(s.getInputStream());
            //send message to client
            DataOutputStream mesout = new DataOutputStream(s.getOutputStream());
            //create a scanner of BufferedReader
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            String messagein = "", messageout = "";
            while (!messagein.equals("end")) {
                //read message from client
                messagein = mesin.readUTF();
                System.out.println(messagein);
                //write messages to client
                messageout = kb.readLine();
                mesout.writeUTF("Doctor:"+messageout);
              
            }

            s.close();

        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    }
