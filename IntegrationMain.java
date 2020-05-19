package IntegrationProject;
//Bryce Whitcomb
//May 19, 2020
//Bookshelf Calculator
//This program does not account for input errors
//This program calculates the total shelf length for a bookshelf. (This is a placeholder while I come up with a better idea for my integration project.)

//Below are some definitions for keywords relating to this program
//Variable: A variable is a type of data that is stored as something with a different name.
//Scope: A scope is the association of a variable to its data.


import java.util.Scanner;
public class IntegrationMain {


    //This section will determine if the bookshelf has any empty shelves.
    //This section uses the input from line 47.
    static boolean Shelves(final String shelf) {
        boolean shelves = true;
        final Scanner input = new Scanner(System.in);
    if (shelf == "y"){
        shelves = true;
        
    }
    if (shelf == "n"){
        shelves = false;
        
    }
    return shelves;

    }



    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        
        //This is a greeting using a print statement.
        //It is the first thing the user will see.
        System.out.println("This program calculates the total shelfspace for a bookshelf.");

        //This is a boolean that determines if the bookshelf is completely empty.
        //A boolean is a variable that is either true or false.
        boolean shelves = true;
        System.out.println("Is the bookshelf currently empty?(enter y for yes, or n for no)");
        final String shelf = input.nextLine();
        Shelves(shelf);

        //This is an int variable that determines the number of book shelves.
        //An int is a variable that is always a whole integer.
        int finalShelves = 0;
        if(shelves = true){
            System.out.println("How many shelves are there?");
        }
        if(shelves = false){
            System.out.println("How many empty shelves are there?");
        }
        finalShelves = input.nextInt();
        


        //This is a double variable used to determine the length of each booksehelf.
        //A double is a variable that always contains a number, including its decimal value.
        //The deciaml of a double ranges from 0 to 15 digits.

        System.out.println("How long is the length of one shelf in centimeters?");
        final double length = input.nextDouble();

        //This is a string that determines the name of the book that will go on the shelf.
        //A string is a variable containing any alphanumeric symbol.
        final String books = input.nextLine();
        System.out.println("What is the name of a book you want to keep on the bookshelf?");
        
        final String book = input.nextLine();

        //This double calculates the length of the book
        System.out.println("What is the length of " + book + " in centimeters.");
        final double bookLength = input.nextDouble();

        //This section calculates how many copies of the book can be stored on the shelf
        final double totalLength = length * finalShelves;
        final int bookAmount = (int) (totalLength / bookLength);
        System.out.println("A total of " + bookAmount + " copies of '" + book + "' can be stored on this bookshelf.");

    }
}
