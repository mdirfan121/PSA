public class LittlePonny {
    public int[] solve(int[] a, int[] b) {
          int[] temp=new int[b.length];
          for(int i=1;i<a.length;i++){
              a[i]=a[i]+a[i-1];
          }
          for(int i=0;i<b.length;i++){
              int low=0,high=a.length-1,mid=0;
              while(low<=high){
                  mid=(low+high)/2;
                  if(b[i]>=a[mid]){
                      temp[i]=mid+1;
                      low=mid+1;
                  }
                  else{
                      high=mid-1;
                  }
              }
          }
          return temp;
    }
}
