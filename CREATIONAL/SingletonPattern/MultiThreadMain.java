import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiThreadMain{
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(()-> SingletonPattern.getConstructor());
        executor.execute(()-> SingletonPattern.getConstructor());
        executor.execute(()-> SingletonPattern.getConstructor());

        executor.execute(()-> SingletonPattern.getConstructor());

        executor.execute(()-> SingletonPattern.getConstructor());
        executor.execute(()-> SingletonPattern.getConstructor());

    }
}