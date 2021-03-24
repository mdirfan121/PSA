public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> maxval=maxValue(A,B);
        ArrayList<Integer> minval=minValue(A,B);
        long ans1=0,ans2=0;
        for(int i=0;i<minval.size();i++){
            ans1+=maxval.get(i);
            ans2+=minval.get(i);
        }
        ans1=((ans1+1000000007)%1000000007);
        ans2=((ans2+1000000007)%1000000007);
        return (int)(((ans1+ans2)+1000000007)%1000000007);
    }
    public ArrayList<Integer> maxValue(ArrayList<Integer> A,int B){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Deque<Integer> deque=new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            if(deque.isEmpty() || A.get(i)<A.get(deque.getLast())){
                deque.addLast(i);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())<A.get(i)){
                    deque.removeLast();
                }
                deque.addLast(i);
            }
        }
        ans.add(A.get(deque.getFirst()));
        int k=B;
        while(k<A.size()){
            if(deque.isEmpty() || A.get(k)<A.get(deque.getLast())){
                deque.addLast(k);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())<A.get(k)){
                    deque.removeLast();
                }
                deque.addLast(k);
            }
            while(!deque.isEmpty() && deque.getFirst()<((k-B)+1)){
                deque.removeFirst();
            }
            ans.add(A.get(deque.getFirst()));
            k+=1;
        }
        return ans;
    }
    public ArrayList<Integer> minValue(ArrayList<Integer> A,int B){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Deque<Integer> deque=new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            if(deque.isEmpty() || A.get(i)>A.get(deque.getLast())){
                deque.addLast(i);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())>=A.get(i)){
                    deque.removeLast();
                }
                deque.addLast(i);
            }
        }
        ans.add(A.get(deque.getFirst()));
        int k=B;
        while(k<A.size()){
            if(deque.isEmpty() || A.get(k)>A.get(deque.getLast())){
                deque.addLast(k);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())>=A.get(k)){
                    deque.removeLast();
                }
                deque.addLast(k);
            }
            while(!deque.isEmpty() && deque.getFirst()<((k-B)+1)){
                deque.removeFirst();
            }
            ans.add(A.get(deque.getFirst()));
            k+=1;
        }
        return ans;
    }
}
