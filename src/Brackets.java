import java.util.ArrayList;

public class Brackets {
	public int solution(String S){
		int flag=0;
		ArrayList<String> l=new ArrayList<String>();
		String a[]=S.split("");
		for(String str:a)
		{
			
			if(str.contains("("))
			{
			while(str.contains(")"))
			{
				l.add(str);
			flag=1;
			}
			}
			if(str.contains("{"))
			{
			while(str.contains("}")){
				l.add(str);
				flag=1;
				}
			}
			if(str.contains("["))
			{
			while(str.contains("]")){
				l.add(str);
				flag=1;
				}
			}
		}
	System.out.println(flag);	
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Brackets b=new Brackets();
String s="{[()()]}";	
b.solution(s);
	}

}
