import java.util.Scanner;

/**
 * Write a description of class passorFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passorFail
{
    public static void main(String[] args)
 {
  int a;
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter your score from examnation : ");
  a = reader.nextInt();
  
  if (a>=40)
  {
   System.out.println("you have pass the examination");
  }
  else
   System.out.println("you have fail the examination");
 }


}
