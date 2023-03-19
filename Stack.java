import java.util.Arrays;

public class Stack {
    int[] stack = new int[9];
    static int top = -1;
    static int index = 0;

    // public void Push(int element) {
    //     if (index < stack.length) {
    //         stack[index] = element;
    //         top++;
    //         index++;
    //     } else {
    //         System.out.println("Stack is full");
    //     }
    // }

    public void Push(int element) { //unlimited length
        int[] temp;
        if(top+1 < stack.length){
        this.stack[top+1] = element;
        top++;
        } else {
            temp = Arrays.copyOf(stack, stack.length+1);
            temp[top+1] = element;
            top++;
            stack = Arrays.copyOf(temp, temp.length);
        }
    }

    public Integer Pop() {
        if (top >= 0) {
            int pop = stack[top];
            stack[top] = 0;
            top--;
            System.out.println("Data " + pop + " diambil");
            return pop;
        } else {
            System.out.println("Stack kosong, tidak dapat mengambil data apapun");
            return null;
        }
    }
 
    public void clear(){
        while (!isEmpty()) {
            Pop();
        }
    }

    public boolean isFull() {
        return (top == this.stack.length-1);
    }

    // public boolean cekSlot() {
    //     return !(top == this.stack.length-1);
    // }

    public boolean isEmpty() {
        return (top == -1 && index == 0);
    }

    public int Peek() {
        return stack[top];
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = top; i >= 0; i--) {
            if (i == top) {
                temp += "\n| " + stack[i] + " |";
                temp += "===> Data Teratas";
                continue;
            }
            temp += "\n| " + stack[i] + " |";
        }
        if (temp == "") {
            temp += "\nSTACK KOSONG !";
        } else {
            temp += "\n-----";
        }
        return temp;
    }
}