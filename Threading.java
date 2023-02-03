// Nama : Nicolas Airel Valeriant Suwarno
// NIM  : 2540117981

class Multithread extends Thread {
        public void run() {
                System.out.println(Thread.currentThread().getName());
        }
}

public class Threading {
        public static void main(String[] args) {
                Multithread thread1 = new Multithread();
                thread1.setName("Threading is powerful");
                Multithread thread2 = new Multithread();
                thread2.setName("But we have to be careful");
                thread1.start();
                thread2.start();
        }
}