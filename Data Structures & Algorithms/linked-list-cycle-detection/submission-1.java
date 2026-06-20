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

class Solution {
    public boolean hasCycle(ListNode head) {
        int index=-1;
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = head;
        if (head == null) return false;
        while(temp.next!=null){
            visited.add(temp);
            if(visited.contains(temp.next)){
                return true;

            }
            temp = temp.next;
        }
        return false;
    }
}
