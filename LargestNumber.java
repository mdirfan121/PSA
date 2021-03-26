public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
             ArrayList<String> arr=new ArrayList<>();
             String ans="";
             for(int i=0;i<A.length;i++){
                 arr.add(A[i]+"");
             }
             Collections.sort(arr,(i,j)->{
                 String a=i+""+j;
                 String b=j+""+i;
                 return b.compareTo(a);
             }
             );
             if(arr.get(0).equals("0")){
                 return ans+="0";
             }
             for(int i=0;i<arr.size();i++){
                 ans+=arr.get(i);
             }
             return ans;
        }
}
