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
//    public ListNode sortList(ListNode head) {
//
//
//
//        return sort(head);
//
//    }
//
//
//    public ListNode sort(ListNode head){
//
//        if( head == null || head.next == null)
//            return head ;
//
//
//
//        ListNode mid = middleNode(head);
//
//
//
//
//
//
//        ListNode first = sort(head) ;
//        ListNode second = sort(mid);
//
//
//        return mergeTwoLists(first , second);
//
//    }
//
//
//
//
//    public ListNode middleNode(ListNode head) {
//
//
//
//
//        ListNode first = head ;
//        ListNode second = head ;
//        ListNode midprev = null ;
//
//        while(first != null && first.next != null){
//
//
//            first = first.next.next ;
//            midprev = ( midprev == null)? second : midprev.next ;
//            second = second.next ;
//
//
//
//
//
//
//        }
//
//        midprev.next = null ;
//
//
//
//
//
//
//
//        return second;
//
//
//
//    }
//
//
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        ListNode dummyhead = new ListNode();
//
//        ListNode tail = dummyhead;
//
//
//        if(list1==null) return list2;
//        else if(list2==null) return list1;
//
//
//
//
//        while(list1 != null && list2 != null){
//
//
//            if( list1 .val < list2 .val){
//
//                tail.next = list1 ;
//                list1 = list1.next ;
//                tail = tail.next ;
//
//
//            }
//
//
//            else{
//
//
//                tail.next = list2 ;
//                list2 = list2.next ;
//                tail = tail.next ;
//
//            }
//
//
//        }
//
//
//
//        tail.next = (list1 != null) ?  list1 : list2 ;
//
//        return dummyhead.next ;
//
//    }
//
//
//
//
//
//
//}