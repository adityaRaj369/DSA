package recursion2;

public class mergesort {
	public static void merge(int []s1,int []s2,int[]d) {
		int i=0;
		int j=0;
		int k=0;    //index of combined array
		while(i<s1.length && j<s2.length) {
			if(s1[i]<=s2[i]) {
				d[k]=s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				k++;
				j++;
			}
		}
		 if(i<s1.length) {
			 while(i<s1.length) {   //for remaining elements in 1st array
				 d[k]=s1[i];
					i++;
					k++;
			 }
		 }
		 if(j<s2.length) {
			 while(j<s2.length) {    //for remaining elements in 2nd array
				 d[k]=s2[j];
					
					k++;
					j++; 
			 }
		 }
	}
	
    public static void mergeSort(int a[]) {
    	if(a.length<=1) {
    		return ;
    	}
    	int b[]=new int[a.length/2];
    	int c[]=new int[a.length-b.length];
    	for(int i=0;i<a.length/2;i++) {
    		b[i]=a[i];
    	}
    	for(int i=a.length/2;i<a.length;i++) {
    		c[i-a.length/2]=a[i];
    	}
    	mergeSort(b);
    	mergeSort(c);
    	merge(b,c,a);
    	
    	
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a= {9,8,7,6,5,4,3,2,1};
        mergeSort(a);
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]);
        }
	}

}
