package com.example.server;
 
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.util.*; 
@ServerEndpoint("/websocket")
public class Server {
     
    @OnOpen
    public void onOpen(){
        System.out.println("Open Connection ...");
    }
     
    @OnClose
    public void onClose(){
        System.out.println("Close Connection ...");
    }
     
    @OnMessage
    public String onMessage(String message){
    	System.out.println("Message from the client: " + message);
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the Message");
        String echoMessage=scan.nextLine();
        return echoMessage;
    }
 
    @OnError
    public void onError(Throwable e){
        e.printStackTrace();
    }
 
}