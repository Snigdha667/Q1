//Question 5: Design a program in java that identifies answer to ......
import java.util.Scanner;

public class QandA {
    static{
        System.out.println("This is written within static block");
    }
    {
        System.out.println("This is written within instance block");
    }
    Scanner s = new Scanner(System.in);

    public void Q1()

    {
        String q1 = s.nextLine();
        System.out.println("A Static Block");
    }
    public void Q2()

    {
        String q2 = s.nextLine();
        System.out.println("A Constructor: No. of times an object is called." +
                "A Static Block: Only Once.");
    }
    public void Q3(){

        String q3 = s.nextLine();
        System.out.println("No." +
                "This is because all the static members does not share the same copy of non static members.");


    }

    public static void main(String[] args) {
        QandA obj = new QandA();
        obj.Q1();
        obj.Q2();
        obj.Q3();

    }
}

