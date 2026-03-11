public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next=null;

        }
    }

    static class Stack{
        public static Node head;
        public static Boolean isEmptu(){
            return head==null;

        }
        public static void push(int data){
             Node NewNode = new Node(data);
             if(isEmpty(NewNode)){
                head=NewNode;
                return;
             
            }
            NewNode.next = head;
            head=NewNode;

        }
        private static boolean isEmpty(StackClass.Node newNode) {
            return false;
        }
        public static int pop(){
            if(isEmpty(head)){
                return -1;

            }
            int top = head.data;
            head=head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty(head)){
                return -1;
            }
            return head.data;
        }
    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!isEmpty(head)){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
}