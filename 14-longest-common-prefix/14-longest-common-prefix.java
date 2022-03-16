class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String ans = "";
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
           minimum = Math.min(minimum,strs[i].length());
        }
        int count = 0;
        int flag = 0;
        String temp = "";
        String temp2 = "";
        while(count<minimum){
            for(int i=0;i<strs.length-1;i++){
                temp = strs[i];
                temp2 = strs[i+1];
                if(temp.charAt(count) != temp2.charAt(count)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                break;
            else{
                ans+=temp.charAt(count);
                count+=1;
            }
        }
        return ans;
    }
}