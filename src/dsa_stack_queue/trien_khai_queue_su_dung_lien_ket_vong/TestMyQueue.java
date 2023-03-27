package dsa_stack_queue.trien_khai_queue_su_dung_lien_ket_vong;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.displayQueue();
        System.out.println("-----------");
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();

    }
}
