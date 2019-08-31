import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class GnomeRangeQuery {
	public int[] solution(String S, int[] P, int[] Q)
	{
		 TreeSet < Integer > ts = new TreeSet < Integer > ();
		ArrayList<Integer> res=new ArrayList<Integer>();
		ArrayList<Integer> ele=new ArrayList<Integer>();
		for(int i=0;i<P.length;i++)
		{
			String sub = null;
			if(P[i]!=Q[i]){		
			sub=S.substring(P[i],Q[i]+1);
			System.out.println(sub);}
			if(P[i]==Q[i]){
				Character c;
				c=S.charAt(P[i]);
				sub=Character.toString(c);
			System.out.println(sub);
			}
			System.out.println("sub:"+sub);
			if(sub.contains("A")){
			ele.add(1);	
			}
			if(sub.contains("C")){
				ele.add(2);	
				}
		
			if(sub.contains("G")){
				ele.add(3);	
				}
			if(sub.contains("T")){
				ele.add(4);	
				}	
		Collections.sort(ele);
		for(int in:ele)
		{
			System.out.println("in:"+in+ ",i:" +i);
		}
		res.add(ele.get(0));
		ele.clear();
		}
		 Integer[] result = new Integer[P.length]; 
	        result = res.toArray(result);
	      for(Integer i:result){
	    	  System.out.println(i);
	      }
	      System.out.println();
	        int ress[]=new int[result.length]; 
	      for(int i=0;i<result.length;i++)
	      {
	    	  ress[i]=result[i];
	    	  System.out.println(ress[i]);
	      }
	  
	      return ress;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GnomeRangeQuery g=new GnomeRangeQuery();
int P[]={2,5,0};
int Q[]={4,5,6};
g.solution("CAGCCTA", P, Q);
	}

}
