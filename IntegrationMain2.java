//Bryce Whitcomb
//June 1, 2020
//Bookshelf Calculator
//This program does not account for input errors
//This program calculates the number of books that can be stored on a bookshelf.

//Below are some definitions for keywords relating to this program
//Variable: A variable is a type of data that is stored as something with a different name.
//Scope: A scope is the association of a variable to its data.
//Method Call: A method call is a method name 

package IntegrationProject;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Random;
import java.util.ArrayList;

public class IntegrationMain2 {

    //This method is called to compare the length of two book titles.
    //The method is titles bookLength and its argument will be the values inserted into the parameters.
    //The header for this method is the int, determining what datatype will be returned.
    //The parameters for this method are the ints within the parentheses that will be replaced by a later argument.
    static int bookLength(int bookName, int bookName2) {
        int bookNameLength = max(bookName, bookName2);
        return bookNameLength;
    }

    static String facts() {
        String fact = "The next section will give you data on the books on your shelf.";
        return fact;
    }

    static String goodbye() {
        String l8r = "Thanks for using this program!";
        return l8r;
    }

    public static void main( String[] args) {

         Scanner input = new Scanner(System.in);

         Random random = new Random();

        //This is a greeting using a print statement.
        //It is the first thing the user will see.
        System.out.println("This program calculates the total shelfspace of a bookshelf.");
        System.out.println("Additionally it will help inventory the books you have and choose books to read!\n");

        System.out.println("How many shelves does the bookshelf have?");
        int shelves = input.nextInt();

        //This is a double variable used to determine the length of each booksehelf.
        //A double is a variable that always contains a number, including its decimal value.
        //The deciaml of a double ranges from 0 to 15 digits.
        System.out.println("How long is the length of one shelf in centimeters?");
        double length = input.nextDouble();

        System.out.println("What is the length of one of your books in centimeters?");
        double bookLength = input.nextDouble();

        //This section calculates how many copies of the book can be stored on the shelf.
        //This section also casts the bookLength and totalLength variables from doubles to integers.
        //casting is the process of changing a variable from one type to another.
        double totalLength = length * shelves;
        int bookAmount = (int) (totalLength / bookLength);
        System.out.println("You can fit approximately " + bookAmount + " books on the bookshelf.\n");

        //This section will determine how many books the user has and what genre they belong to.
        //The while statement below executes as long as the user does not input "stop".
        //While loops only execute while the argument is true.
        System.out.println("Please enter the name of each non-fiction book you have.\n"
        + "Enter the books one at a time and type 'stop' when you are finished.");
        int nonFicCount = 0;
        String nonFicString = "x";
        ArrayList<String> nonFicList = new ArrayList<String>();
        while (!nonFicString.equals("stop")) {
            nonFicString = input.nextLine();
            nonFicList.add(nonFicString);
            nonFicCount = nonFicCount + 1;
        }

        System.out.println("\nPlease enter the name of each fiction book you have.\n"
        + "Enter the books one at a time and type 'stop' when you are finished.");
        int FicCount = 0;
        String FicString = "x";
        ArrayList<String> FicList = new ArrayList<String>();
        while (!FicString.equals("stop")) {
            FicString = input.nextLine();
            FicList.add(FicString);
            FicCount = FicCount + 1;
        }

        //This section will determine what genre the user wants to read
        //This section uses a switch statement, which has a predetermined number of outputs, based on what case is chosen
        //If no cases are activated, the switch will use the default output.
        //The break statement will end any loop, including a switch.
        System.out.println("\nWhat genre of book do you want to read?");
        System.out.println("Enter 1 for fiction.");
        System.out.println("Enter 2 for non-fiction.");;
        System.out.println("Enter 3 if you do not want to read anything.");
        int genre = input.nextInt();
        String genreString;
        switch(genre) {
            case 1: genreString = "Fiction";
                break;
            case 2: genreString = "Non-Fiction";
                break;
            case 3: genreString = "None";
                break;
            default: genreString = "Invalid input";
                break;
        }

        //This section will reccomend a random book from the requested genre.
        //The == operator determines if 
        if (genreString == "None"){
            System.out.println("There is no book recommendation to make");
        }
        if (genreString == "Non-Fiction"){
            int nonFicRand = random.nextInt(nonFicCount - 1) + 1;
            System.out.println("You should read " + nonFicList.get(nonFicRand));
        }
        if (genreString == "Fiction"){
            int FicRand = random.nextInt(FicCount - 1) + 1;
            System.out.println("You should read " + nonFicList.get(FicRand));
        }

        //A for loop will run a set number of times.
        //The ++ operator adds 1 to the int each time it loops.
        //The compareTo method compares the length of 2 strings and returns the difference of them.
        //The || is a conditional operator for or in java.
        int nonFicBook = 0;
        int nonBookCount = 1;
        int nonBookCount2 = 0;
        int nonFicListSize = nonFicList.size();
        do {
            String firstBook = nonFicList.get(nonFicBook + nonBookCount2);
            String secondBook = nonFicList.get(nonFicBook + nonBookCount);
            int bookDiff = firstBook.compareTo(secondBook);
            if (bookDiff >= 0) {
                nonBookCount = nonBookCount + nonBookCount2 + 1;
            }
            else{
                nonBookCount2 = nonBookCount2 + nonBookCount + 1;
            }
        }while (nonBookCount2 < nonFicListSize || nonBookCount < nonFicListSize);
        //The max method comes form the Math class, which is imported at the start.
        int longNonTitle = max(nonBookCount, nonBookCount2);
        System.out.println("The non-fiction book with the longest title is " + longNonTitle + "characters!");

        int ficBook = 0;
        int ficBookCount = 1;
        int ficBookCount2 = 0;
        int ficListSize = FicList.size();
        do {
            String thirdBook = FicList.get(ficBook + ficBookCount2);
            String fourthBook = FicList.get(ficBook + ficBookCount);
            int bookDiff2 = thirdBook.compareTo(fourthBook);
            if (bookDiff2 >= 0){
                ficBookCount = ficBookCount + ficBookCount2 + 1;
            }
            else{
                ficBookCount2 = ficBookCount2 + ficBookCount + 1;
            }
        }while (ficBookCount2 < ficListSize || ficBookCount < ficListSize);
        int longTitle = max(ficBookCount, ficBookCount2);
        System.out.println("The fiction book with the longest title is " + longTitle + "characters!");

        int longestBook = bookLength(longNonTitle, longTitle);

        System.out.println("The longest book on your bookshelf is" + longestBook + "characters long!!");

        goodbye();
        //This stops the scanner from looking for any inputs.
        input.close();
    }
}
