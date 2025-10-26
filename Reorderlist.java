class Solution {
   ListNode middle(ListNode head)
   {
    ListNode sp=head;
    ListNode fp=head;
    while(fp!=null && fp.next!=null)
    {
        sp=sp.next;
        fp=fp.next.next;
    }
    return sp;
   }
   ListNode reverse(ListNode head)
   {
    ListNode prev=null;
    ListNode next=null;
    ListNode current=head;
    while(current!=null)
    {
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
   }
   return prev;
   }
    public void reorderList(ListNode head) {
        ListNode l1=middle(head);
        ListNode l2=reverse(l1.next);
        l1.next=null;
        l1=head;
        ListNode f1=null,f2=null;
        while(l1!=null&&l2!=null)
        {
            f1=l1.next;
            l1.next=l2;
            f2=l2.next;
            l2.next=f1;
            l1=f1;
            l2=f2;
        }
    }
}
