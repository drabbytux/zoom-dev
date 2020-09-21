public class RecursionQuestion {

  // Question 1 Function
    public static int factorial2(int n){
      if(n==0 || n==1) return 1;
      return factorial2(n-2) * n;
    }

  // Question 2 Function
    public static int fib(int n){
      if(n==0) return 0;
      if(n==1) return 1;
      return fib(n-1) + fib(n-2);
    }

  public static void main(String[] args) {
    // Question 1 Run
      System.out.println( factorial2( 6 ));

    // Question 2 Run
      System.out.println( fib( 20 ));
  }

}