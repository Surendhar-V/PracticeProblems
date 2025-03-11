//https://leetcode.com/problems/middle-of-the-linked-list/submissions/


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
//    public ListNode middleNode(ListNode head) {
//
//
//        ListNode first = head ;
//        ListNode second = head ;
//        ListNode midprev = null ;

//        while(first != null && first.next != null){
//
//            first = first.next.next ;
//        midprev = ( midprev == null)? second : midprev.next ;

//            second = second.next ;
//        }        midprev.next = null ;
//        return second;
//
//    }
//}