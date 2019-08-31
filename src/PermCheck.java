import java.util.ArrayList;
import java.util.Collections;

public class PermCheck {
	public int solution(int[] a){
	System.out.println("inside solution");
		ArrayList<Integer> l=new ArrayList<Integer>();
	int res=0;
	for(int i:a)
	{
		l.add(i);
	}
	Collections.sort(l);
for(int i:l){
	System.out.println(i);
}
	for(int i=0;i<l.size();i++){
		if(l.get(i)==(l.get(i+1))-1)
		{
			System.out.println("ok");
			res=1;
			System.out.println(res);
			return res;
		}
		else{
			System.out.println(res);
			return res;
		}
	}
	return res;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PermCheck p=new PermCheck();
int a[]={4,1,3};
p.solution(a);
	}

}
