/* Description

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        while (hare != null && hare.next != null) {
            hare = (hare.next).next;
            turtle = turtle.next;
            if (hare == turtle) return true;
        }
        return false;
    }   
}

/* Floyd’s Cycle-Finding Algorithm 

time: O(N)
space: O(1)
can also be used to find the start of the loop, to do this, once a both pointers overlap, reset turtle to head of the linked list and then increment both hare and turtle by one until they meet. 
The point they meet is the start of the loop.
*/
