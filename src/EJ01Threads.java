public class EJ01Threads {
    public static void main(String[] args){
        int num_hilos = 8;
        Thread[] hijos = new Thread[num_hilos];
        for (int i = 0; i < num_hilos; i++) {

        }
    }
}
class MITareaConThread extends Thread{
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println("Soy el hilo "+ currentThread().threadId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}