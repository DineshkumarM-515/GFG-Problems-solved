class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node temp = head;
        
        while(temp != null){
            
            for(int i=1;i<m && temp != null;i++){
                temp = temp.next;
            }
            
            if(temp == null) return;
            
            Node del = temp.next;
            for(int i=0;i<n && del != null;i++){
                del = del.next; 
            }
            
            temp.next = del;
            temp = del;
            
        }
        
        
    }
}