package server;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class client1 {
    public static void main(String [] args) throws Exception{
    	Socket s=new Socket("Localhost",777);
    	InputStream obj=s.getInputStream();
    	BufferedReader br=new BufferedReader(new InputStreamReader(obj));
    	String str;
    	while((str=br.readLine())!=null) {
    		System.out.println("From Server :"+str);
    		br.close();
    		s.close();
    		
    	}
    }
}
