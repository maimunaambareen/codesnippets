
public class TapeEquilibrium {
   
    public int solution(int[] A) {
        int N=A.length;
        int total=0;
        int diff=0;
       
        int left=0;
        int right=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=N-1;i++)
        {
            total=total+A[i];
        }
      for(int i=0;i<N-1;i++)
      {
          if(i>0)
          left=left+A[i];
          else
          left=A[i];
          right=total-left;
          diff=Math.abs(left-right);
          res=  Math.min(res , diff);
      } 
      return res;  
    }
}