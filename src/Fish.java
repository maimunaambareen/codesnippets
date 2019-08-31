import java.util.Stack;

public class Fish {
	public int solution(int[] A, int[] B){
	int count=A.length;
	Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<A.length;i++)
	{
		if(B[i]==1)
		{
			stack.push(A[i]);
		}
	
	if(B[i]==0)
	{
		while(!stack.isEmpty())
		{
			if(stack.peek()>A[i])
			{
				count--;
			break;
			}
			else if(stack.peek()<A[i])
			{
				count--;
				stack.pop();
			}
			
		}
	}
	}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fish f=new Fish();
int A[]={4,3,2,1,5};int B[]={0,1,0,0,0};
f.solution(A, B);
	}

}
