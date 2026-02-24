// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        Node temp1 = head1;
        Node temp2  = head2;
        Set<Integer> set = new HashSet<>();
        
        while(temp1 != null){
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        
        int count = 0;
        while(temp2 != null){
            if(set.contains(x-temp2.data)) count++;
            temp2 = temp2.next;
        }
        
        return count;
    }
}