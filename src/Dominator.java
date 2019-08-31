
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Dominator {

	public int solution(int[] A) {

		  ArrayList < Integer > ar = new ArrayList < Integer > ();
		  int finalval = -1;
		  int key = 0;
		  int sizelook;
		  if (A.length == 1)
		   return 0;

		  if (A.length > 1) {
		   sizelook = A.length / 2;
		  } else return finalval;
		  HashMap < Integer, Integer > hm = new HashMap < Integer, Integer > ();
		  for (int i = 0; i < A.length; i++) {
		   ar.add(A[i]);

		   if (hm.containsKey(A[i])) {
		    int occurance = hm.get(A[i]);
		    hm.put(A[i], occurance + 1);

		   } else
		    hm.put(A[i], 1);
		  }
		  Collection < Integer > s = hm.values();
		  List < Integer > l = new ArrayList < Integer > (s);
		  Collections.sort(l);
		  for (Map.Entry < Integer, Integer > e: hm.entrySet())
		  {
		   if (e.getValue() == l.get(l.size() - 1)) {
		    key = e.getKey();
		   System.out.println(key);
		    break;

		   }
		  }
		  if (hm.get(key) > sizelook)
		   finalval = ar.lastIndexOf(key);
		  System.out.println(finalval);
		  return finalval;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dominator d=new Dominator();
int A[]={3,4,3,2,3,-1,3,3};
d.solution(A);
	}

}
