public class SubsetDuplicate {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Set<ArrayList<Integer>> arr=new LinkedHashSet<>();
        Collections.sort(A);
        arr.add(new ArrayList<Integer>());
        Set<ArrayList<Integer>> set=Subset(A,new ArrayList<Integer>(),arr,0);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
    public static  Set<ArrayList<Integer>> Subset(ArrayList<Integer> a,ArrayList<Integer> temp, Set<ArrayList<Integer>> ans, int k){
        for(int i=k;i<a.size();i++){

                temp.add(a.get(i));
                ans.add(new ArrayList(temp));
                Subset(a,temp,ans,i+1);
                temp.remove(temp.size()-1);
        }
        return ans;
    }
}
