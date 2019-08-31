import java.util.Scanner;

public class CyclicRotation {
public int[] solution()
{

	System.out.println("enter the no of elements in array");	
	Scanner in=new Scanner(System.in);
int a[]=new int[in.nextInt()];
System.out.println("enter the elements");
Scanner scan=new Scanner(System.in);
int k=3;
for(int i=0;i<a.length;i++)
{
	a[i]=in.nextInt();
}
int size=a.length;
int[] a1=new int[size];
for(int i=0;i<size;i++)
{
a1[i]=a[((i+k)%size)];
}
for(int i=0;i<a1.length;i++)
{
	System.out.println(a1[i]);
}
return a;
}
public static void main(String ar[])
{
	CyclicRotation cr=new CyclicRotation();

cr.solution();
}
}
