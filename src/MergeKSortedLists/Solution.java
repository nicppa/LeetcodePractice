package MergeKSortedLists;

import java.util.Arrays;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        if(lists.length == 2){
            return mergeTwoLists(lists[0],lists[1]);
        }
//        ListNode result = lists[0];
//        for(int i = 1;i < lists.length;i++){
//            result = mergeTwoLists(result,lists[i]);
//        }
//        return result;
        return mergeTwoLists(mergeKLists(Arrays.copyOfRange(lists,0,lists.length/2+1)),mergeKLists(Arrays.copyOfRange(lists,lists.length/2+1,lists.length)));

    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode result;
        if(l1.val < l2.val){
            result = l1;
            result.next=mergeTwoLists(l1.next,l2);
        }else{
            result = l2;
            result.next=mergeTwoLists(l1,l2.next);
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}