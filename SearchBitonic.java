public class SearchBitonic {
    public static void main(String args[]) {
       int[] arr={1, 20, 50, 40, 10};
       int index=func(arr);
       int l=0,h=index-1,m=0;
       int final_ans=-1,x=5;
       System.out.println(index);
       while(l<=h){
           m=(l+h)/2;
           if(arr[m]==x){
               final_ans=m;
               break;
           }
           else if(arr[m]>x){
               h=m-1;
           }
           else{
               l=m+1;
           }
       }
       l=index;
       h=arr.length-1;
       while(l<=h){
           m=(l+h)/2;
           if(arr[m]==x){
               final_ans=m;
               break;
           }
           else if(arr[m]>x){
               l=m+1;
           }
           else{
               h=m-1;
           }
       }
       System.out.println(final_ans);
    }
    public static int func(int[] arr){
        int low=0,high=arr.length-1,mid=0;
        int ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(mid==arr.length-1){
                if(arr[mid-1]>arr[mid]){
                    ans=mid;
                    high=mid-1;
                }
            }
            else{
                if(arr[mid]>arr[mid+1]){
                    ans=mid+1;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return ans;
    }
}