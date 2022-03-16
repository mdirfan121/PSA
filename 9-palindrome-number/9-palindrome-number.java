class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        ArrayList<Integer> arr = new ArrayList<>();
        int flag = 0;
        while(x!=0){
            arr.add(x%10);
            x=x/10;
        }
        for(int i=0;i<arr.size()/2;i++){
            if(arr.get(i)!=arr.get(arr.size()-i-1)){
                flag = 1;
                break;
            }
        }
        if(flag==0) return true;
        else return false;
    }
}