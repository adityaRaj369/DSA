package Thread;

public class B extends Thread{
	public void sum() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread B"+i);
		}
}
}