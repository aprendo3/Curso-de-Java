package ejercicios.medio;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
    public String toString() {
        return "Node{" + "val=" + val +
                ", next=" + next + '}';
    }
}
