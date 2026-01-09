// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;
public class Pythagorean_triplet {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    if((x*x)+(y*y)==(z*z))
    System.out.println("Pythagorean triplet");
    else if((x*x)+(z*z)==(y*y))
    System.out.println("Pythagorean triplet");
    else if((z*z)+(y*y)==(x*x))
    System.out.println("Pythagorean triplet");
    else
    System.out.println("Not a Pythagorean triplet");

  }  
}
