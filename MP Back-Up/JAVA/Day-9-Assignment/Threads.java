public class Threads {
    public static void main(String args[]){
        Thread thread1=new Thread(new NumberPrinter("Thread1"));
        Thread thread2=new Thread(new NumberPrinter("Thread2"));
        thread1.start();
        thread2.start();
    }
}
class NumberPrinter implements Runnable{
    private String threadName;
    public NumberPrinter(String threadName){
        this.threadName=threadName;
    }
    public void  run(){
        for(int i=1; i<=10;i++){
            System.out.println(threadName+":"+i);
              try{
                Thread.sleep(1000);
              }
              catch(InterruptedException e){
                e.printStackTrace();
              }
              }
        }    }
