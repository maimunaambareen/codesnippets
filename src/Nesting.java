import java.util.Stack;

public class Nesting {
	public int solution(String S){
		char[] s=S.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='(')
			{
				//System.out.println("push "+i);
				stack.push(s[i]);
			}
			else if(!stack.isEmpty()&&s[i]==')')
			{
				//System.out.println("pop "+i);
				stack.pop();
			}
			else
			{
				stack.push(s[i]);
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("1");
			return 1;
		}
		System.out.println("0");
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nesting n=new Nesting();
String S = "(((((()";
n.solution(S);
	}

}
