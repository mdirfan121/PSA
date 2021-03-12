public class Solution {
    public int solve(String A) {
        int[] arr=new int[26];
        int ans=0,flag=0,finalgcd=0;
        for(int i=0;i<A.length();i++){
            arr[A.charAt(i)-'a']+=1;;
        }
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            finalgcd=gcd(finalgcd,temp.get(i));
        }
        return A.length()/finalgcd;
    }
    public int gcd(int first, int second){
        if(first==0) return second;
        else return gcd(second%first,first);
    }
}
