package RemoveDuplicatesFromSortedListII;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(pre.next == cur) {
                pre = pre.next;
            }else{
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val = val;
    }
}