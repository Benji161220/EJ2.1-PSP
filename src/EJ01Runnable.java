public class EJ01Runnable{
    public static void main(String[] args){
        int num_hilos = 8;
        Thread[] hijos = new Thread[num_hilos];
        for (int i = 0; i < num_hilos; i++) {
            hijos[i] = new Thread(new MITarea());
        }
    }
}
class MITarea implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println("Soy el hilo "+ Thread.currentThread().threadId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}
