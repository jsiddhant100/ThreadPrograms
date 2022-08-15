class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Hello India"); 
    }
    public static void main(String[] args) {
    
        MyRunnable[] mt= new MyRunnable[5];
        for(int i=0; i<5; i++){
            mt[i]= new MyRunnable();
        }
       for(int i=0; i<5; i++){
    Thread t = new Thread(mt[i]);
        t.start();
       }
    }
}
