
import java.io.IOException;
import java.util.*;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class chat {

    private boolean bool = true;
    private String name;
    private Session session;
    private static final HashMap<String, Object> clientSet = new HashMap<String, Object>();
    //connection

    @OnOpen
    public void start(Session session) throws IOException {
        this.session = session;
    }
    //diconnection 

    @OnClose
    public void end() {
        clientSet.remove(name, this);
        String message = String.format("%s %s", name, "leave the chat");
        broadcast(message);
    }
    //Get message

    @OnMessage
    public void print(String msg) {
        if (bool) {
            name = msg;
            clientSet.put(name, this);
            String message = String.format("%s %s", name, "join the chat");
            broadcast(message);
            bool = false;
        } else {
            broadcast(name + ":" + msg);
        }
    }
    //connection Error

    @OnError
    public void onError(Throwable t) throws Throwable {
        System.out.println("WebSocket Server Error " + t);
    }

    public void broadcast(String msg) {
        //connect the server and client
        chat client = null;
        for (String nickname :clientSet.keySet()) {
            try {
                client = (chat) clientSet.get(nickname);
                synchronized (client) {
                    client.session.getBasicRemote().sendText(msg);
                }
            } catch (IOException e) {
                System.out.println( client + " Error");
                clientSet.remove(name, client);
                try {
                    client.session.close();
                } catch (IOException e1) {
                }
                String message = String.format("%s %s", client.name, "Disconnected");
                broadcast(message);
            }
        }
    }

}
