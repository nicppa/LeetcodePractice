package SwapNodesInPairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
         ListNode first = head,second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }
}

class ListNode {
    int val;
    ListNode next;
 
    ListNode(int x) {
        val = x;
    }
}
