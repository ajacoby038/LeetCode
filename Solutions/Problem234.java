/*
    234. Palindrome Linked List

    Given the head of a singly linked list, return true if it is a palindrome.

    Example 1:
    Input: head = [1,2,2,1]
    Output: true

    Example 2:
    Input: head = [1,2]
    Output: false

    Constraints:
    The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 9
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
class Problem234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ArrayList<ListNode> reg = new ArrayList<ListNode>();
        while (head != null) {
            reg.add(head);
            head = head.next;
        }
        int i = 0;
        int j = reg.size() - 1;
        while (i < j) {
            if (reg.get(i).val != reg.get(j).val) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}