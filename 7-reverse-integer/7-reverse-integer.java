class Solution {
    public int reverse(int x) {
        int flag = 0;
        if(x<0){
            flag = 1;
        }
        int temp = Math.abs(x);
        long ans = 0;
        while(temp>0){
            int local = temp%10;
            temp = temp/10;
            ans = ans*10+local;
        }
        if(ans>=Integer.MAX_VALUE || ans<=Integer.MIN_VALUE) return 0;
        else{
            if(flag ==1) return (int)(-ans);
            else return (int)ans;
        }
    }
}