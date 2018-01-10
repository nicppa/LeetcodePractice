package MergeTwoSortedLists;

public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode result = new ListNode(0);
//        ListNode list1 = new ListNode(0);
//        ListNode list2 = new ListNode(0);
//
//        ListNode p = result;
//        list1.next = l1;
//        list2.next = l2;
//        ListNode q = null;
//        while(list1.next != null && list2.next != null){
//
//            if(list1.next.val <= list2.next.val){
//                list1 = list1.next;
//                q = new ListNode(list1.val);
//            }else{
//                list2 = list2.next;
//                q = new ListNode(list2.val);
//            }
//            p.next = q;
//            p = p.next;
//        }
//        while(list1.next!=null){                               //if(list1.next!=null){p.next=list1.next}
//            list1 = list1.next;                                //if(list2.next!=null){p.next=list2.next}
//            q = new ListNode(list1.val);
//            p.next = q;
//            p = p.next;
//
//        }
//        while(list2.next!=null){
//            list2 = list2.next;
//            q = new ListNode(list2.val);
//            p.next = q;
//            p = p.next;
//
//        }
//        return result.next;
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
