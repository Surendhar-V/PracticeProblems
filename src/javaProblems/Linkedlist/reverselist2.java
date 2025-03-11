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
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//
//
//        ListNode current = head ;
//        ListNode prev = null  ;
//
//        for(int i = 0 ; i < left-1 ; i++){
//
//            prev = current ;
//            current = current.next;
//
//        }
//        //byt his time current wil be pointing to the starting of the sublist to be reversed and prev before that .
//        ListNode leftnode = prev ;
//        ListNode firstnode = current ;
//        //reverse...
//        ListNode next = null ;
//        for(int i = 0 ; i< right - left +1 ; i++){
//
//            next = current.next ;
//            current.next = prev ;
//            prev = current ;
//            current = next ;
//
//        }
//
//        if(leftnode == null){
//
//            head = prev;
//        }
//        else{
//            leftnode.next = prev ;
//
//        }
//
//        firstnode.next = current ;
//
//        return head ;
//
//
//
//    }
//}