import java.util.TreeSet;

class MinPerimeterRectangle
{
	public int solution(int n)
	{
		 int sqrt = ((Double) Math.sqrt(n)).intValue();
		 //System.out.println(sqrt);
		int min=2*(1+(n/1));
		int i=1;
		while(i<=sqrt)
		{
			if(n%i==0&&i!=1&&(2*(i+(n/i)))<min)
		{
		
				min=2*(i+(n/i));
			
		}
		i=i+1;
		}
		return min;
	}
	public static void main(String ar[])
	{
		MinPerimeterRectangle m=new MinPerimeterRectangle();
		System.out.println(m.solution(30));
	}
}