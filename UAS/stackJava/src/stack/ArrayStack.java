package stack;
import java.util.EmptyStackException;

public class ArrayStack {

    private Mahasiswa[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Mahasiswa[capacity];
    }
    public void push (Mahasiswa mahasiswa){
        if(top == stack.length){
            Mahasiswa[] newArray = new Mahasiswa[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = mahasiswa;
    }
    public Mahasiswa pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Mahasiswa mahasiswa = stack[--top];
        stack[top] = null;
        return mahasiswa;
    }
    public Mahasiswa peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public int size(){
        return top;
    }
    public void printStack(){
        for(int i = top-1; i>= 0; i--){
            System.out.println(stack[i]);
        }
    }
}