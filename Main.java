import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    for (int i = 1; i <= 25; i+=2)
    {
      System.out.println(i);
    }
    // Problem 2
    for (int i = 17; i <= 73; i++)
    {
      System.out.print(i +  " ");
      if (i % 10 == 6)
      {
        System.out.println();
      }
    }
    // Problem 3
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 50:");
    int n = sc.nextInt();
    if (!(0 <= n && n <= 50))
    {
      System.out.println("Error");
    }
    else
    {
      for (int i = n; i <= 50; i++)
      {
        System.out.print(i + " ");
        if (i % 5 == (n + 4) % 5)
        {
          System.out.println();
        }
      }
    }
    // Problem 4
    System.out.println("Enter a positive integer:");
    n = sc.nextInt();
    if (n > 0)
    {
      n -= (n % 3);	
     for (int i = n; i >= 0; i -= 3)
     {
      System.out.print(i + " ");
     }
    }
    else
    {
      System.out.println("error");
    }
  }
}
