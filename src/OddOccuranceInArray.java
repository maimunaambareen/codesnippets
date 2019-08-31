//import java.util.*;
//import java.util.Scanner;
//import java.util.Collections;   
//
//
//public class OddOccuranceInArray {
//	public int solution(int a[])
//	{
//		int no=0,res = 0;
////		System.out.println("Please insert odd number of elemnts");
////		Scanner in=new Scanner(System.in);
////		int a[]=new int[in.nextInt()];
////		System.out.println(a.length);
////		System.out.println("Please insert pair of elemnts except one");
////		Scanner input=new Scanner(System.in);
////		
////		for(int i=0;i<a.length;i++)
////		{
////			a[i]=input.nextInt();
////		System.out.println("a[i]"+a[i]);
////		}
//
//  for (int i = 0; i < a.length; i++) { 
//          
//int count=0;
//	          
//	        for (int j = 0; j < a.length; j++) 
//	        { 
//	            if (a[i] == a[j]) 
//	                count++; 
//	        } 
//	        if (count % 2 != 0) {
//	           System.out.println("res"+a[i]);
//	        	return a[i]; }
//	    } 
//
//	return 0;
//	
//	}
//	public int solution1(int a[])
//	{
//	int no=0,count=0,res = 0;
////	System.out.println("Please insert odd number of elemnts");
////	Scanner in=new Scanner(System.in);
////	int a[]=new int[in.nextInt()];
////	System.out.println(a.length);
////	System.out.println("Please insert pair of elemnts except one");
////	Scanner input=new Scanner(System.in);
////	
////	for(int i=0;i<a.length;i++)
////	{
////		a[i]=input.nextInt();
////	System.out.println("a[i]"+a[i]);
////	}
//	ArrayList<Integer> l=new ArrayList<Integer>();
//	for(Integer i:a)
//	{
//		l.add(i);
//	}
//	//List l = Arrays.asList(a);
//	Collections.sort(l);
// System.out.println("size"+l.size());
// for(Integer i:l)
// {
//	 System.out.println(i);
// }
//HashSet<Integer> set=new HashSet();
//for(Integer i:a){
//	set.add(i);
//}
//int res1=0;
//for(int i=0;i<a.length;i++){
//res1=Collections.frequency(l, a[i]);
//if(res1%2!=0)
//{
//	System.out.println("res"+a[i]);
//}
//
//}
//	return res1;
//	}	
//
//	public static void main(String ar[])
//{
//	OddOccuranceInArray o=new OddOccuranceInArray();
//	int A[]={9,3,9,9,7,9};
//	o.solution(A);
//}
//}
import java.util.*;
import java.lang.*;
import java.util.Collections;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class OddOccuranceInArray {
 public int solution(int[] A) throws RuntimeException {

  HashMap < Integer, Integer > mine = new HashMap < Integer, Integer > ();
  for (int i = 0; i < A.length; i++) {

   if (mine.containsKey(A[i])) {
    int exists = 0;
    int newval = mine.get(A[i]);
    mine.put(A[i], newval + 1);
   } else {
    mine.put(A[i], 1);
   }
  }
  Set < Integer > test = mine.keySet();
  for (int key: test) {
   if (mine.get(key) % 2 == 0)
    continue;
   else
    return key;
  }
  throw new RuntimeException();
 }
}