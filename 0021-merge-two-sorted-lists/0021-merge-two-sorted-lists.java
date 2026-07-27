class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the head of the new list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Traverse both lists and attach the smaller node to the merged list
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            // Move the current pointer forward
            current = current.next;
        }
        
        // Attach any remaining nodes from either list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }
        
        // Return the actual head of the merged list (skipping the dummy node)
        return dummy.next;
    }
}