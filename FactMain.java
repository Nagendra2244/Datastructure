/*Recursion Method */

class Factmain1
  {
      int fact(int n){
                 if(n==1)
                      return 1;
                 else
                     return n*fact(n-1);
             }
    }
class FactMain{
 public static void main(String args[]){
               Factmain1 f1=new Factmain1();
                 int K=f1.fact(7);
        System.out.println("The Factorial value is:"+K);
         }
}