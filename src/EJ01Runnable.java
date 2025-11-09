public class Ej01Runnable {
    public static void main(String[] args) {
        int num_hilos = 8;
        Thread[] hilos = new Thread[num_hilos];
        for (int i=0;i<num_hilos;i++){
            hilos[i] = new Thread(new MiTareaRunnable());
            hilos[i].start();
        }
        for (int i=0;i<num_hilos;i++){
            try {
                hilos[i].join();
                System.out.println("El programa ha finalizado correctamente");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MiTareaRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<6;i++){
            System.out.println("Soy el hilo: "+Thread.currentThread().getId()+", mi cont: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
