public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        System.out.println("=> Slot of this queue is 6");
        System.out.println("enQueue: 3");
        q.enQueue(3);
        System.out.println("enQueue: 5");
        q.enQueue(5);
        System.out.println("enQueue: 0");
        q.enQueue(0);
        System.out.println("enQueue: 2");
        q.enQueue(2);
        System.out.println("enQueue: 9");
        q.enQueue(9);
        System.out.println("enQueue: 8");
        q.enQueue(8);
        System.out.println( q.print());
        System.out.println("\n=> Is this queue still can add more data? " + q.isEmpty() + "\n");
        System.out.println("enQueue: 98");
        q.enQueue(98);

        System.out.println("\n=> Peek (show the front of queue without take it)\n The front data of queue is " + q.peek());
        System.out.println("\n" + q.print());

        System.out.println("\n=> deQueue (automatically take the front of queue)\n");
        q.deQueue();
        System.out.println(q.print());
        System.out.println("\n=> Is this queue still can add more data? " + q.isEmpty() + "\n");
        System.out.println(q.print());
        System.out.println("\nenQueue: 10\n");
        q.enQueue(10);
        System.out.println(q.print());
    }
    
}
