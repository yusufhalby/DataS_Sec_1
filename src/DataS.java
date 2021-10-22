import java.awt.*;
import java.util.Scanner;

public class DataS {
    static boolean open = false;
    static int top = 0 ;
    int x = 10, y = 20, z = 30;
    public static void main(String[] args){
    /*    System.out.println("This is the lock");
        IsOpen();
        Menu();*/
    System.out.println("haha");
    }

    /*private static void Menu(){
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
                StartOpening();
            case 2:
                IsOpen();
                Menu();
            case 3:
                Close();
                Menu();
            case 4:
                ChangeLock();
            default:
                System.out.println("Please enter a valid value");
                Menu();
        }
    }

    private static void ChangeLock(){}

    private static boolean ClockWise(boolean a, int x, int attemp){

        return false;
    }
    private static void Close(){
        open = false;
        IsOpen();
    }
    private static void StartOpening(){
        Scanner input = new Scanner(System.in);
        boolean dir=false;

        System.out.println("-------------------------");
        System.out.println("This is opening lock menu");
        OnTop();
        for (int i = 1; i <= 3; i++){
        System.out.println("Press 0 to move counterclockwise");
        System.out.println("Press 1 to move clockwise");
        System.out.println("Press 2 to return to the main menu");
        int choice = input.nextInt();
        switch (choice){
            case 0:
                dir = false;
                break;
            case 1:
                dir = true;
                break;
            case 2:
                Menu();
            default:
                System.out.println("Please enter a valid value");
                StartOpening();
        }
        System.out.println("enter the number you want on top");
        int num = input.nextInt();
        boolean attemp = ClockWise(dir, num,i );}
        i++;
        if (attemp){

        }
    }
    private static void IsOpen(){
        if (open){
            System.out.println("Your lock is currently Open");
        }
        else {
            System.out.println("Your lock is currently Close");
        }
    }
    private static void OnTop(){System.out.println("The number on top is " + top);
    }

    /*private static void Opening() {
        System.out.println("Press 0 to move counterclockwise");
        System.out.println("Press 1 to move clockwise");
        System.out.println("Press 2 to return to the main menu");
        int choice = input.nextInt();
        switch (choice) {
            case 0:
                dir = false;
                break;
            case 1:
                dir = true;
                break;
            case 2:
                Menu();
            default:
                System.out.println("Please enter a valid value");
                StartOpening();
        }
    }
*/

}
