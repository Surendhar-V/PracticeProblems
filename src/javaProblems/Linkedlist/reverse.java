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
//    public ListNode reverseList(ListNode head) {
//
//
//        return reverse(head) ;
//
//
//    }
//
//    public ListNode reverse(ListNode head)
//    {
//
//
//        ListNode current = head;
//        ListNode prev = null ;
//
//
//
//        if(head == null){
//            return head ;
//        }
//        else if( head.next == null){
//            return head ;
//        }
//        ListNode next = head.next ;
//        while( current != null){
//
//
//            current.next = prev ;
//
//            prev = current ;
//            current = next ;
//
//            if(next != null){
//                next = next.next ;
//            }
//
//
//        }
//
//        return prev ;
//
//
//
//    }
//
//}