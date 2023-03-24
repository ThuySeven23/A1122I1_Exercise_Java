package trien_khai_cac_phuong_thuc_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>(2);
        linkedListInteger.add(0,1);
        linkedListInteger.add(5,4);
        linkedListInteger.add(2,3);
        linkedListInteger.printList();
        System.out.println("numNodes: "+linkedListInteger.size());
    
        System.out.println(linkedListInteger.get(1));
        
        linkedListInteger.removeElement(1);
      
        linkedListInteger.printList();
        System.out.println("numNodes: "+linkedListInteger.size());
       
        System.out.println(linkedListInteger.contains(1));
        System.out.println(linkedListInteger.contains(2));
      
        System.out.println(linkedListInteger.indexOf(1));
        System.out.println(linkedListInteger.indexOf(2));
    }
}
