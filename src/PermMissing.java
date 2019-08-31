//import java.util.*;
//
//public class PermMissing {
//public int solution(int[] A)
//{
//	ArrayList<Integer> l=new ArrayList<Integer>();
//	for(int i:A)
//	{
//		l.add(i);
//	}
//	int res=0;
//	Collections.sort(l);
//	 if(l.size()==0)
//     {
//         return 1;
//     }
//	for(int i=1;i<l.size();i++)
//	{
//		//System.out.println(l.get(i));
//		int a=(int) l.get(i-1);
//		//System.out.println("a"+a);
//		int b=(int) l.get(i);
//		//System.out.println("b"+b);
//		if(b==(a+1))
//		{
//	//System.out.println("ok");		
//		}
//		else{
//			res=a+1;
//			System.out.println(res);
//			return res;
//		}
//	}
//	return l.size()+1;
//}
//	public static void main(String[] args) {
//		PermMissing p=new PermMissing();
//		int a[]={3,2,1,5};
//		p.solution(a);
//	}
//
//}
import java.util.*;
class PermMissing {
    public int solution(int[] A) {
       if(A.length==0)
       {
           return 1;
       }
      Arrays.sort(A); 
      for(int k=0;k<A.length;k++)
         {
              if(A[k]==k+1)
              continue;
              else if(A[k]==k+2)
              return k+1;
             
          }
    return A[A.length-1]+1;
    }
}