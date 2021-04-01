public class Solution {
    public String addBinary(String A, String B) {
        int p1=A.length()-1;
        int p2=B.length()-1;
        int sum=0,carry=0;
        StringBuilder ans=new StringBuilder();
        while(p1>=0 || p2>=0 || carry!=0){
            if(p1>=0){
               sum+=A.charAt(p1)-'0'; 
            }
            if(p2>=0){
                sum+=B.charAt(p2)-'0';
            }
            sum+=carry;
            if(sum==3){
                ans.append(1);
                carry=1;
            }
            else if(sum==2){
                ans.append(0);
                carry=1;
            }
            else if(sum==1){
                ans.append(1);
                carry=0;
            }
            else{
                ans.append(0);
                carry=0;
            }
            sum=0;
            p1-=1;
            p2-=1;
        } 
        ans.reverse();
        return ans+"";
    }
}
