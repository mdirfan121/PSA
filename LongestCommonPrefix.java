public class Solution {
    public String longestCommonPrefix(String[] A) {
        String ans="";
        if(A.length==1) return A[0];
        int min_length=1000000,flag=1;
        for(int i=0;i<A.length;i++){
           min_length=Math.min(min_length,A[i].length());
        }
        int i=0,j=1;
        for(i=0;i<min_length;i++){
            for(j=1;j<A.length;j++){
                if(A[j].charAt(i)==A[j-1].charAt(i)){
                    flag=0;
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans+=A[j-1].charAt(i);
            }
            else if(flag==1){
                break;
            }
        }
        return ans;
    }
}
