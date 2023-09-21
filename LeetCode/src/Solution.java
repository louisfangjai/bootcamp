// LeetCode: 876
public class Solution {

    public static void main(String[] args) {
        ListNode node1 =
        .middleNode(3);
    }
    public ListNode middleNode(ListNode head) {
        // head is object reference
        // head.next -> Next Node
        // Part 1: Count Node in head
        ListNode node = head;
        int count = 1;
        while (node.next != null) {
            count++;
            node = node.next;
        }
        // Part 2: Loop to find the node by target count
        int target = count / 2 + 1;
        count = 1;
        node = head;
        while (count < target) {
            count++;
            node = node.next;
        }
        return node;
    }
}