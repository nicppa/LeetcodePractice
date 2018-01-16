package ReverseNodesInKGroup;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for(ListNode i = head; i != null;n++, i = i.next);

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        for(ListNode prev = dummy,tail = head; n >= k ; n-=k){
            for(int j = 1;j < k;j++){
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }
            prev = tail;
            tail = tail.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
