import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadPool extends Thread
{
    static int j= 1;
    public void run()
    {
        for(int i=0; i<2; i++){
            System.out.println(j++);
        }
    }
    public static void main(String []args){
       ThreadPool t1=new ThreadPool();
       ThreadPool t2=new ThreadPool();
       ThreadPool t3=new ThreadPool();
       ThreadPool t4=new ThreadPool();
       ThreadPool t5=new ThreadPool();
      ExecutorService pool = Executors.newFixedThreadPool(5);  
      pool.execute(t1); 
      pool.execute(t2); 
      pool.execute(t3); 
      pool.execute(t4); 
      pool.execute(t5); 
      pool.shutdown();  
    }
}
