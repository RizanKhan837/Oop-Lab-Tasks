package com.ooplab;

import java.io.IOException;
import java.util.Scanner;

class Student{
    String Enrollment;
    String Name;
    String Class;
    String Section;
    int Fees;
    public void setName(String C_Name){ Name = C_Name;}
    public void setEnrollment(String C_Enroll){ Enrollment = C_Enroll;}
    public void setClass(String C_Class){ Class = C_Class;}
    public void setFees(int C_Fees){ Fees = C_Fees;}

    public void Display(){
        System.out.printf("My Name Is %s\n", Name);
        System.out.printf("My Enrollment Is %s\n", Enrollment);
        System.out.printf("My Class Is %s\n", Class);
        System.out.printf("My Section Is %s\n", Section);
        System.out.printf("%s's Fees is %d",Name, Fees);
    }
}
class Employee{
    String Name;
    String F_Name;
    int Salary;
    String Designation;
    public void setSalary(int salary){ salary = Salary;}
    public void setDesignation(String designation){ designation = Designation;}

    public void Display(){
        System.out.printf("Name         : %s\n", Name);
        System.out.printf("Father Name  : %s\n", F_Name);
        System.out.printf("Salary       : %d\n", Salary);
        System.out.printf("Designation  : %s\n", Designation);
    }
}
class Computer{
    String OS, Name, Processor, Memory, GPU, Hard_Drive;
    Scanner input = new Scanner(System.in);
    public Computer(){
        OS = "Windows 10 Pro";
        Name = "Rizan's Laptop";
        Processor = "Core i7 3530";
        Memory = "16 Gb";
        GPU = "RTX 3080 Ti";
        Hard_Drive = "2 Tb";
    }
    public void Display(){
        System.out.println("        System Specs");
        System.out.println("------------------------------\n");
        System.out.printf("OS Name         : %s\n",OS);
        System.out.printf("System Name     : %s\n",Name);
        System.out.printf("Processor       : %s\n",Processor);
        System.out.printf("Total Memory    : %s\n",Memory);
        System.out.printf("GPU             : %s\n",GPU);
        System.out.printf("Hard Drive      : %s\n",Hard_Drive);
    }
    public void setOS(){ OS = input.nextLine(); }
    public void setName(){ Name = input.nextLine();  }
    public void setCPU(){ Processor = input.nextLine();}
    public void setMemory(){ Memory = input.nextLine();}
    public void setGPU() { GPU = input.nextLine();}
    public void setHDD(){ Hard_Drive = input.nextLine(); }

    public void Loading() throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.print("Processing: " + i + "% \r");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Processing: Done!");
    }
}
class AutoMobile{
    String HorsePower, Color, Make, Engine, Model, Year;
    String CarState = "Off";
    Scanner input = new Scanner(System.in);

    public void Display(){
        System.out.println("        Car Stats");
        System.out.println("------------------------------\n");
        System.out.printf("Make         : %s\n",Make);
        System.out.printf("Model        : %s\n",Model);
        System.out.printf("Year         : %s\n",Year);
        System.out.printf("Color        : %s\n",Color);
        System.out.printf("Engine       : %s\n",Engine);
        System.out.printf("Horse Power  : %s\n",HorsePower);
    }
    public void setMake() { Make = input.nextLine();}
    public void setModel() { Model = input.nextLine();}
    public void setYear() { Year = input.nextLine();}
    public void setColor() { Color = input.nextLine();}
    public void setEngine() { Engine = input.nextLine();}
    public void setHorsePower() { HorsePower = input.nextLine();}
}
class Car{
    Scanner input = new Scanner(System.in);
    String BrandName, Color;
    double Odometer, NewPrice, UsedPrice;
    public double getPriceAfterUse(){
        return NewPrice * (1 - (Odometer/  60000));
    }
    public void updateMilage(){
        System.out.print("Enter New Milage : ");
        Odometer = input.nextDouble();
    }
    public void outputDetails(){
        System.out.println("        Car Stats");
        System.out.println("------------------------------\n");
        System.out.printf("Brand Name   : %s\n", BrandName);
        System.out.printf("New Price    : %.2f\n",NewPrice);
        System.out.printf("Used Price   : %.2f\n",UsedPrice);
        System.out.printf("Color        : %s\n",Color);
        System.out.printf("Odometer     : %s\n",Odometer);
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        /*------------------------
                 Lab 1
         ------------------------*/

	  // Task O1

        /*Print(" ^                   ^                    ^  ");
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

        /*------------------------
                 Lab 2
         ------------------------*/

        // Task 01

        /*Student St1 = new Student();
        St1.Name = "Rizan";
        St1.Class = "BSE";
        St1.Enrollment = "02131212026";
        St1.Section = "1A";
        St1.Fees = 35000;
        St1.setFees(36000);
        St1.setName("Rizwan");
        St1.setEnrollment("02-131212-026");
        St1.setClass("BSE");
        St1.Display();*/

        // Task 02
        /*Computer Pc = new Computer();
        try (Scanner scanner = new Scanner(System.in)) {
            int Inp,Inp2;
            System.out.println("Select The Following");
            System.out.println("1. Display System Info");
            System.out.println("2. Update System Info");
            System.out.println("3. Exit");
            Inp = scanner.nextInt();
            if (Inp == 1) {
                Pc.Loading();
                Pc.Display();
            } else if (Inp == 2) {
                System.out.println("Select The Item You Want To Update");
                System.out.println("1. OS\n2. System Name\n3. Processor\n4. Memory\n5. GPU\n6. HDD");
                Inp2 = scanner.nextInt();
                System.out.print("Enter New Item: ");
                switch (Inp2) {
                    case 1 -> Pc.setOS();
                    case 2 -> Pc.setName();
                    case 3 -> Pc.setCPU();
                    case 4 -> Pc.setMemory();
                    case 5 -> Pc.setGPU();
                    case 6 -> Pc.setHDD();
                    default -> System.out.println("Invalid...");
                }
                System.out.println("Updated...");
            } else if (Inp == 3) {
                System.out.println("Invalid");
            }
        }
        Pc.Display();*/

        // Task 03

        /*Employee E1 = new Employee();
        E1.Name = "Ali";
        E1.F_Name = "Zahid";
        E1.Salary = 50000;
        E1.Designation = "Clerk";
        E1.setSalary(45000);
        E1.setDesignation("HOD");
        E1.Display();*/

        // Task 04

        /*Scanner input = new Scanner(System.in);
        AutoMobile Car1 = new AutoMobile();
        Car1.Make = "Toyota";
        Car1.Model = "Altis";
        Car1.Year = "2018";
        Car1.Color = "White";
        Car1.Engine = "1798 cc";
        Car1.HorsePower = "300hp";
        Car1.Display_State();

        System.out.print("Car State : ");
        System.out.printf("%s\n", Car1.CarState);
        if(Car1.CarState.equals("Off")){
            System.out.println("Do You Want To Start The Car [Y/n]");
            String Ans = input.nextLine();
            if(Ans.equals("Yes") || Ans.equals("Y") || Ans.equals("y")){
                Car1.CarState = "On";
            }
        }
        if(Car1.CarState.equals("On")){
            System.out.println("Select The Following");
            System.out.println("1. Display Car Stats");
            System.out.println("2. Update Car Stats");
            int opt = input.nextInt();
            if (opt == 1) {
                Car1.Display();
            } else if (opt == 2) {
                System.out.println("Select The Item You Want To Update");
                System.out.println("1. Make\n2. Model\n3. Year\n4. Color\n5. Engine\n6. Horse Power");
                int opt2 = input.nextInt();
                System.out.print("Enter New Item : ");
                switch (opt2) {
                    case 1 -> Car1.setMake();
                    case 2 -> Car1.setModel();
                    case 3 -> Car1.setYear();
                    case 4 -> Car1.setColor();
                    case 5 -> Car1.setEngine();
                    case 6 -> Car1.setHorsePower();
                    default -> System.out.println("Invalid...");
                }
                Car1.Display();
            } else {
                System.out.println("Invalid...");
            }
        }*/

        // Task 05
        Car Corolla = new Car();
        Corolla.BrandName = "Toyota";
        Corolla.NewPrice =  4199000;
        Corolla.Color =  "White";
        Corolla.Odometer = 0;
        Corolla.updateMilage();
        Corolla.UsedPrice = Corolla.getPriceAfterUse();
        Corolla.outputDetails();

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
        Pressure = (0.37* mass * (Temp + 460)) / Vol;
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
