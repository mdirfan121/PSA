    static class Node{
        int val;
        Node next;
        Node(int x){
            this.val=x;
        }
    }
    static Node head=null;
    public static void insert_node(int position, int value) {
          int count=count();
          Node temp=head;
          int k=1;
          Node newnode=new Node(value);
          if(position<1 || position>count+1){
              return;
          }
          else if(position==1){
              newnode.next=head;
              head=newnode;
          }
          else{
              while(k<position-1){
                  temp=temp.next;
                  k+=1;
              }
              newnode.next=temp.next;
              temp.next=newnode;
          }
    }
    public static void delete_node(int position) {
        int count=count();
        Node temp=head;
        int k=1;
        if(position<1 || position>count){
            return;
        }
        else if(position==1){
            head=head.next;
        }
        else{
            while(k<position-1){
                temp=temp.next;
                k+=1;
            }
            temp.next=temp.next.next;
        }
    }

    public static void print_ll() {
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.val);
            }
            else System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static int count(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }

