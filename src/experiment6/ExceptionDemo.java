package experiment6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class  ExceptionDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer：");
        while (true){
            try{
                int number = scanner.nextInt();
                System.out.println("The number entered is：" + number);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("1: You must enter an integer！");
            }
            catch(NumberFormatException e){
                System.out.println("2: You must enter an integer！");
            }
            finally{
                scanner.nextLine();
            }
        }
    }
}
