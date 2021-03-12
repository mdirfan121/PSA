public class Solution {
    public int LCPrefix(String[] A, int B) {
        int p1=0,p2=1,count=0;
        long ans=0;
        while(p2<A.length){
            count=0;
            for(int j=0;j<B;j++){
                if(A[p1].charAt(j)==A[p2].charAt(j)){
                    count+=1;
                }
            }
            if(count==B){
                p2+=1;
            }
            else{
                ans+=p2-p1;
                p1+=1;
            }
        }
        ans+=((((p2-p1)*1L)*((p2-p1)+1))/2);
        return (int)(ans%1000000007);
    }
}
