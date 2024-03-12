public class MyClass {
    public static void main(String args[]) {
      int num1 = 11;
      int num2 = 33;
      while(true){
      if(num1 == num2)
      {
          System.out.println("НОД е " + num1);
          break;
      }
       else if(num1 > num2)
      {
          num1 = num1 - num2;
      }
       else if(num1 < num2)
      {
          num2 = num2 - num1;
      }
      
      }
       
    }
}
