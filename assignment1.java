/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
    
    abstract void displayShapeType();
}

class Circle extends Shape implements Drawable{
    double radius;
    
    @Override
    public void draw(){
        System.out.println("Sketching now");
    }
    
    @Override
    public void displayShapeType(){
        System.out.println("The shape is circle.");
    }
    
    void calculateArea(){
        double area = 3.14 * (this.radius*this.radius);
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape implements Drawable{
    double width, len;
    
    void calculateArea(){
        double area = this.width * this.len;
        System.out.println("Area: " + area);
    }
    
    @Override
    public void draw(){
        System.out.println("Sketching now");
    }
    
    @Override
    public void displayShapeType(){
        System.out.println("The shape is rectangle.");
    }
}

interface Drawable{
    void draw();
}

class Book{
    String title, author;
    private float price;
    Book next;
    
    float getPrice(){
        return this.price;
    }
    
    void setPrice(float newprice){
        this.price = newprice;
    }
    
    void displayDetails(){
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
    
    void applyDiscount(float percentage){
        percentage *= 0.01;
        this.price -= (price*percentage);
    }
}

class Ebook extends Book{
    int fileSize;
    
    @Override
    void displayDetails(){
        System.out.println("EBook Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Filesize: " + this.fileSize + "mb");
    }
}

public class assignment1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Los Pollos Negroes\n");
        System.out.println("Leader: \nASTRERA, RHEZ STEPHEN\n");
        System.out.println("Members: ");
        System.out.println("ABOY, RAYMOND BENJAMIN");
        System.out.println("BANSIL, JOHN CHRISTIAN");
        System.out.println("CATO, IANN LUIGI");
        System.out.println("DIMLA, JAMES BRANDON");
        System.out.println("MENDOZA, KIM ANDREI\n");
        menu();
    }
    
    
    static void menu(){
        Scanner nga = new Scanner(System.in);
        int chc;
        int x=0;
        int y = 0;
        Book[] books = new Book[5];
        
        do{
            System.out.println("Menu");
            System.out.println("====================");
            System.out.println("1. Books and Ebooks\n2. Shapes Area Calculation\n0. Exit");
            System.out.println("====================");
            System.out.print("> ");
            chc = nga.nextInt();
            nga.nextLine();
            System.out.println("");
            
            switch(chc){
                case 1:
                    bookMenu();
                    break;
                case 2:
                    shapesMenu();
                    break;
                case 0:
                    System.out.println("thanks");
                    break;
            }
            System.out.println("");
        } while(chc!=0);   
    } 
    
    
    public static void bookMenu(){
        Scanner nga = new Scanner(System.in);
        int chc;
        int x=0;
        int y = 0;
        int j = 0;
        int k = 0;
        int itr = 0;
        Book[] books = new Book[5];
        Ebook[] ebooks = new Ebook[5];
        
        do{
            System.out.println("Book Menu");
            System.out.println("====================");
            System.out.println("1. Add Book\n2. Add eBook\n3. Display Books\n4. Display eBooks\n5. Display All\n0. Back");
            System.out.println("====================");
            System.out.print("> ");
            chc = nga.nextInt();
            nga.nextLine();
            System.out.println("");
            
            switch(chc){
                case 1:
                    Book b1 = new Book();
                    System.out.print("Enter Book Title: " );
                    b1.title = nga.nextLine();
                    System.out.print("Enter Book Author: " );
                    b1.author = nga.nextLine();
                    System.out.print("Enter Book Price:" );
                    b1.setPrice(nga.nextFloat());  
                    books[x] = b1;
                    x++;
                    System.out.println("");
                    break;
                case 2:
                    Ebook eb1 = new Ebook();
                    System.out.print("Enter Book Title: " );
                    eb1.title = nga.nextLine();
                    System.out.print("Enter Book Author: " );
                    eb1.author = nga.nextLine();
                    System.out.print("Enter Book Price: " );
                    eb1.setPrice(nga.nextFloat());  
                    ebooks[j] = eb1;
                    j++;
                    System.out.println("");
                    break;
                case 3:
                    for(Book book : books){
                    if(x==y){
                        break;
                    }
                    book.displayDetails();
                    System.out.println("Original price: " + book.getPrice());
                    book.applyDiscount(20);
                    System.out.println("Discounted price: " + book.getPrice());
                    System.out.println("");
                    System.out.println("===========================");
                    y++;
                    
                    }
                    y=0;
                    break;
                case 4:
                    for(Ebook ebook : ebooks){
                    if(j==k){
                        break;
                    }
                    ebook.displayDetails();
                    System.out.println("Original price: " + ebook.getPrice());
                    ebook.applyDiscount(20);
                    System.out.println("Discounted price: " + ebook.getPrice());
                    System.out.println("");
                    System.out.println("===========================");
                    k++;
                    
                    }
                    k = 0;
                    break;
                case 5:
                    System.out.println("Books: ");
                    for(Book book : books){
                    if(x==y){
                        break;
                    }
                    book.displayDetails();
                    System.out.println("Original price: " + book.getPrice());
                    book.applyDiscount(20);
                    System.out.println("Discounted price: " + book.getPrice());
                    System.out.println("");
                    System.out.println("===========================");
                    y++;
                    
                    }
                    
                    y=0;
                    System.out.println("");
                    System.out.println("Ebooks: ");
                    for(Ebook ebook : ebooks){
                    if(j==k){
                        break;
                    }
                    ebook.displayDetails();
                    System.out.println("Original price: " + ebook.getPrice());
                    ebook.applyDiscount(20);
                    System.out.println("Discounted price: " + ebook.getPrice());
                    System.out.println("");
                    System.out.println("===========================");
                    k++;
                    
                    }
                    k=0;
                    break;
                case 0:
                    break;
            }
        } while (chc!=0);
    }
    
    public static void shapesMenu(){
        Scanner nga = new Scanner(System.in);
        int chc;
        int x=0;
        int y = 0;
        
        do{
            System.out.println("====================");
            System.out.println("1. Circles\n2. Rectangles\n0. Back");
            System.out.println("====================");
            System.out.print("> ");
            chc = nga.nextInt();
            nga.nextLine();
            System.out.println("");
            
            switch(chc){
                case 1: 
                    Circle c = new Circle();
                    System.out.print("Enter Radius: ");
                    c.radius = nga.nextInt();
                    c.displayShapeType();
                    c.draw();
                    c.calculateArea();
                    break;
                case 2: 
                    Rectangle r = new Rectangle();
                    System.out.print("Enter Length: ");
                    r.len = nga.nextInt();
                    System.out.print("Enter Width: ");
                    r.width = nga.nextInt();
                    r.displayShapeType();
                    r.draw();
                    r.calculateArea();
                    break;
            }
            System.out.println("");
        } while (chc!=0);
    }
    
    
    
}