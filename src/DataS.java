//import java.awt.*;
import java.util.Scanner;

public class DataS
{

    static Scanner input = new Scanner(System.in);
    static boolean open = false;
    static int top = 0 ;
    static int x = 10, y = 20, z = 30;

    public static void main(String[] args)
    {
        System.out.println("This is the lock");
        IsOpen();
        Menu();
    }

    private static void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("This is the main menu");
        System.out.println("Press 1 to start opening");
        System.out.println("Press 2 to show the status of lock");
        System.out.println("Press 3 to close the lock");
        System.out.println("Press 4 to change the lock passkeys");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                if (open)
                {
                    System.out.println("The lock is already open!");
                }
                else
                {
                    StartOpening();
                }
                Menu();
            case 2:
                IsOpen();
                Menu();
            case 3:
                Close();
                Menu();
            case 4:
                ChangeLock();
                Menu();
            default:
                System.out.println("Please enter a valid value");
                Menu();
        }
    }

    private static void ChangeLock()
    {
        System.out.println("-------------------------");
        System.out.println("This is change lock menu");
        int temp;
        do {
            System.out.println("Please inter new X value (0:39)");
            temp = input.nextInt();
        } while (temp < 0 || temp>39);
        x = temp;
        System.out.println("X changed successfully!");
        do {
            System.out.println("Please inter new Y value (0:39)");
            temp = input.nextInt();
        } while (temp < 0 || temp>39);
        y = temp;
        System.out.println("Y changed successfully!");
        do {
            System.out.println("Please inter new Z value (0:39)");
            temp = input.nextInt();
        } while (temp < 0 || temp>39);
        z = temp;
        System.out.println("Z changed successfully!");
    }


    private static void Close()
    {
        open = false;
        IsOpen();
    }

    private static void StartOpening()
    {
        boolean [] attempReturn = new boolean [3];
        System.out.println("-------------------------");
        System.out.println("This is opening lock menu");
        for (int attemp = 1; attemp <= 3; attemp++)
        {
            boolean drctn = false;
            int num = 0;
            OnTop();
            System.out.println("Press 0 to move counterclockwise");
            System.out.println("Press 1 to move clockwise");
            System.out.println("Press 2 to return to the main menu");
            int choice = input.nextInt();
                switch (choice)
                {
                    case 0:
                        drctn = false;
                        System.out.println("Enter the value");
                        num = input.nextInt();
                        break;
                    case 1:
                        drctn = true;
                        System.out.println("Enter the value");
                         num = input.nextInt();
                        break;
                    case 2:
                        Menu();
                    default:
                        System.out.println("Please enter a valid value");
                        Menu();
                }
            top = num;
            attempReturn[attemp-1] = Opening(drctn,num,attemp);

        }
        if (attempReturn [0] && attempReturn [1] && attempReturn [2])
        {
            open = true;
            System.out.println("The lock has been opend successfully!");
            System.out.println("-------------------------");
            IsOpen();
        }
        else
        {
            System.out.println("The pattern is wrong. Try again!");
            System.out.println("-------------------------");
            IsOpen();
            StartOpening();
        }
    }

    private static void IsOpen()
    {
        if (open)
        {
            System.out.println("Your lock is currently Open");
        }
        else
        {
            System.out.println("Your lock is currently Close");
        }
    }

    private static void OnTop()
    {
        System.out.println("The number on top is " + top);

    }

    private static boolean Opening(boolean drctn, int num,int attemp)
    {
        if (drctn && num == x && attemp == 1)
        {
            return true;
        }
        else if (!drctn && num == y && attemp == 2)
        {
            return true;
        }
        else if (drctn && num == z && attemp == 3)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}

