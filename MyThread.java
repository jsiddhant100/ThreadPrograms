class MyThread extends Thread {
    public void run(){
        System.out.println("Hello All"); 
    }
    public static void main(String[] args) {
        MyThread[] mt= new MyThread[5];
        for(int i=0; i<5; i++){
            mt[i]= new MyThread();
        }
       for(int i=0; i<5; i++){
        mt[i].start();
       }
    }
}
