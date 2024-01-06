package JavaLab;

public class Producer {
     StringBuffer sb;
     Producer(){
    	 sb=new StringBuffer();
     }
     public void run() {
    	 Synchronize(sb);
     }
     for(int i=1;i<=10;i++) {
    	 try {
			sb.append(it+":");
    	 }
     }
}
