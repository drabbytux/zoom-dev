public class ReCount {

  public static int addTheNumbers(int n){
    if(n==0) return n;
    int thesum = n + addTheNumbers(n-1);
    return thesum;
  }

  public static int numberOfSteps(int n){
    if(n<=0) return n;
    int sumOfStepstaken = 1 + numberOfSteps( n / 2);
    return sumOfStepstaken;
  }
  
  public static void main(String[] args) {
    System.out.println( addTheNumbers(5) );
    System.out.println( "Steps taken: " + numberOfSteps(12) );
  }
}
