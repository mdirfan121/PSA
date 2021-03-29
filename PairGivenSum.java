public class Solution {
    public int solve(int[] A, int B) {
       int p1=0,p2=A.length-1;
       long ans=0;
       while(p1<p2){
           if(A[p1]+A[p2]>B){
               p2-=1;
           }
           else if(A[p1]+A[p2]<B){
               p1+=1;
           }
           else{
               if(A[p1]==A[p2]){
                   int x=(p2-p1)+1;
                   ans=ans+((1L*x*(x-1))/2);
                   ans%=1000000007;
                   break;
               }
               else{
                   int count1=0,count2=0;
                   while(A[p1]==A[p1+1]){
                       count1+=1;
                       p1+=1;
                   }
                   while(A[p2]==A[p2-1]){
                       count2+=1;
                       p2-=1;
                   }
                   ans=ans+((1L*(count1+1)*(count2+1))%1000000007);
                   p1+=1;
                   p2-=1;
               }
           }
       }
       return (int)(ans%1000000007);
    }
}
