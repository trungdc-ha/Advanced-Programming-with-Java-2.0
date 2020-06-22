package _11_stack_queue.ring_queue;

public class Solution {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);

        q.displayQueue();

        System.out.println("Deleted value = " + q.deQueue());
        System.out.println("Deleted value = " + q.deQueue());

        q.displayQueue();

        q.enQueue(11);
        q.enQueue(211);
        q.displayQueue();
    }
}
