package server;
import java.io.*;
import java.net.*;
public class server1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket();
		Socket s=ss.accept();
		System.out.println("connection Established");
		OutputStream obj=s.getOutputStream();
		PrintStream ps=new PrintStream(obj);
		String str="hello client";
		ps.print(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
	}
}
