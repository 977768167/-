/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNode {
    ListNode next;
    int val;
    ListNode(int x) {
        val = x;
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long i1=0,i2=0,sum;
        long w=1;

        while (l1!=null){
            i1+=l1.val*w;
            w=w*10;
            l1=l1.next;
        }

        w=1;
        while (l2!=null){
            i2+=l2.val*w;
            w=w*10;
            l2=l2.next;
        }

        sum=i1+i2;

        char[] vals=Long.toString(sum).toCharArray();

        ListNode p,h;
        h=new ListNode(1);
        p=h;
        for (int i = 0; i <vals.length ; i++) {
            ListNode listNode = new ListNode(Integer.parseInt(String.valueOf(vals[i])));
            p.next=listNode;
            p=p.next;
        }
        h=h.next;
        return h;
    }
}

