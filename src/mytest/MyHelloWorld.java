package mytest;

public class MyHelloWorld {
  public static void main(String args[]){
    System.out.println("hello world java!");
    
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
