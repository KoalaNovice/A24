import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class StepNineAndTen
{
  public static void main(String[] args) 
  {
    boolean playAgain = true;
    String choice = "a";
    String userString = "placeholder";
    int index = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> foodList = new ArrayList<String>(); 
    foodList.add("Apple");
    foodList.add("Banana");
    foodList.add("Kiwi");
    while (playAgain == true)
    {
        System.out.println(foodList);
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?");
        choice = sc.nextLine();
        
        if (choice.equals("a"))
        {
          System.out.println("Enter a fruit: ");
          foodList.add(sc.nextLine());
        }
        if (choice.equals("i"))
        {
          System.out.println("Enter a fruit: ");
          userString = sc.nextLine();
          System.out.println("Enter a position: ");
          index = sc.nextInt() - 1;
          foodList.add(index, userString);
        }
        if (choice.equals("r"))
        {
          System.out.println("Enter a position: ");
          index = sc.nextInt() - 1;
          foodList.remove(index);
        }
        if (choice.equals("p"))
        {
          System.out.println("Enter a fruit: ");
          userString = sc.nextLine();
          System.out.println("Enter a position: ");
          index = sc.nextInt() - 1;
          foodList.remove(index);
          foodList.add(index, userString);
        }
        if (choice.equals("q"))
        {
          playAgain = false;
        }
      }
  }
} 