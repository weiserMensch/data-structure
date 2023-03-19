public class Queue {
    int[] queue;
    int front;
    int rear;

    public Queue(int length) {
        this.queue = new int[length];
        
    }
    
    public void enQueue(int data){ //insert data
        if(rear < queue.length){
            this.queue[rear] = data;
            rear++;
        } else {
           System.out.println("This Queue is full!!\nPlease deQueue this queue fisrt.\n ");
        }
    }

    public int deQueue(){ //remove data
        int f = queue[front];
        for (int i = 0; i < queue.length; i++) {
            if (i == queue.length-1) {
                queue[i] = 0;
                rear--;
            } else{
                queue[i] = queue[i+1];
            }
        }
        return f;
    }

    public int peek(){ //to show the front of queue
        return queue[front];
    }

    public boolean isEmpty(){//check is the queue still can add more data
        for (int i = 0; i < queue.length; i++) {
            if (i == rear && queue[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public String print() {
        String temp = "";
        for (int i = 0; i < queue.length; i++) {
            if(i < rear){
                temp += queue[i] + " ";
            } else {
                continue;
            }
        }
        return temp;
    }

    // public String toString() {
    //     return Arrays.toString(queue);
    // }
}
