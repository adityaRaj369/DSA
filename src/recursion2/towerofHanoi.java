package recursion2;

public class towerofHanoi {
	public static void towerHanoi(int n,char source,char helper,char destination) {
		if(n==1) {
			System.out.println("move first disc from "+source+" to "+ destination );
			return;   //move first disc from source t destinatin
		}
		towerHanoi(n-1,source,destination,helper);   //move nth disc from source to destination using helper
		System.out.println("move "+n +"th disc from "+source+" to "+destination);
		towerHanoi(n-1,helper,source,destination);
		
	}

	public static void main(String[] args) {
		towerHanoi(2,'s','h','d');

	}

}
