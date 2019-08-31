
public class Mult {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		a[0]=new int[]{1,2,3};
		a[1]=new int[]{4,5,6};
		a[2]=new int[]{7,8,9};
		int b[][]=new int[3][3];
		b[0]=new int[]{1,2,3};
		b[1]=new int[]{4,5,6};
		b[2]=new int[]{7,8,9};
int c[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			c[i][j]=0;
			for(int k=0;k<3;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
			System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}

	}

}
