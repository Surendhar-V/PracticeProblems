////https://leetcode.com/problems/linked-list-cycle-ii/submissions/
//
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//
//        int length = findlength(head);
//
//        if(length == 0 ){
//            return null ;
//        }
//
//
//        ListNode first = head ;
//
//        do{
//
//            first = first.next;
//            length -- ;
//
//        }while(length != 0);
//
//        ListNode second = head ;
//
//
//        while( first != second){
//            first = first.next ;
//            second = second .next;
//        }
//
//        return first ;
//
//
//
//    }
//
//
//
//    public int findlength(ListNode head) {
//
//        ListNode fast = head;
//        ListNode slow =head;
//
//
//
//
//        while( fast != null && fast.next != null){
//
//
//            fast = fast.next.next ;
//            slow = slow.next ;
//
//            if( fast == slow){
//
//                ListNode first = slow ;
//                int length =0 ;
//
//                do {
//                    first = first.next ;
//                    length ++ ;
//                } while(first != slow );
//
//                return length  ;
//
//            }
//
//
//        }
//        return  0 ;
//
//
//    }
//
//
//
//}