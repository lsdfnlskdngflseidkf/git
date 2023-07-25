
import java.util.Scanner;
class Factorial{
 int fact(int n){
    if(n==0){
        return 1;
    }
    else
    return n*(fact(n-1));
 }
 public static void main(String[] args) {
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to calculate the factoral of:");
        int num=in.nextInt();
        Factorial f= new Factorial();
        System.out.println("The factorial of "+num+" is "+f.fact(num));
    }
 }
}