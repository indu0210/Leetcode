class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        
        for(ListNode curr = head; curr != null; curr = curr.next)
            stack.push(curr.val);
        
        for(ListNode curr = head; curr != null && stack.peek() == curr.val; curr = curr.next)
            stack.pop();
        
        return stack.isEmpty();    
    }
}
