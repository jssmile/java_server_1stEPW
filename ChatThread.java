import java.io.*;
import java.net.*;

class ChatThread extends Thread{
 public void run() {
    System.out.println("Waiting");
    while(true){
        byte[] re = new byte[21];

        try{
            InputStream in = Server.clntSock.getInputStream();
            in.read(re);
            String s = new String(re);
            System.out.println("Communication Sucessful!!");
            System.out.println("(Server端)接收的字串:"+s);
        }
        catch(IOException e){}
        
        try{
            OutputStream out = Server.clntSock.getOutputStream();
            String str = "I am Server";
            System.out.println("(Server端)傳送的字串:"+str);
            byte[] sendstr = new byte[18];
            System.arraycopy(str.getBytes(), 0, sendstr, 0, str.length());
            out.write(sendstr);
        }
        catch(IOException e){}    

        }
  
    }
}