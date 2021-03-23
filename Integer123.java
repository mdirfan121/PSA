public class Solution {
    public ArrayList<Integer> solve(int A) {
        Queue<Integer> queue=new LinkedList<Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int count=0,i=1,x=0,flag=0;
        while(count!=A){
            queue.add((x*10)+i);
            count+=1;
            arr.add((x*10)+i);
            i++;
            if(i==4){
                x=queue.peek();
                queue.poll(); 
                i=1;
            }
        }
        return arr;
    }
}
