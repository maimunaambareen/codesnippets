//import java.util.TreeSet;
//
//public class MaxProfit {
//	public int solution(int[] a){
//		TreeSet<Integer> t=new TreeSet<Integer>();
//		if(a.length==0)return 0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++){
//				if(a[j]>a[i])
//				t.add(a[j]-a[i]);
//			}	
//			}
//		//System.out.println("..."+t.pollLast());
//		if(t.size()!=0)
//		return t.last();
//		else
//			return 0;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//MaxProfit m=new MaxProfit();
//int A[]={23171, 21011, 21123, 21366, 21013, 21367};
//	//m.solution(A);
//System.out.println(m.solution(A));
//	}
//
//}
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.TreeSet;

public class MaxProfit {
	public int solution(int[] a){
		//TreeSet<Integer> t=new TreeSet<Integer>();
		if(a.length==0)return 0;
		int profit=0;
		int first=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=first){
			for(int j=i+1;j<a.length;j++){
				if((a[j]>a[i])&&((a[j]-a[i])>profit)){
				    profit=a[j]-a[i];
				}	
			}	
			}
			}
		return profit;
		
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
MaxProfit m=new MaxProfit();
int A[]={23171, 21011, 21123, 21366, 21013, 21367};
//m.solution(A);
System.out.println(m.solution(A));
}

}
