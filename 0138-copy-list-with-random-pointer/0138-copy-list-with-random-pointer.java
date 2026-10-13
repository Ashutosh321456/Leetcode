class Solution {
    public Node deepCopy(Node head1) {
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1!=null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
    public Node copyRandomList(Node head1) {
        // Step 1 : Creating deep copy of the original list
       Node head2 = deepCopy(head1); 
       HashMap<Node,Node> map = new HashMap<>();
       Node tempA = head1;
       Node tempB = head2;
       map.put(null,null);
       while(tempA != null){
        map.put(tempA,tempB);
        tempA = tempA.next;
        tempB = tempB.next;
       }
       tempA = head1;
       while(tempA != null){
        tempB = map.get(tempA);
        tempB.random = map.get(tempA.random);
        tempA = tempA.next;
       }

       return head2;
    }
}