public class Ej01Threads {
    public static void main(String[] args) {
        int num_hilos = 8;
        MiTareaThread[] hilos = new MiTareaThread[num_hilos];
        for (int i=0;i<num_hilos;i++){
            hilos[i] = new MiTareaThread();
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
class MiTareaThread extends Thread {
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
