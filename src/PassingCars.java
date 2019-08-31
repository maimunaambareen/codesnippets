import java.util.ArrayList;
import java.util.HashMap;

public class PassingCars {

	public int solution(int[] A) {
		  HashMap < Integer, Integer > hm = new HashMap < Integer, Integer > ();
		  int pairs = 0;
		  for (int i = 0; i < A.length; i++) {
		   if (pairs > 1000000000) {
		    return -1;
		   }
		   if (A[i] == 0) {
		    hm.put(i, A[i]);
		   } else {
		    pairs = pairs + (hm.size());
		   }
		  }
		  return pairs;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PassingCars p=new PassingCars();
int A[]={0,0,0,1,0};
p.solution(A);
	}

}
