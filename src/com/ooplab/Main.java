package com.ooplab;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  // Task O1

        /*Print("   ^                   ^                    ^  ");
        Print(" //|\\               //|\\                //|\\");
        Print(" ((&))              .((^)).               ((&)) ");
        Print(" |.|               ((((^))))              |.|");
        Print(" |.|              (((((^)))))             |.|");
        Print(" |.|             ((((((^))))))            |.|");
        Print(" |.|              (((((^)))))             |.|");
        Print(" |.|               ((((^))))              |.|");
        Print("  {'''''''''''''''''''''''''''''''''''''''}");
        Print("  '|''''''''''''''''''''''''''''''''''''''|''");
        Print("   |                                      |  ");
        Print("   |                  -                   |  ");
        Print("   |                _{#}_                 |  ");
        Print("   |               {#####}                |  ");
        Print("   |   ____                        ____   |  ");
        Print("   |   |##|        {######}        |##|   |  ");
        Print("   |   |##|        {######}        |##|   |  ");
        Print("   |   ====        {######}        ====   |  ");
        Print("   |               {######}               |  ");
        Print("   |               {######}               |  ");
        Print("   |              _{######}_              |  ");
        Print("   (@@@@@@@@@@@@@@@=======@@@@@@@@@@@@@@@@)  ");
        Print("   (++++++++++++++/=======++++++++++++++++)  ");
        Print("   (%%%%%%%%%%%%%%/=======%%%%%%%%%%%%%%%%)  ");
        Print("   (''''''''''''''/======='''''''''''''''')  ");*/

        // Task O2
        /*String ans, reply;
        double num1,num2;
        do {
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Select One Of The Following : ");
                System.out.println("1) Arithmetic Operation [ +, -, *, / ]");
                System.out.println("2) Power");
                System.out.println("3) Factorial");
                System.out.println("4) Square Root");
                ans = input.nextLine();
                if (ans.equals("1")){
                    System.out.print("Enter a Number : ");
                    num1 = input.nextDouble();
                    System.out.print("Enter another Number : ");
                    num2 = input.nextDouble();
                    Arithmetic_Opr(num1,num2);
                    reply = Restart();
                }
                else if (ans.equals("2")){
                    System.out.print("Enter a Number : ");
                    num1 = input.nextDouble();
                    System.out.print("Enter Exponent : ");
                    num2 = input.nextDouble();
                    System.out.printf("\n%.1f to the power of %f is %.2f", num1, num2, Math.pow(num1,num1));
                    reply = Restart();
                }
                else if (ans.equals("3")){
                    System.out.print("Enter a Number : ");
                    num1 = input.nextDouble();
                    System.out.printf("The Factorial Of %.1f is %d", num1, Factorial(num1));
                    reply = Restart();
                }
                else if (ans.equals("4")){
                    System.out.print("Enter a Number : ");
                    num1 = input.nextDouble();
                    System.out.printf("The Square Root Of %.1f is %.2f",num1, Math.sqrt(num1));
                    reply = Restart();
                }
                else {
                    System.out.println("Invalid Number..!!");
                    reply = Restart();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                reply = Restart();
            }
        }while(reply.equals("Y") || reply.equals("y"));*/

        // Task 03;
        /*Scanner input = new Scanner(System.in);
        System.out.println("\t\tWELCOME TO THE Rizan General Store");
        System.out.print("\nEnter the number of items :");
        int Items = input.nextInt();
        double[] Items_Price = new double[Items];
        String[] Items_Name = new String[Items];
        double Total = 0, Discount = 0, Paybill_Amount = 0;
        int j = 1;
        for (int i = 0; i < Items_Name.length; i++) {
            System.out.printf("Enter the following details of item %d\n" , j++);
            System.out.print("Name of item :");
            Items_Name[i] = input.next();
            System.out.print("Price of item :");
            Items_Price[i] = input.nextDouble();
            Total += Items_Price[i];
        }
        System.out.println("Are you from Bahria University..? [Y/N]");
        String reply = input.next();
        if (reply.equals("Y") || reply.equals("y")) {
            Discount = Total * 0.3;
            Paybill_Amount = Total - Discount;
        } else if (Total > 50000 || Total <= 100000) {
            Discount = Total * 0.2;
            Paybill_Amount = Total - Discount;
        } else{
            Discount = Total * 0.3;
            Paybill_Amount = Total - Discount;
        }

        System.out.println("\t\t  YOUR BILL");
        System.out.println("--------------------------------");
        System.out.println("Item No \tItem Name \tItem Price");
        j = 1;
        for (int i = 0; i < Items_Name.length; i++){
            System.out.printf("  %d \t\t %s \t\t %.2f%n",j++ , Items_Name[i], Items_Price[i]);
        }
        System.out.println("--------------------------------");
        System.out.println("Total Price      \t:    " + Total);
        System.out.println("Discount Price   \t:    " + Discount);
        System.out.println("Final Price      \t:    " + Paybill_Amount);*/

        BMI();
    }




    static void Print(String str){
        System.out.println(str);
    }
    static void Arithmetic_Opr(Double num1,Double num2) {
        String opr;
            try{
                Scanner input = new Scanner(System.in);
                Print("Select The Following: ");
                Print("1) Addition ");
                Print("2) Subtraction ");
                Print("3) Multiplication ");
                Print("4) Division ");
                opr = input.nextLine();
                switch (opr) {
                    case "1", "+" -> System.out.printf("Addition Of %.1f and %.1f is %.1f", num1, num2, num1 + num2);
                    case "2", "-" -> System.out.printf("Subtraction Of %.1f and %.1f is %.1f", num1, num2, num1 - num2);
                    case "3", "*" -> System.out.printf("Multiplication Of %.2f and %.2f is %.2f", num1, num2, num1 * num2);
                    case "4", "/" -> System.out.printf("Division Of %.1f and %.1f is %.2f", num1, num2, num1 / num2);
                    default -> System.out.println("Invalid Number...!!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    static int Factorial(Double num){
        int Product = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        Product = (int) (num * Factorial(num-1));
        return Product;
    }
    static String Restart(){
        Scanner input = new Scanner(System.in);
        Print("");
        Print("Do You Want To Restart Application [Y/n]");
        return input.nextLine();
    }
    static void Automobile_Tyre_Psi(){
        double Vol, mass, Temp, Pressure;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Volume In Cubic Ft. : ");
        Vol = input.nextDouble();
        System.out.print("Enter mass In pounds : ");
        mass = input.nextDouble();
        System.out.print("Enter Temperature In Fahrenheit : ");
        Temp = input.nextDouble();
        Pressure = (0.37 * (Temp + 460)) / Vol;
        System.out.printf("The Pressure Of Tyre Is  % f", Pressure);
    }
    static void Pulley(){
        int  Ropes;
        double Diameter1, Diameter2, RPM1, RPM2, Force, Weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Ropes : ");
        Ropes = input.nextInt();
        System.out.print("Enter Total Force Exerted : ");
        Force = input.nextDouble();
        Weight = Force * Ropes;
        System.out.print("Enter Speed Of Pulley 2 : ");
        RPM2 = input.nextDouble();
        System.out.print("Input Diameter Of Pulley 1 : ");
        Diameter1 = input.nextDouble();
        System.out.print("Input Diameter Of Pulley 2 : ");
        Diameter2 = input.nextDouble();
        RPM1 = (Diameter1/Diameter2) * RPM2;
        System.out.printf("Speed Of 1st Pulley Is %.2f", RPM1);
        System.out.printf("Weight That Can Be Lifted With Multiple Pulleys Is %.2f", Weight);

    }
    static void BMI(){
        double height, mass, BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height In inches : ");
        height = input.nextDouble();
        System.out.print("Enter Mass In Pounds : ");
        mass = input.nextDouble();
        BMI = (mass / Math.pow(height,2))* 703;
        System.out.printf("Your Body Mass Index Is %f",BMI);
    }

}
