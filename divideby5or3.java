import java.util.Scanner;

/**
 * Write a description of class divideby5or3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divideby5or3
{
    public static void main(String[] args){
    int a;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter number : ");
    a = reader.nextInt();
    if (a%5==0 && a%3==0){
        System.out.println("it is divisible by both 5 and 3");
      }
      else if (a%5==0){
        System.out.println(" divisible by 5");
      }
      else if (a%3==0){
        System.out.println(" divisible by 3");
      }
      else
      System.out.println(" invaild");
    }
        
        
    }
    
    
    
        
        

