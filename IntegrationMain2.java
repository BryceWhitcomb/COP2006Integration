//Bryce Whitcomb
//June 1, 2020
//Integration Project
//Description: Due to me having absolutely no imagination, ...
//this program will demonstrate all of the code we have reviewed ...
//in this course in a cohesive manner, but not have a central purpose.

//Below are some definitions for keywords relating to this program
//Variable: A variable is a type of data that is stored as something with a different name.
//Scope: A scope is the association of a variable to its data.
//Method Call: A method call is a method name 
//Operator precedence: The order in which operations will take place in an expression.
//Inheritance: The ability of a child class to access the fields of its parent class.
//Polymorphism: Referencing a child class using a parent class.
//Data types: Types of vaiables in java.

package IntegrationProject;
//imports everything within the java.util class.
import java.util.*;
public class IntegrationMain {

    //Method with arguments and return values
    //Header: The first line in a method, which declares the type and name.
    //Parameter: The argument within the method's parentheses.
    static int addMethod(int num1, int num2){
        return num1 + num2;
    }

    //Method overloading
    //Method overloading occurs when the same method can have 2 different arguments.
    static double addMethod(double num1, double num2){
        return num1 + num2;
    }

    
    
    public static void main(String[] args) {
        
        //This section initializes the scanner and random classes.
        //The Scanner class is now called with input
        //The Random class is now called with random
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //This is the greeting, the first message the user will see.
        //The println function will print the contents of the function on the next line.
        System.out.println("This program will demonstrate a wide array of what Java is capable of.");
        
        //This section demonstrates how while loops work, as well as some other functions.
        System.out.println("First this program will demonstrate how while loops can work.");
        System.out.println("This while loop will count all odd or even numbers in a range of your choice.");
        System.out.println("Enter the number whole you would like to start at.");
        //An int is a variable that stores the intager part of a number.
        //the nextInt function will take the value of the next intager input by the user.
        int lowNum = input.nextInt();
        //final
        //A final will cause a variable to keep its value permanently
        final int initialLowNum = lowNum;
        System.out.println("Next enter the number whole you would like to end at.");
        int highNum = input.nextInt();
        final int initialHighNum = highNum;
        System.out.println("All odd or even numbers in an ascending order:");
        //while loops will loop while the argument within them is true.
        //A relational operator compares two values, usually with < or >
        while(lowNum <= highNum){
            //+ in a print statement concatinates the two things on each side of it
            System.out.print(lowNum + " ");
            //+= will add the sum of the numbers to the right of it to the variable to the left of it.
            lowNum += 2;
        }
        System.out.println("\nAll of the numbers within this range in ascending order:");
        //This line will reset lowNum to its initial value.
        lowNum = initialLowNum;
        while(lowNum <= highNum){
            System.out.print(lowNum + " ");
            //++ increases the value of the variable next to it by 1
            lowNum++;
        }

        System.out.println("\nJava can also count in a decending order:");
        lowNum = initialLowNum;
        while(highNum >= lowNum){
            System.out.print(highNum + " ");
            //-= subtracts the sum to the right of it by the variable to the left of it.
            highNum -= 2;
        }
        System.out.println("\nAll of the numbers within this range in descending order:");
        highNum = initialHighNum;
        while(highNum >= lowNum){
            System.out.print(highNum + " ");
            //-- reduces the value of a variable next to it by 1
            highNum--;
        }
        System.out.println("\nThis section will divide the larger input by the smaller input\n" +
        "until it reaches a non divisible number, in which case a remainder is printed.");
        highNum = initialHighNum;
        int joyDivision = 0;
        int joyCount = 0;
        //The conditional operator is the ternary operator ?, which makes an if, then, else.
        //A do-while loop will always run once, then will run while it remains true.
        do {
            //% is the remainder operator, producing the remainder of one number that was divided by another
            joyDivision = (highNum % lowNum);
            joyCount++;
            //An if statement will only run if its argument is true
            if(joyDivision == highNum){
                //A break will end the current loop
                break;
            }
            //== is the equality operator and returns true if the argument is equal on each side
            if(lowNum == 1){
                joyDivision = 0;
                break;
            }
            if(lowNum == 0){
                joyDivision = 0;
            }
            // / is the division operator
            highNum = highNum / lowNum;
        }while(joyDivision == 0);
        System.out.println("The larger number was divided " + joyCount +
        " times the smaller number and the remainder was " + joyDivision);
        //Type casting is the assigment of one type of data to another
        //A double is a datatype containing a decimal.
        double doubleHighNum = initialHighNum;
        double doubleLowNum = initialLowNum;
        //* is the multiplication operator
        double visionOfDivision = doubleHighNum / (doubleLowNum * joyCount);
        System.out.println("The larger number divided by " + joyCount + 
        " times the smaller number is " + visionOfDivision);
        //+ is the addition operator
        System.out.println("Other java operaters include addition and subtraction.\n" + 
        "The larger number subtracted by the smaller number is: " + (initialHighNum -initialLowNum));
        //- is the subtraction operator
        System.out.println("The larger number added to the smaller number is: " + (initialHighNum + initialLowNum));
        //The random class will produce a random number within the assigned range
        int rangeNum = initialHighNum - initialLowNum;
        int randNum = (random.nextInt(rangeNum)) + initialLowNum;
        System.out.println("A random intager in the rang of the two entered numbers is: " +
        randNum);
        double doubleRandNum = randNum;
        System.out.println("The square root of the random intager is " + Math.sqrt(doubleRandNum));

        System.out.println("This next section will show how strings work.");
        System.out.println("Please enter your favorite animal.");
        input.nextLine();
        //A string is a variable containing a sequence of characters
        String favAnimal = input.nextLine();
        //An if-else statement is the same as a ternary construct
        //|| is the logical or operator
        if(favAnimal.equals("bear")||favAnimal.equals("bears")){
            System.out.println("That is my favorite too!");
        }else{
            System.out.println("That is a cool animal!");
        }
        System.out.println("With a string, each character can be printed individually.");
        int count;
        //A for loop will run for a set number of times
        //The length() method will return the character length of a given string 
        for(count = 0; count < favAnimal.length(); count++){
            //charAt
            System.out.print(favAnimal.charAt(count) + " ");
        }
        System.out.println("\nEnter your favorite month as an intager.");
        int month = input.nextInt();
        String monthS;
        //A switch statement tests a variable against multiple possible inputs, in order to determine the output
        switch (month){
            case 1: monthS = "January";
                break;
            case 2: monthS = "February";
                break;
            case 3: monthS = "March";
                break;
            case 4: monthS = "April";
                break;
            case 5: monthS = "May";
                break;
            case 6: monthS ="June";
                break;
            case 7: monthS = "July";
                break;
            case 8: monthS = "August";
                break;
            case 9: monthS = "September";
                break;
            case 10: monthS = "October";
                break;
            case 11: monthS = "November";
                break;
            case 12: monthS = "December";
                break;
            default: monthS = "Invalid input";
                break;
        }
        System.out.println("Your favorite things are " + favAnimal + " and the month "+
        monthS + ".");
        //The compareTo method compares the length of two strings
        System.out.println("The difference in characters between these tho things is " +
        favAnimal.compareTo(monthS));
        

        System.out.println("This next section will use arrays." +
        "\nPlease enter the size of the array you would like to make.");
        int funCount = 0;
        int numFunSize = input.nextInt();
        System.out.println("Please enter the intagers you would like to put into the array.");
        //An arraylist is an array with an unspecified number of variables
        ArrayList<Integer> numbersRFun = new ArrayList<Integer>();
        while(funCount < numFunSize){
            numbersRFun.add(input.nextInt());
            funCount++;
        }
        int numCount = 1;
        //The enhanced for loop uses a : and functions similarly to a normal for loop
        for(Integer arrayNum : numbersRFun){
            System.out.println(numCount + ": " + arrayNum);
            numCount++;
        }
        //finding the smallest number in an array using 
        //System.out.println("Next a preset array will be sorted to output the lowest number in it");
        //int sampleArray[] = {3,5,1,2,6};
        //Constructors arrayConstruct = new Constructors(sampleArray, 5);
        //System.out.println("The lowest number is: " + arrayConstruct.smolConstructors());

        System.out.println("Method overloading can cause a method to output different" +
        " things based on what is input.\nIf an int is put into this method, an int is output;" +
        "but if a double if input, a double is output.");
        //A method call calls a method and uses local inputs to determine what will be output
        int methodAdd1 = addMethod(3, 4);
        double methodAdd2 = addMethod(1.7, 2.2);
        System.out.println("input int: " + methodAdd1);
        System.out.println("input double: " + methodAdd2);
        
        //The close() method will cause java to stop looking for input
        input.close();
    }  
}
