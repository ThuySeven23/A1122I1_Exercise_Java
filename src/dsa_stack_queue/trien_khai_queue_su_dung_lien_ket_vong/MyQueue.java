package dsa_stack_queue.trien_khai_queue_su_dung_lien_ket_vong;

import java.util.EmptyStackException;

public class MyQueue {
    private Node front;
    private Node rear;
    private int numNodes;

    public MyQueue(){
        front = rear = null;
    }
    public class Node{
        private int data;
        private Node linked;

        public Node(int data){
            this.data = data;
        }
        public int getData(){
            return this.data;
        }
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if (front == null){
            front = rear = temp;
            numNodes++;
        }else {
            rear.linked = temp;
            rear = temp;
            rear.linked = front;
            numNodes++;
        }
    }
    public void deQueue(){
        if (front == null){
            throw new EmptyStackException();
        }else if (front == rear){
            front = rear = null;
            numNodes--;
        }else {
            front = front.linked;
            rear.linked = null;
            numNodes--;
        }
    }

    public void displayQueue(){
        if (front == null){
            System.out.println("Empty");
        }else {
            Node temp = front;
            for (int i = 0; i < numNodes; i++){
                System.out.println(temp.getData());
                temp = temp.linked;
            }
        }
    }
}
