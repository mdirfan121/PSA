public class Solution {
    public int solve(int[] A, int B) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        Set<Integer> set=new HashSet<Integer>();
        int count=0,k=0;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        int[] temp=new int[set.size()];
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()){
           temp[k++]=i.next(); 
        }
        for(int j=0;j<temp.length;j++){
            if(B==0){
                if(map.get(temp[j])>1){
                    count+=1;
                }
            }
            else{
                if(map.containsKey(B+temp[j])){
                    count+=1;
                }
            }
        }
        return count;
    }
}
