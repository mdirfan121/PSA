public class Subset {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>());
        Collections.sort(A);
        recursiveCall(A,arr,new ArrayList<Integer>(),0);
        return arr;

    }
    public static void recursiveCall(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> subset,int index){
        for(int i=index;i<a.size();i++){
            
            subset.add(a.get(i));
            
            arr.add(new ArrayList<Integer>(subset));
            recursiveCall(a,arr,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}
