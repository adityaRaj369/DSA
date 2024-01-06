package generesis;

public class pair<T,S>{   //we can also write <t,s> but we need to define both in the class which we wrote in both clas
  
	private T first;
	private S second;
	public pair(){}
	public pair (T first,S second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public S getSecond() {
		return second;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public void setSecond(S second) {
		this.second=second;
	}
		
}
