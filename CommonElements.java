public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Map<Integer,Integer> temp=new HashMap<Integer,Integer>();
        for(int i=0;i<A.size();i++){
            if(temp.containsKey(A.get(i))){
                temp.put(A.get(i),temp.get(A.get(i))+1);
            }else{
                temp.put(A.get(i),1);
            }
        }
        for(int i=0;i<B.size();i++){
            if(temp.containsKey(B.get(i))){
                if(temp.get(B.get(i))>0){
                    ans.add(B.get(i));
                    temp.put(B.get(i),temp.get(B.get(i))-1);
                }
            }
        }
        return ans;
    }
}
