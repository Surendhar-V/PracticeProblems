///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public void reorderList(ListNode head) {
//
//
//
//        if(  head.next == null){
//            printvalues(head);
//            return ;
//        }
//
//
//
//        ListNode leftnode = mid(head);
//
//
//        //reverse.....
//
//        ListNode prev = null ;
//        ListNode next = null ;
//        ListNode current = leftnode.next ;
//
//        while(current != null)
//        {
//
//            next = current.next ;
//            current.next = prev;
//            prev = current ;
//            current = next ;
//
//
//        }
//
//        leftnode.next = prev;
//        ListNode mid = mid( head);
//        mid = mid.next ;
//
//
//        ListNode next1 = null ;
//        ListNode next2 = null ;
//
//        ListNode i = head ;
//        ListNode j = mid ;
//
//        while(true ){
//
//            next1 = i.next;
//            next2 = j.next;
//
//            i.next = j ;
//
//            if( next1 == mid) {
//                break;
//            }
//
//            j.next = next1 ;
//            i = next1 ;
//            j = next2 ;
//
//
//        }
//
//        printvalues(head);
//
//
//
//
//
//
//    }
//
//
//    public void printvalues(ListNode temp) {
//
//
//
//
//        while(temp != null )
//        {
//            System.out.print ( temp.val );
//            temp = temp.next;
//        }
//
//    }
//
//    public ListNode mid( ListNode head ){
//
//
//        ListNode dummy = new ListNode();
//        dummy.next = head ;
//
//        ListNode slow = dummy ;
//        ListNode fast = head ;
//        while(fast != null && fast.next != null){
//
//
//            slow = slow.next;
//            fast = fast.next.next ;
//
//
//        }
//        return slow ;
//
//    }
//
//
//}
