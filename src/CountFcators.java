
public class CountFcators {
	public int solution(int N){
	int countfactor=0;
	int factor=1;
	int res=0;
	if(N>0){
	while (factor<N){
		res=N%factor==0?countfactor++:factor++;
System.out.println(countfactor);
System.out.println(factor);
	}

	return res;
	}
	return 0;
	}
	public static void main(String[] args) {
		CountFcators c=new CountFcators();
		System.out.println(c.solution(24));

	}

}
