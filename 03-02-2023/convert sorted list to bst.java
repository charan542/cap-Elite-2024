class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            TreeNode root=new TreeNode(head.val);
            return root;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head,pre=null;
        
        while(fast!=null&&fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=pre;
        TreeNode r=new TreeNode(slow.val);
        r.left=sortedListToBST(head);;
        r.right=sortedListToBST(slow.next);
        return r;
    }
}
