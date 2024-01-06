package Thread;
public class A extends Thread{
	public void sum() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread A"+i);
		}
	}
}