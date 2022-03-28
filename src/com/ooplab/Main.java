package com.ooplab;

import java.io.IOException;
import java.util.Scanner;

class Student{
    String Enrollment;
    String Name;
    String Class;
    String Section;
    int Fees;
    public void setName(String Name){ this.Name = Name;}
    public void setEnrollment(String Enrollment){ this.Enrollment = Enrollment;}
    public void setClass(String Class){ this.Class = Class;}
    public void setFees(int Fees){ this.Fees = Fees;}

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
    public Employee(){
        Name = "Ali";
        F_Name = "Zahid";
        Salary = 50000;
        Designation = "Clerk";
    }
    public void setSalary(int Salary){ this.Salary = Salary;}
    public void setDesignation(String Designation){ this.Designation = Designation;}

    public void Display(){
        System.out.printf("Name         : %s\n", Name);
        System.out.printf("Father Name  : %s\n", F_Name);
        System.out.printf("Salary       : %d\n", Salary);
        System.out.printf("Designation  : %s\n", Designation);
    }
}
class Computer {
    private String OS, Name, Processor, Memory, GPU, Hard_Drive, MotherBoard, Optical_Drive;
    Scanner input = new Scanner(System.in);
    public Computer() {
        OS = "Windows 10 Pro";
        Name = "Rizan's Laptop";
        Processor = "Core i7 3530";
        Memory = "16 Gb";
        GPU = "RTX 3080 Ti";
        Hard_Drive = "2 Tb";
        MotherBoard = "SUS ROG Strix B450-F";
        Optical_Drive = "The ASUS BW-16D1X-U";
    }
    public void Display() {
        System.out.println("        System Specs");
        System.out.println("------------------------------\n");
        System.out.printf("OS Name         : %s\n", getOS());
        System.out.printf("System Name     : %s\n", getName());
        System.out.printf("Processor       : %s\n", getProcessor());
        System.out.printf("Total Memory    : %s\n", getMemory());
        System.out.printf("GPU             : %s\n", getGPU());
        System.out.printf("Hard Drive      : %s\n", getHard_Drive());
        System.out.printf("MotherBoard     : %s\n", getMotherBoard());
        System.out.printf("Optical Drive   : %s\n\n", getOptical_Drive());
    }
    public void Menu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int Inp, Inp2;
        System.out.println("Select The Following");
        System.out.println("1. Display System Info");
        System.out.println("2. Update System Info");
        System.out.println("3. Exit");
        Inp = scanner.nextInt();
        if (Inp == 1) {
            Display();
        } else if (Inp == 2) {
            System.out.println("Select The Item You Want To Update");
            System.out.println("1. OS\n2. System Name\n3. Processor\n4. Memory\n5. GPU\n6. HDD\n7. MotherBoard\n8. Optical Drive");
            Inp2 = scanner.nextInt();
            System.out.print("Enter New Item: ");
            switch (Inp2) {
                case 1 -> setOS();
                case 2 -> setName();
                case 3 -> setCPU();
                case 4 -> setMemory();
                case 5 -> setGPU();
                case 6 -> setHDD();
                case 7 -> setMotherBoard();
                case 8 -> setOptical_Drive();
                default -> System.out.println("Invalid...");
            }
            System.out.println("Updated...\n");
        } else if (Inp == 3) {
            System.exit(0);
        }
        Menu();
    }

    public String getOS() { return OS; }
    public String getName() { return Name; }
    public String getProcessor() { return Processor; }
    public String getMemory() { return Memory; }
    public String getGPU() { return GPU; }
    public String getHard_Drive() { return Hard_Drive; }
    public String getMotherBoard() { return MotherBoard; }
    public String getOptical_Drive() { return Optical_Drive; }

    public void setOS() { OS = input.nextLine(); }
    public void setName() { Name = input.nextLine(); }
    public void setCPU() { Processor = input.nextLine(); }
    public void setMemory() { Memory = input.nextLine(); }
    public void setGPU() { GPU = input.nextLine(); }
    public void setHDD() { Hard_Drive = input.nextLine(); }
    public void setMotherBoard() { MotherBoard = input.nextLine(); }
    public void setOptical_Drive() { Optical_Drive = input.nextLine(); }
}
class AutoMobile{
    Scanner input = new Scanner(System.in);
    boolean carState = false;
    String State;
    String HorsePower, Color, Made, EngineType, Model;
    public AutoMobile(){
        HorsePower = "786 Hp";
        Color = "Blue";
        Made = "BMW";
        EngineType = "4.4 L S63 twin-turbo V8";
        Model = "M5";
    }
    public void Display(){
        System.out.print("         \"Car Stats\"  \n");
        System.out.printf("Made         :   %s \n",Made);
        System.out.printf("Color        :   %s \n",Color);
        System.out.printf("HorsePower   :   %s \n",HorsePower);
        System.out.printf("Engine Type  :   %s \n",EngineType);
        System.out.printf("Model        :   %s \n",Model);
    }
    public void Menu(){
        System.out.println("    Welcome To BMW Dashboard \n");
        System.out.println("Select The Following Option...");
        System.out.println("1. View Car Details");
        System.out.println("2. Update Car Details");
        int ans = input.nextInt();
        if (ans == 1) {
            Display();
            CheckState();
        }
        else if(ans == 2){
            System.out.println("Select The Following Option...");
            System.out.println("1. Update Car Made");
            System.out.println("2. Update Car Color");
            System.out.println("3. Update Car Model");
            System.out.println("4. Update Car Engine Type");
            System.out.println("5. Update Car HorsePower");
            int ans2 = input.nextInt();
            System.out.print("Select New Item : ");
            switch (ans2) {
                case 1 -> setMade();
                case 2 -> setColor();
                case 3 -> setModel();
                case 4 -> setEngineType();
                case 5 -> setHorsePower();
                default -> System.out.println("Invalid Input... ");
            }
            Menu();
        }
    }
    public void CheckState(){
        if (!carState)
            State = "Off";
        else{
            State = "On";
            Menu();
        }
        System.out.printf("Car State = %s \n", State);
        if (!carState) {
            System.out.println("Do You Want To Start The Car...");
            String Start = input.nextLine();
            if (Start.equals("y")|| Start.equals("Y")) {
                carState = true;
                Menu();
            }
        }
    }
    public void setHorsePower() { this.HorsePower = input.next(); }
    public void setColor() { this.Color = input.next(); }
    public void setMade() { this.Made = input.next(); }
    public void setEngineType() { this.EngineType = input.next(); }
    public void setModel() { this.Model = input.next(); }
}
class Car{
    Scanner input = new Scanner(System.in);
    private final String BrandName, Color;
    private double Odometer;
    private final double NewPrice;
    private double UsedPrice;
    public Car(){
        BrandName = "Toyota";
        NewPrice =  4199000;
        Color =  "White";
        Odometer = 0;
    }
    public double getPriceAfterUse(){
        return NewPrice * (1 - (Odometer/60000));
    }
    public void updateMilage(){
        System.out.print("Enter New Milage : ");
        Odometer = input.nextDouble();
    }
    public void outputDetails(){
        System.out.println("          Car Stats           ");
        System.out.println("-----------------------------\n");
        System.out.printf("Brand Name   : %s\n", BrandName);
        System.out.printf("New Price    : %.2f\n",NewPrice);
        System.out.printf("Used Price   : %.2f\n",UsedPrice);
        System.out.printf("Color        : %s\n",Color);
        System.out.printf("Odometer     : %s\n",Odometer);
    }
}
class Circle{
    Scanner input = new Scanner(System.in);
    private String Color;
    private int Radius;
    public void Menu(){
        System.out.println("Select The Following");
        System.out.println("1. Display Circle");
        System.out.println("2. Update Circle");
        System.out.println("3. Exit");
        int ans = input.nextInt();
        if (ans == 1) {
            Display();
            Menu();
        } else if (ans == 2) {
            System.out.println("Choose The Following\n1. Update Radius\n2. Update Colour");
            int ans2 = input.nextInt();
            switch (ans2) {
                case 1 -> setRadius();
                case 2 -> setColor();
                default -> System.out.println("Invalid");
            }
            Menu();
        }
        else{
            System.exit(0);
        }
    }
    public Circle(){
        this.Color = "Blue";
        this.Radius = 14;
    }
    public void Display(){
        System.out.println("\n       Circle"     );
        System.out.println("--------------------\n");
        System.out.printf("Color  = %s\n",getColor());
        System.out.printf("Radius = %d\n\n",getRadius());
    }
    public String getColor() { return Color;}
    public int getRadius() { return Radius; }
    public void setColor() {
        input.nextLine();
        System.out.print("Input New Color : ");
        Color = input.nextLine();}
    public void setRadius() {
        System.out.print("Input New Radius : ");
        Radius = input.nextInt();}
}
class UniStudents{
    Scanner input = new Scanner(System.in);
    private final String Name;
    private String University;
    private final int Age;
    private final int Semester;

    public void setUniversity() {
        input.nextLine();
        System.out.print("Enter University Name : ");
        University = input.nextLine();
    }

    public UniStudents(String Name, String University, int Age, int Semester){
        this.Name = Name;
        this.University = University;
        this.Age = Age;
        this.Semester = Semester;
    }
    public void Menu(){
        System.out.println("Select The Following");
        System.out.println("1. Display Student's Info");
        System.out.println("2. Update Student's University");
        System.out.println("3. Exit");
        int ans = input.nextInt();
        switch (ans) {
            case 1 -> {
                Display();
                Menu();
            }
            case 2 -> {
                setUniversity();
                Menu();
            }
            default -> System.exit(0);
        }
    }
    public void Display(){
        System.out.println("        Student's Info               ");
        System.out.println("-------------------------------------");
        System.out.printf("Student's Name  :  %s\n", Name);
        System.out.printf("University Name :  %s\n", University);
        System.out.printf("Age             :  %d\n", Age);
        System.out.printf("Semester        :  %d\n\n", Semester);
    }
}
public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        /*------------------------
                 Lab 1
         ------------------------*/

	  // Task O1

       /* System.out.println(" ^                   ^                    ^  ");
        System.out.println(" //|\\               //|\\                //|\\");
        System.out.println(" ((&))              .((^)).               ((&)) ");
        System.out.println(" |.|               ((((^))))              |.|");
        System.out.println(" |.|              (((((^)))))             |.|");
        System.out.println(" |.|             ((((((^))))))            |.|");
        System.out.println(" |.|              (((((^)))))             |.|");
        System.out.println(" |.|               ((((^))))              |.|");
        System.out.println("  {'''''''''''''''''''''''''''''''''''''''}");
        System.out.println("  '|''''''''''''''''''''''''''''''''''''''|''");
        System.out.println("   |                                      |  ");
        System.out.println("   |                  -                   |  ");
        System.out.println("   |                _{#}_                 |  ");
        System.out.println("   |               {#####}                |  ");
        System.out.println("   |   ____                        ____   |  ");
        System.out.println("   |   |##|        {######}        |##|   |  ");
        System.out.println("   |   |##|        {######}        |##|   |  ");
        System.out.println("   |   ====        {######}        ====   |  ");
        System.out.println("   |               {######}               |  ");
        System.out.println("   |               {######}               |  ");
        System.out.println("   |              _{######}_              |  ");
        System.out.println("   (@@@@@@@@@@@@@@@=======@@@@@@@@@@@@@@@@)  ");
        System.out.println("   (++++++++++++++/=======++++++++++++++++)  ");
        System.out.println("   (%%%%%%%%%%%%%%/=======%%%%%%%%%%%%%%%%)  ");
        System.out.println("   (''''''''''''''/======='''''''''''''''')  ");*/

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
        System.out.print("\nEnter the number of items : ");
        int Items = input.nextInt();
        double[] Items_Price = new double[Items];
        String[] Items_Name = new String[Items];
        double Total = 0, Discount = 0, Paybill_Amount = 0;
        int j = 1;
        for (int i = 0; i < Items_Name.length; i++) {
            System.out.printf("Enter the following details of item %d\n" , j++);
            System.out.print("Name of item : ");
            Items_Name[i] = input.next();
            System.out.print("Price of item : ");
            Items_Price[i] = input.nextDouble();
            Total += Items_Price[i];
        }
        System.out.print("Are you from Bahria University..? [Y/N] : ");
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

        // Task 04
        /*Automobile_Tyre_Psi();
        Pulley();
        BMI();*/


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
        Pc.Menu();*/

        // Task 03

        /*Employee E1 = new Employee();
        E1.setSalary(45000);
        E1.setDesignation("HOD");
        E1.Display();*/

        // Task 04

        /*AutoMobile Car1 = new AutoMobile();
        Car1.CheckState();*/


        // Task 05
        /*Car Corolla = new Car();
        Corolla.updateMilage();
        Corolla.UsedPrice = Corolla.getPriceAfterUse();
        Corolla.outputDetails();*/

        /*------------------------
                 Lab 3
         ------------------------*/
        // Task 01

        /*Computer Pc = new Computer();
        Pc.Menu();*/

        // Task 02

        /*Circle circle = new Circle();
        circle.Menu();*/

        // Task 03

        /*Car Honda = new Car();
        Honda.updateMilage();
        Honda.getPriceAfterUse();
        Honda.outputDetails();*/

        // Task 05

        /*UniStudents St1 = new UniStudents("Rizan","Bahria University", 20, 1);
        UniStudents St2 = new UniStudents("Haseeb","Bahria University", 19, 1);
        UniStudents St3 = new UniStudents("Zeeshan","Bahria University", 18, 1);
        St1.Menu();*/
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
