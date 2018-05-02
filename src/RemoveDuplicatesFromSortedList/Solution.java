package RemoveDuplicatesFromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        while(p != null){
            while(p.next != null && p.val == p.next.val){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return dummy.next;
    }

}
class ListNode{
    ListNode(int x){
        this.val = x;
    }
    int val;
    ListNode next;
}