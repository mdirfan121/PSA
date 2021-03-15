public class Solution {
    public int colorful(int A) {
       int count=0;
        int B=A;
        while(B>0){
            B=B/10;
            count+=1;
        }
        ArrayList<Long> arr=new ArrayList<Long>();
        while(A>0){
            if(arr.contains((long)A%10)) return 0;
            arr.add((long)A%10);
            A=A/10;
        }
        ArrayList<Long> arr1=new ArrayList<Long>();
        arr1.add(arr.get(arr.size()-1));
        for(int i=1;i<arr.size();i++){
            arr1.add(arr1.get(i-1)*(1L*arr.get(arr.size()-1-i)));
        }
        long p=1;
        for(int i=1;i<arr1.size();i++){
            if(arr.contains(arr1.get(i))) return 0;
            else if(arr.contains(arr1.get(i)/p)) return 0;
            p=arr1.get(i-1);
        }
        return 1;
    }
}

