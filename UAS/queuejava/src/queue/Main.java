package queue;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(3);

        Mahasiswa hendy = new Mahasiswa("Hendy","Sukandi",12);
        Mahasiswa kratos = new Mahasiswa("Kratos","",11);
        Mahasiswa steve = new Mahasiswa("Steve","",2);
        Mahasiswa lily = new Mahasiswa("Lily","Cortez",1);

        //menambahkan (insert) data ke queue/antrian
        queue.add(hendy);
        queue.add(steve);
        queue.add(kratos);
        queue.add(lily);

        // menampilkan (show) data yang ada di queue
        queue.printQueue();

        // menghapus (deletion) data yang pertama ditambahkan di queue
        queue.remove();

        // menampilkan data yang ada di queue
        System.out.println("");
        queue.printQueue();

        queue.add(kratos);

        // menampilkan data yang ada di queue
        System.out.println("");
        queue.printQueue();
    }
}