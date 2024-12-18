import java.util.Scanner;
import java.util.Random;
class Student{
    public static int stdin(){
        int std = -1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Guess your number");
                std = scanner.nextInt();
                if(std<1 || std>10){
                    System.out.println("please enter a valid number from 1 to 10");
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Please enter a valid Number");
                scanner.nextLine();
        }
    }
    return std;
    }
}

class Computer{
    public static int compin(){
        Random random = new Random();
        int ran = 0;
        while(true){
            ran = random.nextInt(11);
            if(ran!=0){
                break;
            }
        }
        System.out.println("computer guess is : "+ran);
        return ran;
    }
}

class Main{
    public static void main(String args[]){
        System.out.println("welcome to Guessing game ");
        Scanner scanner = new Scanner(System.in);

        int vars = 0;
        while(vars!=1){
            int input1 =Student.stdin();
            int input2 = Computer.compin();
            if(input1 == input2){
                System.out.println(" You won ");
            }
            else{
                System.out.println("you lose try again");
            }
            System.out.println("enter 0 to continue or 1 for closing the game ");
             vars = scanner.nextInt();
        }
        scanner.close();
       
    }
}
