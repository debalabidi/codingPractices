package com.practice.leetcode.ebay;

/**
 * Created by dabidi on 8/1/19.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ReverseLinkedList app = new ReverseLinkedList();
        ListNode input1 = new ListNode(1);
        ListNode input2 = new ListNode(2);
        input1.next = input2;
        ListNode input3 = new ListNode(3);
        input2.next = input3;
        ListNode input4 = new ListNode(4);
        input3.next = input4;
        ListNode input5 = new ListNode(5);
        input4.next = input5;

        ListNode result = app.reverseList(input1);
//        ListNode result = app.reverseListIteratively(input1);

        while(result != null ){
            System.out.println("result.val = " + result.val);
            result = result.next;
        }

    }

    public ListNode reverseList(ListNode head) {
        //return reverseListIteratively(head);
        return reverseListRecursively( head);
    }

    public ListNode reverseListRecursively(ListNode head){

        if(head == null || head.next == null){
            return head;
        }else{
            ListNode p = reverseListRecursively(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }

    }

    public ListNode reverseListIteratively(ListNode head){
        ListNode previousNode = null;
        ListNode currentNode = head ;
        ListNode temp = null;
        while(currentNode != null){

            temp = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = temp;
        }

        return previousNode;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


