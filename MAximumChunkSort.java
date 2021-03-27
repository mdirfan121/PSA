public class Solution {
    public int solve(int[] A) {
        int[] temp=new int[A.length];
        Map<Integer,Integer> freqmap=new HashMap<Integer,Integer>();
        Set<Integer> set=new HashSet<Integer>();
        int ans=0;
        for(int i=0;i<A.length;i++){
            temp[i]=A[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
            set.add(temp[i]);
            if(freqmap.containsKey(A[i])){
                freqmap.put(A[i],freqmap.get(A[i])+1);
                if(freqmap.get(A[i])==0){
                    set.remove(A[i]);
                }
            }
            else{
                freqmap.put(A[i],1);
            }
            if(freqmap.containsKey(temp[i])){
                freqmap.put(temp[i],freqmap.get(temp[i])-1);
                if(freqmap.get(temp[i])==0){
                    set.remove(temp[i]);
                }
            }
            else{
                freqmap.put(temp[i],-1);
            }
            if(set.size()==0){
                ans+=1;
            }
        }
        return ans;
    }
}
