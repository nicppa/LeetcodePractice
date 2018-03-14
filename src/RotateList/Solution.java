package RotateList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        if(k == 0 || head == null || head.next==null){
//            return head;
//        }
//
//        ListNode begin = head;
//        int count = 1;
//        while(begin.next != null){
//            begin = begin.next;
//            count++;
//        }
//        k%=count;
//        if(k == 0){
//            return head;
//        }
//        ListNode p = head;
//        int i = 1;
//        ListNode result = null;
//        while(p.next != null){
//            if(i == count-k){
//                result = p.next;
//                p.next = null;
//                ListNode temp = result;
//                while(temp != null&&temp.next!=null){
//                    temp = temp.next;
//                }
//                temp.next = head;
//                break;
//            }
//            p = p.next;
//            i++;
//
//        }
//        return result;
//    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy,slow = dummy;
        int i;
        for(i = 0;fast.next!=null;i++){
            fast = fast.next;
        }
        for(int j = i-k%i ;j > 0;j--){
            slow = slow.next;
        }
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}
