import java.io.*;
import java.net.*;

public class Server {

  public static ServerSocket servSock_chat = null;
  public static ServerSocket servSock_image = null;
  public static Socket clntSock = null;

    public static void main(String[] argv) throws IOException {
      try{
        servSock_chat = new ServerSocket(6000);
      }catch(IOException e){}
      
      clntSock=servSock_chat.accept();
      ChatThread c_t = new ChatThread(); 
      c_t.start(); 
  }
}