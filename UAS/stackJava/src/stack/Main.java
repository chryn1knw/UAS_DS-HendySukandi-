package stack;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
            ArrayStack stack = new ArrayStack(10);

            // insert data ke stack
            stack.push(new Mahasiswa("Hendy", "Sukandi", 1));
            stack.push(new Mahasiswa("Hikaru", "Nakamura", 2));
            stack.push(new Mahasiswa("Lily", "Cortez", 3));
            stack.push(new Mahasiswa("Kratos", "", 4));
            stack.push(new Mahasiswa("Demos", "", 5));

            // show stack
            stack.printStack();

            // delete stack
            stack.pop();

            // insert stack
            stack.push(new Mahasiswa("Magnus","Carlsen",6));

            //show stack
            System.out.println("");
            stack.printStack();
        }
}