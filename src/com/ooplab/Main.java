package com.ooplab;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        MotherBoard = "ASUS ROG Strix B450-F";
        Optical_Drive = "The ASUS BW-16D1X-U";
    }
    public void Display() {
        System.out.println("        System Specs");
        System.out.println("------------------------------\n");
        System.out.printf("System Name     : %s\n", Name);
        System.out.printf("OS Name         : %s\n", OS);
        System.out.printf("Processor       : %s\n", Processor);
        System.out.printf("Total Memory    : %s\n", Memory);
        System.out.printf("GPU             : %s\n", GPU);
        System.out.printf("Hard Drive      : %s\n", Hard_Drive);
        System.out.printf("MotherBoard     : %s\n", MotherBoard);
        System.out.printf("Optical Drive   : %s\n\n", Optical_Drive);
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
        System.out.println("1. Display Circle3");
        System.out.println("2. Update Circle3");
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
        System.out.println("       Circle3         ");
        System.out.println("--------------------\n");
        System.out.printf("Color  = %s\n",Color);
        System.out.printf("Radius = %d\n\n",Radius);
    }
    public void setColor() {
        input.nextLine();
        System.out.print("Input New Color : ");
        Color = input.nextLine();}
    public void setRadius() {
        System.out.print("Input New Radius : ");
        Radius = input.nextInt();}
}
class UniStudents{
    static Scanner input = new Scanner(System.in);
    static String University;
    static int Semester;
    private static String Name, Enrollment;
    private static int RollNo = 0, Sr_No = 0;
    public static int getRollNo() { return ++RollNo; }
    public static int getSr_No() { return ++Sr_No; }
    public static void setUniversity(String University) { UniStudents.University = University; }
    public static void setSemester(int Semester) { UniStudents.Semester = Semester; }

    public UniStudents(String Name, String University, String Enrollment, int Semester){
        UniStudents.Name = Name;
        UniStudents.University = University;
        UniStudents.Enrollment = Enrollment;
        UniStudents.Semester = Semester;
    }
    public void Display(){
        System.out.printf("        Student # %d    \n",getSr_No());
        System.out.println("-------------------------------------");
        System.out.printf("Student's Name  :  %s\n", Name);
        System.out.printf("University Name :  %s\n", University);
        System.out.printf("Enrollment No.  :  %s\n", Enrollment);
        System.out.printf("Roll No.        :  %s\n", getRollNo());
        System.out.printf("Semester        :  %d\n\n", Semester);
    }
}
class Sphere {
    Scanner input = new Scanner(System.in);
    private final double pi = 3.142;
    private double area;
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }
    public void Menu() {
        System.out.println("\n        Sphere      \n");
        System.out.println("Choose The Following ");
        System.out.println("1. Calculate Area Of Sphere");
        System.out.println("2. Calculate Volume Of Sphere");
        System.out.println("3. Update Radius");
        System.out.println("4. Exit ");
        String ans = input.nextLine();
        switch (ans) {
            case "1" -> areaOfSphere();
            case "2" -> volumeOfSphere();
            case "3" -> {
                System.out.print("Input Radius : ");
                setRadius();
            }
            case "4" -> System.exit(0);
            default -> System.out.println("Invalid Input...");
        }
        Menu();
    }
    public void areaOfSphere() {
        area = 4 * pi * (Math.pow(radius, 2));
        System.out.printf("Area Of The Sphere is : %.2f\n", area);
    }
    public void volumeOfSphere() {
        double volume = (4.0 / 3.0) * pi * (Math.pow(radius, 3));
        System.out.printf("Area Of The Sphere is : %.2f\n", volume);
    }
    public double getArea() {
         return area;
    }
    public double getRadius() {
         return radius;
    }
    public void setRadius() {
         this.radius = input.nextDouble();
    }
}
class Cylinder {
    Scanner input = new Scanner(System.in);
    private double radius;
    private double height;
    private final double pi = 3.142;
    private double area;
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public void setRadius() { this.radius = input.nextDouble(); }
    public void setHeight() { this.height = input.nextDouble(); }
    public void Menu() {
        System.out.println("        Cylinder      \n");
        System.out.println("Choose The Following ");
        System.out.println("1. Calculate Area Of Cylinder");
        System.out.println("2. Calculate Volume Of Cylinder");
        System.out.println("3. Update Radius");
        System.out.println("4. Update Height");
        System.out.println("5. Exit ");
        String ans = input.nextLine();
        switch (ans) {
            case "1" -> areaOfCylinder();
            case "2" -> volumeOfCylinder();
            case "3" -> {
                System.out.print("Input Radius : ");
                setRadius();
            }
            case "4" -> {
                System.out.print("Input Height : ");
                setHeight();
            }
            case "5" -> System.exit(0);
            default -> System.out.println("Invalid Input...");
        }
    }
    public void volumeOfCylinder() {
        area = pi * (Math.pow(radius, 2)) * height;
        System.out.printf("Area Of The Sphere is : %.2f\n", area);
    }
    public void areaOfCylinder() {
        area = (2 * pi * radius * height) + 2* pi * (Math.pow(radius, 2));
        System.out.printf("Area Of The Sphere is : %.2f\n", area);
    }
}
class Rectangle{
    private static int Length, Breadth;
    public Rectangle(int Length, int Breadth){
        Rectangle.Length = Length;
        Rectangle.Breadth = Breadth;
    }
    static void Output_Area(){
        int Area = Rectangle.Length * Rectangle.Breadth;
        System.out.printf("\nArea Of a Rectangle is %d", Area);
    }
}
class Flight{
    static Scanner input = new Scanner(System.in);
    private int Flight_No;
    private int Available_Seats;
    private String Source, Destination;

    public Flight(int FlightNo, String Source, String Destination, int Available_Seats){
        this.Flight_No = FlightNo;
        this.Source = Source;
        this.Available_Seats = Available_Seats;
        this.Destination = Destination;
    }
    public int getFlight_No() {
        return Flight_No;
    }
    public void setFlight_No() {
        Flight_No = input.nextInt();
    }
    public Flight(int FlightNo, int Available_Seats){
        this.Flight_No = FlightNo;
        this.Available_Seats = Available_Seats;
    }
    public Flight(int FlightNo){
        this.Flight_No = FlightNo;
    }
    public void reserve(int numberOfSeats){
        Available_Seats -= numberOfSeats;
    }
    public void cancel(int numberOfSeats){
        Available_Seats += numberOfSeats;
    }
    private String shortAndCapital (String name) {
        this.Source = name;
        if (Source.length() <= 3) {
            return Source.toUpperCase();
        } else {
            return name.substring(0,3).toUpperCase();
        }
    }
    public static void checkIfEquals(Object fl1, Object fl2){
        Flight flight1 = (Flight)fl1;
        Flight flight2 = (Flight)fl2;
        if (flight1.Flight_No == flight2.Flight_No){
            System.out.println("Two Flights Have Same Flight Id...\n");
            System.out.print("Do You Want To Change It? [Y/n] : ");
            String Ans = input.next();
            if (Ans.equals("Y") || Ans.equals("y")){
                System.out.print("Input New Flight Id : ");
                ((Flight) fl1).setFlight_No();
                ((Flight) fl1).Display();
                ((Flight) fl2).Display();
            }
        }
        else {
            ((Flight) fl1).Display();
            ((Flight) fl2).Display();
        }
    }
    public void Display() {
        System.out.printf("\n         Flight No. :  %d\n\n", Flight_No);
        System.out.printf("From         :   %s\n", shortAndCapital(Source));
        System.out.printf("To           :   %s\n", shortAndCapital(Destination));
        System.out.printf("No. Of Available Seats Left :  %d\n\n", Available_Seats);
    }
}
class Calculator{
    static void Sum(int a, int b){
        System.out.printf("The Sum Of %d + %d = %d\n", a, b, a+b); }
    static void Sum(int a, int b, int c){
        System.out.printf("The Sum Of %d + %d + %d = %d\n", a, b, c, a+b+c); }
    static void Sum(int a, int b, int c, int d){
        System.out.printf("The Sum Of %d + %d + %d + %d = %d\n", a, b, c, d, a+b+c+d); }
    static void Sum(int a, int b, int c, int d, int f){
        System.out.printf("The Sum Of %d + %d + %d + %d + %d = %d\n",  a, b, c, d, f, a+b+c+d+f); }
}
class Area{
    static void PrintArea(int Length) {
        System.out.printf("The Area Of Square Is %d\n", Length * Length); }
    static void PrintArea(int Length, int Breadth) {
        System.out.printf("The Area Of Rectangle Is %d\n", Length * Breadth); }
}
class Student2 {
    String Name, Address;
    int Age;
    Student2(){
        this.Name = "Unknown";
        this.Address = "Not Available";
        this.Age = 0;
    }
    public  void setInfo(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public  void setInfo(String Name, int Age, String Address){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }
    public void Display(){
        System.out.printf("Name         : %s\n", Name);
        System.out.printf("Age          : %d\n", Age);
        System.out.printf("Address      : %s\n", Address);
        System.out.println("----------------------------");
    }
}

// Lab 07
class Shapes{
    protected double area;
    Shapes(){
        area = 0;
    }
    public double getArea() {
        return area;
    }
    public void onAreaChange() {
        System.out.printf("The Value Of Area is %.2f\n", area);
    }
}
class Circle2 extends Shapes{
    private final double radius, PI;
    Circle2(int radius){
        this.radius = radius;
        PI= 3.142;
    }
    @Override
    public void onAreaChange(){
        area = PI * (radius*radius);
        super.onAreaChange();
    }
}
class Rectangle2 extends Shapes{
    private final double height, width;
    Rectangle2(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public void onAreaChange(){
        area = height * width;
        super.onAreaChange();
    }
}
class Triangle extends Shapes{
    private final double base, height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public void onAreaChange(){
        area = 0.5 *(height * base);
        super.onAreaChange();
    }
}
class Item{
    protected String Name, Brand, TradeMark;
    protected int Price;
    protected String Made_In;
    Item(){
        Name = "Not Available";
        Brand = "Not Available";
        TradeMark = "Not Available";
        Price = 0;
        Made_In = "Not Available";
    }
    Item(String Name, String Brand, String TradeMark, int Price, String Made_In){
        this.Name = Name;
        this.Brand = Brand;
        this.TradeMark = TradeMark;
        this.Price = Price;
        this.Made_In = Made_In;
    }
    public void display(){
        System.out.println("Name :"+ Name);
        System.out.println("Price :"+ Price);
        System.out.println("Brand :"+ Brand);
        System.out.println("Trade Mark No. :"+ TradeMark);
        System.out.println("Made in :"+ Made_In);
    }
}
class Cloth extends Item {
    private final String Season;
    private final String Type;
    Cloth(String Season,String Type){
        this.Season = Season;
        this.Type = Type;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Collection : "+ Season);
        System.out.println("Cloth Type : "+ Type);
    }
}
class Pharmacy extends Item {
    String Size, Purpose, Effect ;
    Pharmacy(String Purpose,String Size,String Effect){
        this.Purpose = Purpose;
        this.Size = Size;
        this.Effect = Effect;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Purpose : "+ Purpose);
        System.out.println("Effect : "+ Effect);
        System.out.println("Size in mg : "+ Size);
    }
}
class Electronic extends Item {
    private final int Volts;
    private final String Automatic_or_Manual;
    private final String Water_Res;
    public Electronic(String Type, String Waterproof, int Volts){
        this.Volts = Volts;
        this.Water_Res = Waterproof;
        this.Automatic_or_Manual = Type;
    }
    public void display(){
        super.display();
        System.out.println("Voltage : "+ Volts);
        System.out.println("Type : "+ Automatic_or_Manual);
        System.out.println("Water proof : "+ Water_Res);
    }
}
class Human{
    public void walk(){
        System.out.println("Walking...");
    }
    public void talk(){
        System.out.println("Talking...");
    }
}
class Alien extends Human{
    public void grow(){
        System.out.println("Growing...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}
class Pirates extends Human{
    public void sailing(){
        System.out.println("Sailing...");
    }
    public void attack(){
        System.out.println("Attacking...");
    }
    public void destroy(){
        System.out.println("Destroying Ship...");
    }
}
class Cuisines{
    private final String name;
    private final int quantity;
    private final double price;
    Cuisines(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void Display(){
        System.out.println("Name = " + name);
        System.out.println("Quantity = " + quantity);
        System.out.println("Price = " + price);
    }
}
class Pakistani extends Cuisines{
    String pakDishes;
    String Ingredients;
    public Pakistani(String name, int quantity, double price, String pakDishes ,String Ingredients) {
        super(name, quantity, price);
        this.pakDishes = pakDishes;
        this.Ingredients = Ingredients;
    }
    public void Display(){
        super.Display();
        System.out.println("Pakistani = " + pakDishes);
    }
}
class BBQ extends Cuisines{
    String bbqDish, Sauce;
    public BBQ(String name, int quantity, double price, String bbqDish, String Sauce) {
        super(name, quantity, price);
        this.Sauce = Sauce;
        this.bbqDish = bbqDish;
    }
    public void Display(){
        super.Display();
        System.out.println("BBQ = " + bbqDish);
    }
}
class Chinese extends Cuisines{
    String ChineseDish, Beverages;
    public Chinese(String name, int quantity, double price, String ChineseDish, String Beverages) {
        super(name, quantity, price);
        this.ChineseDish = ChineseDish;
        this.Beverages = Beverages;
    }
    public void Display(){
        super.Display();
        System.out.println("Chinese Dish = " + ChineseDish);
        System.out.println("Beverages = " + Beverages);
    }
}
class Item1 {
    private String Name;
    private final double unitPrice;
    public Item1() {
        this.Name = "no Item";
        this.unitPrice = 0;
    }
    public Item1(String Name, double unitPrice) {
        this.Name = Name;
        this.unitPrice = unitPrice;
    }
    public double getPrice() {
        return unitPrice;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void tostring(){
        System.out.printf("%s@ %.2f \n",Name, unitPrice);
    }
}
class WeighedItem extends Item1 {
    double weight;
    WeighedItem(String Name, double unitPrice, double weight){
        super(Name, unitPrice);
        this.weight = weight;
    }
    public double getPrice(){
        return weight * super.getPrice();
    }
    public void tostring(){
        System.out.printf("%s@ %.2f   %.2f KG  =  %.2f PKR \n",super.getName(), super.getPrice(), weight, getPrice());
    }
}
class CountedItem extends Item1 {
    int quantity;
    CountedItem(String Name, double unitPrice, int quantity){
        super(Name, unitPrice);
        this.quantity = quantity;
    }
    public double getPrice(){
        return quantity * super.getPrice();
    }
    public void tostring(){
        System.out.printf("%s@ %.2f   %d units  =  %.2f PKR\n",super.getName(), super.getPrice(), quantity, getPrice());
    }
}

class Employee3 {
    String FirstName, LastName, CNIC;
    public Employee3() {
        FirstName = "N/A";
        LastName = "N/A";
        CNIC = "Not Available";
    }
    public Employee3(String FirstName, String LastName, String CNIC) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CNIC = CNIC;
    }
    @Override
    public String toString(){
        return FirstName + " " + LastName + "\nCNIC # : "+ CNIC;
    }
    public double earning(){
        return 0.00;
    }
}

class SalariedEmployee extends Employee3 {
    double weeklySalary;
    public SalariedEmployee() {
        FirstName = "N/A";
        LastName = "N/A";
        CNIC = "Not Available";
        weeklySalary = 0.00;
    }
    public SalariedEmployee(String FirstName, String LastName, String CNIC, double weeklySalary) {
        super(FirstName, LastName, CNIC);
        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0) {
            this.weeklySalary = weeklySalary;
        }
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    @Override
    public String toString() {
        return "\n \t Salaried Employee \n" +super.toString();
    }
    @Override
    public double earning() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee3 {
    double wage, hours;
    public void setWage(double wage) {
        this.wage = wage;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public HourlyEmployee() {
        FirstName = "N/A";
        LastName = "N/A";
        CNIC = "Not Available";
        wage = 0.0;
        hours = 0.0;
    }
    public HourlyEmployee(String FirstName, String LastName, String CNIC, double wage, double hours) {
        super(FirstName, LastName, CNIC);
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public String toString() {
        return "\n \tHourly Employee  \n" + super.toString();
    }
    @Override
    public double earning() {
        if (hours <= 40) {
            return wage*hours;
        } else {
            return 40*wage + (hours - 40) * wage * 1.5;
        }
    }
}

class CommissionEmployee extends Employee3 {
    double grossSales, commissionRate;
    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        }
    }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0) {
            this.commissionRate = commissionRate;
        }
    }
    public CommissionEmployee() {
        FirstName = "N/A";
        LastName = "N/A";
        CNIC = "Not Available";
        grossSales = 0.0;
        commissionRate = 0.0;
    }
    public CommissionEmployee(String FirstName, String LastName, String CNIC, double grossSales, double commissionRate) {
        super(FirstName, LastName, CNIC);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    @Override
    public String toString() {
        return "\n \tCommission Employee \n" + super.toString();
    }
    @Override
    public double earning() {
        return grossSales * commissionRate;
    }
}
class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public BasePlusCommissionEmployee() {
        FirstName = "N/A";
        LastName = "N/A";
        CNIC = "Not Available";
        grossSales = 0.0;
        commissionRate = 0.0;
        baseSalary = 0.0;
    }
    public BasePlusCommissionEmployee(String FirstName, String LastName, String CNIC, double grossSales, double commissionRate, double baseSalary) {
        super(FirstName, LastName, CNIC, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public String toString() {
        return "\n Base Plus Commission Employee " + super.toString();
    }
    @Override
    public double earning() {
        return baseSalary + super.earning();
    }
}

class Shape{
    int Area;
    public double getArea() {
        return Area;
    }
}
class Square extends Shape{
    int length;
    @Override
    public double getArea() {
        return length* length;
    }
}
class Circle3 extends Shape{
    int radius;
    @Override
    public double getArea() {
        return (3.142)* radius * radius;
    }
}
class Rectangle3 extends Square{
    int width;
    @Override
    public double getArea() {
        return width * length;
    }
}

class Flight1 {
    int flightId;
    Time time;
    List<Passenger> passengers;
    int noOfPassengers = 0;

    public Flight1(int flightId, Time time, List<Passenger> passengers) {
        this.flightId = flightId;
        this.time = time;
        this.passengers = passengers;
        for (Passenger p : passengers){
            noOfPassengers++;
        }
    }
    public void Display(){
        System.out.println("\n Flight Info");
        System.out.println("Flight No   : " + flightId);
        System.out.println("Arrival     : " + time.arrival);
        System.out.println("Departure   : " + time.departure);
        System.out.println("No. Of Passengers : " + noOfPassengers);
    }
}

class Time {
    String arrival, departure;
    Date d1, d2;
    int totalMinute, totalHours;
    public void inputTime() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter arrival time (hh:mm ss): ");
        arrival = input.nextLine();
        System.out.println();
        System.out.print("Enter departure time (hh:mm ss): ");
        departure = input.nextLine();
        DateFormat format = new SimpleDateFormat("hh:mm aa");
        d1 = format.parse(arrival);
        d2 = format.parse(departure);
    }
    public void getMinute(){
        totalMinute = d2.getMinutes() + d1.getMinutes();
        if (totalMinute >= 60){
            totalMinute -= 60;
            totalHours++;
        }
        System.out.printf("Minute  : %d\n", totalMinute);
    }
    public void getHour(){
        totalHours = d2.getHours() - d1.getHours();
        System.out.printf("Hour  : %d\n", totalHours);
    }
}

class Passenger {
    String Name, From, To;

    public Passenger(String name, String from, String to) {
        Name = name;
        From = from;
        To = to;
    }
    public String toString() {
        return "Name " + Name + ", From " + From + ", To " + To;
    }
}

class Car1 {
    String Model, Year, VIN;
    public Engine engine;
    Doors door;
    Capacity capacity;
    public Wheel wheel;
    public Car1(String model, String year, String VIN) {
        engine = new Engine("Diesel", "746 Hp", true);
        door = new Doors();
        capacity = new Capacity(10);
        wheel = new Wheel("Panther", "Steel", 4);
        Model = model;
        Year = year;
        this.VIN = VIN;
    }
    public void Display(){
        System.out.println("\n\tCar Details\n");
        System.out.println("Model        : " + Model );
        System.out.println("Year         : "+ Year);
        System.out.println("VIN          : " + VIN);
        System.out.println("Engine Type  : " + engine.Type);
        System.out.println("Horse Power  : " + engine.Horse_Power);
        System.out.println("Automatic    : " + engine.isAutomatic);
    }
}

class Engine {
    String Type, Horse_Power;
    boolean isAutomatic;
    public Engine(String Type, String Horse_Power, boolean isAutomatic) {
        this.Type = Type;
        this.Horse_Power = Horse_Power;
        this.isAutomatic = isAutomatic;
    }
    public void startEngine() {
        System.out.println("Engine is Started...");
    }
}

class Doors {
    public void openDoor() {
        System.out.println("Opening Door...");
    }
    public void closeDoor() {
        System.out.println("Closing Door...");
    }
}

class Capacity {
    int totalCapacity, capacity;
    public Capacity(int capacity) {
        this.capacity = capacity;
        totalCapacity = capacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
    public void addObjects(int n){
        if (n <= totalCapacity){
            System.out.println("Objects Added : "+ n);
            capacity -= n;
            System.out.println("Capacity Remaining : "+ capacity);
        }
        else {
            System.out.println("Not Enough Space...(???'???'???)");
        }
    }
    public void removeObjects(int n) {
        if (capacity+n <= totalCapacity){
            System.out.println("Objects Removed : " +n);
            totalCapacity += n;
            System.out.println("Capacity Remaining : "+ totalCapacity);
        }
        else {
            System.out.println("No. Of Objects Are Greater Then Total Capacity i.e., Not Possible");
        }
    }
}

class Wheel {
    String Type, Quality;
    int no_OfWheel;
    public Wheel(String Type, String Quality, int no_OfWheel) {
        this.Type = Type;
        this.Quality = Quality;
        this.no_OfWheel = no_OfWheel;
    }
}

class Product {
    String productName;
    double price;
    List<Product> products = new ArrayList<Product>();
    Product(String productName, double price){
        this.productName = productName;
        this.price=price;
    }
    public String toString(){
        return "Product Name : " +productName+ "\tPrice : "+price;
    }
}

class Store {
    String storeName, location;
    List<Product> productInStore;
    Store(String storeName,String location,List<Product> productInStore){
        this.storeName = storeName;
        this.location=location;
        this.productInStore = productInStore;
    }
    public void printProducts(){
        int i = 1;
        System.out.println("Store Name : "+storeName);
        for(Product product: productInStore){
            System.out.printf("%d. %s\n", i, product.toString());
            i++;
        }
    }
    public String toString(){
        return "Store Name : " +storeName+ "\tLocation : "+location;
    }
}
class Company {
    String companyName, owner;
    List<Store> allStores;
    Company(String companyName, String owner, List<Store> stores){
        this.companyName = companyName;
        this.owner=owner;
        this.allStores = stores;
    }
    public void printStores(){
        int i = 1;
        System.out.println("Company Name : "+ companyName +"\nOwner : "+owner);
        for(Store store: allStores){
            System.out.printf("%d. %s", i, store.toString());
            i++;
            System.out.println();
        }
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

        /*Employee3 E1 = new Employee3();
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

        /*Circle3 circle = new Circle3();
        circle.Menu();*/

        // Task 02

        /*Sphere sphere = new Sphere(4);
        sphere.Menu();*/

        // Task 03

        /*Computer Pc = new Computer();
        Pc.Menu();*/

        // Task 04

        /*UniStudents St1 = new UniStudents("Rizan","Bahria University", 20, 1);
        UniStudents St2 = new UniStudents("Haseeb","Bahria University", 19, 1);
        UniStudents St3 = new UniStudents("Zeeshan","Bahria University", 18, 1);
        St1.Menu();*/

        /*------------------------
                 Lab 4
         ------------------------*/

        // Task 01

        /*Computer Pc = new Computer();
        Pc.Menu();*/

        // Task 02

        /*Cylinder cylinder = new Cylinder(3,4);
        cylinder.Menu();*/

        // Task 03

        /*Rectangle rec = new Rectangle();
        rec.Display();
        Rectangle rec2 = new Rectangle(9,10);
        rec2.Display();*/

        // Task 04

        /*Scanner input = new Scanner(System.in);
        Flight fl1 = new Flight(23, "Karachi", "Lahore", 50);
        Flight fl2 = new Flight(23, "Lahore", "Karachi", 50);
        fl1.reserve(10);
        fl1.cancel(2);
        Flight.checkIfEquals(fl1, fl2);*/

        //  Or
        /* if (fl1.getFlight_No() == fl2.getFlight_No()){
            System.out.println("Two Flights Have Same Flight Id...\n");
            System.out.print("Do You Want To Change It? [Y/n] : ");
            String Ans = input.next();
            if (Ans.equals("Y") || Ans.equals("y")){
                System.out.print("Input New Flight Id : ");
                fl1.setFlight_No();
                fl1.Display();
                fl2.Display();
            }
        }
        else {
            fl1.Display();
            fl2.Display();
        }*/

        /*------------------------  
                 Lab 5
         ------------------------*/

        // Task 1
        /*Rectangle rec= new Rectangle(34,56);
        Rectangle.Output_Area();*/

        // Task 2

        /*UniStudents St1 = new UniStudents("Rizwan", "Bahria", "02-131212-026", 2);
        UniStudents St2 = new UniStudents("Rizwan1", "Bahria", "02-131212-025", 2);
        UniStudents St3 = new UniStudents("Rizwan2", "Bahria", "02-131212-028", 2);
        UniStudents.setUniversity("Sir Syed");
        UniStudents.setSemester(3);
        St1.Display();
        St2.Display();
        St3.Display();*/

        // Task 3
        /*printNTimes(6, "Rizan");*/

        // Task 4
        /*Insult("Rizan", 50);*/

        // Task 5
        /*greetMe("Rizan");*/

       /*------------------------
                 Lab 6
         ------------------------*/

        // Task 01

        /*Calculator.Sum(1,2);
        Calculator.Sum(1,2,3);
        Calculator.Sum(1,2,3,4);
        Calculator.Sum(1,2,3,4,5);*/

        // Lab 02
        /*Area.PrintArea(6);
        Area.PrintArea(2,4);*/

        // Lab 03
        /*Student2 St1 = new Student2();
        Student2 St2 = new Student2();
        Student2 St3 = new Student2();
        Student2 St4 = new Student2();
        St1.setInfo("Rizan", 20);
        St2.setInfo("Ali", 23);
        St3.setInfo("Zeeshan", 17, "Gulshan");
        St4.setInfo("Ahsan", 19, "Defence");
        St1.Display();
        St2.Display();
        St3.Display();
        St4.Display();*/

        /*------------------------
                 Lab 7
         ------------------------*/

        // Task 1

        /*Circle2 cr = new Circle2(2);
        Triangle tr = new Triangle(2, 4);
        tr.onAreaChange();
        cr.onAreaChange();*/

        // Task 2

        /*Human Man = new Human();
        Man.talk();
        Man.walk();
        Pirates pr = new Pirates();
        pr.walk();
        pr.attack();*/

        // Task 3

        /*Cloth cloth = new Cloth("Summer", "Washing Wear");
        cloth.Name = "Cotton";
        cloth.Brand = "Gul Ahmed";
        cloth.Made_In = "Pakistan";
        cloth.Price = 2000;
        cloth.display();*/

        // Task 4

        /*Chinese chinese = new Chinese("Chinese Food", 2, 500, "Chinese Rice", "Pepsi");
        chinese.Display();*/

        // Task 5

        /*Item1 item = new Item1("Banana", 120);
        WeighedItem item2 = new WeighedItem("Orange", 100, 3);
        item.tostring();
        item2.tostring();*/

        /*------------------------
                 Lab 8
         ------------------------*/

        // Task 1

        /*Employee3 firstEmployee = new SalariedEmployee("Rizwan", "Akram", "111-11-1111", 800.00);
        Employee3 secondEmployee = new CommissionEmployee("Haseeb", "Alam", "222-22-2222", 10000, 0.06);
        Employee3 thirdEmployee = new BasePlusCommissionEmployee("Zeeshan", "Ibrar", "333-33-3333", 5000, 0.04, 300);
        Employee3 fourthEmployee = new HourlyEmployee("Hannan", "Khan", "444-44-4444", 16.75, 40);

        System.out.println(firstEmployee);
        System.out.printf("%s %s Salary : %.2f\n\n",firstEmployee.FirstName,firstEmployee.LastName,firstEmployee.earning());
        System.out.println(secondEmployee);
        System.out.printf("%s %s Salary : %.2f\n\n",secondEmployee.FirstName,secondEmployee.LastName,secondEmployee.earning());


        System.out.println(thirdEmployee);
        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;

        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("Old Base Salary: " + oldBaseSalary);

        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("New Base Salary with 10% Increase Is: " + currentEmployee.getBaseSalary());
        System.out.printf("%s %s Salary : %.2f\n\n",thirdEmployee.FirstName,thirdEmployee.LastName,thirdEmployee.earning());
        System.out.println(fourthEmployee);
        System.out.printf("%s %s Salary : %.2f\n\n",fourthEmployee.FirstName,fourthEmployee.LastName,fourthEmployee.earning());*/

        // Task 02

        /*Rectangle3 rec = new Rectangle3();
        rec.length = 2;
        rec.width = 3;
        rec.getArea();*/

        /*------------------------
                 Lab 9
         ------------------------*/

        // Task 01

        /*Car car = new Car("Altis", "2016", "ABC-213");
        car.door.openDoor();
        car.capacity.addObjects(3);
        car.door.closeDoor();
        car.door.openDoor();
        car.capacity.removeObjects(4);
        car.door.closeDoor();
        car.Display();*/

        // Task 02

        /*Time time = new Time();
        time.inputTime();
        Passenger passenger1 = new Passenger("Rizwan", "Karachi", "Islamabad");
        Passenger passenger2 = new Passenger("Zeeshan", "Karachi", "Lahore");
        Passenger passenger3 = new Passenger("Haseeb", "Karachi", "Rawalpindi");
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        for (Passenger pgr :
                passengers) {
            System.out.println(pgr.toString());
        }
        Flight flight = new Flight(1234, time, passengers);
        flight.Display();
        flight.time.getHour();
        flight.time.getMinute();*/

        // Task 03

        /*Product p1 = new Product("Refrigerator",20000);
        Product p2 = new Product("Washing Machine",30000);
        Product p3 = new Product("Shirts",50000);
        Product p4 = new Product("T Shirts",500);
        Product p5 = new Product("Fruits",300);
        Product p6 = new Product("Grocery Items",10000);
        List<Product> Electronics = new ArrayList<Product>();
        Electronics.add(p1);
        Electronics.add(p2);
        List<Product> Clothes = new ArrayList<Product>();
        Clothes.add(p3);
        Clothes.add(p4);
        List<Product> Grocery = new ArrayList<Product>();
        Grocery.add(p5);
        Grocery.add(p6);
        System.out.println();
        List<Store> stores = new ArrayList<Store>();
        Store s1 = new Store("Electronic Store","Faisalabad",Electronics);
        Store s2 = new Store("Clothes Store","Karachi",Clothes);
        Store s3 = new Store("Grocery Store","Lahore",Grocery);
        stores.add(s1);
        stores.add(s2);
        stores.add(s3);
        System.out.println();
        System.out.println("    Products in each store");
        s1.printProducts();
        s2.printProducts();
        s3.printProducts();
        System.out.println();
        Company company1 = new Company("Imtiaz Super","Mr. Rehman", stores);
        company1.printStores();*/
    }
    static void Insult(String name, int age){
        if (age > 0 && age <= 10) {
            System.out.printf("Hello %s You're So Sweet..\n", name);
        } else if(age > 10 && age <= 17){
            System.out.println("Hmm... You're So Dweeb..");
        }else if(age > 17 && age <= 20){
            System.out.printf("Congrats %s You're Counting Down To Legal Age..\n", name);
        }else if(age == 21){
            System.out.printf("Congrats %s You Just Made a Legal Age..\n", name);
        }else if(age > 21 && age <= 29){
            System.out.printf("Sorry %s But You're Counting Down To 30..\n", name);
        }else if(age > 29 && age <= 40){
            System.out.printf("Mr. %s You're Suffering Adult..\n", name);
        }else if(age > 40 && age < 50){
            System.out.printf("Sorry To Say %s But You're a Miserable Adult..\n", name);
        }else if(age >= 50){
            System.out.println("Wow... We're Speechless..\n");
        }else{
            System.out.println("Invalid Input...");
        }
    }
    static void printNTimes(int num, String name){
        for (int i = 0; i < num ; i++) {
            System.out.println(name);
        }
    }
    static void greetMe(String Name){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Name: ");
        String name=input.nextLine();
        System.out.printf("Hello %s How Was Your Day...??\n",name);
        System.out.println("Enter your Age: ");
        int age=input.nextInt();
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
        BMI = (mass / Math.pow(height,2)) * 703;
        System.out.printf("Your Body Mass Index Is %f",BMI);
    }
}
