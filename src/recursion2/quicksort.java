package recursion2;

public class quicksort {
	public static int partition(int[]a,int si,int ei) {
		int pivotelement=a[si];
		int smallNumCount=0;
		for(int i=si+1;i<=ei;i++) {
			if(a[i]<pivotelement) {
				smallNumCount++;
			}
		}
		int temp=a[si+smallNumCount];
		a[si+smallNumCount]=pivotelement;
		a[si]=temp;
		int i=si;
		int j=ei;
		while(i<j) {
			if(a[i]<=pivotelement) {
				i++;
			}
			else if(a[j]>=pivotelement) {
				j--;
			}
			else {   //swap
			    temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return si+smallNumCount;
		}
    public static void quicksort(int []a,int si,int ei) {
    	if(si>=ei) {
    		return;
    	}
    	int pivotindex=partition(a,si,ei);   //this function will be used to find the proper index position for the element so that all elements on the left side is less than the element and all on the right side is greater than the element 
    	quicksort(a,si,pivotindex-1);   //caling quicksort on both the sides of the number which is at pivotindex
    	quicksort(a,pivotindex+1,ei);
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,6,5,4,3,2,1};
		quicksort(a,0,a.length-1);
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]);
		}
		
	}

}
