public class Main extends Thread{

   public void run() {  
        System.out.println("Thread 1");  
    }  
     public static void main(String []args){
       HelloWorld t1=new HelloWorld();
     
      t1.start();
    }
}