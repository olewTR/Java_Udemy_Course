public class HelloWorld {

    public static void main(String args[]) {
        char myChar = '&';  // w tej zmiennej można trzymać pojedynczy znak.
        char myOtherChar = '\u00a9';  // w ten sposob przesylamy unicode char - ten to copyright

        boolean myBoolean = true;
        boolean myOtherBoolean = false; // tylko te dwie wartosci w tych zmiennych

        // challenge for the video - find the code for "registered" unicode character
        // and print it:

        char unicodeCharForRegisteredChar = '\u00AE';

        System.out.println(unicodeCharForRegisteredChar);

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more!";
        System.out.println(myString);
        myString+="\u00A9";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt; // int przeksztalcony w stringa
        System.out.println(lastString);

        // tutaj powtorka z ternary operatora;
        boolean isCar = true;

        boolean wasCar = isCar ? true : false; // jezeli warunek true, to pierwszy, jezeli nie, to drugi

        if(wasCar)
            System.out.println("yea, car was");


        // challenge here ! :
        // 1. create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        // if the remaining total (#4) is equal to 20 or less

        double challengeVarOne = 20;
        double challengeVarTwo = 80;
        double result = (challengeVarOne + challengeVarTwo) * 25;
        System.out.println(result + " this is the result");
        double reminderResult = result % 40;
        System.out.println(reminderResult + " this is the reminder result");
        if(reminderResult <= 20)
        {
            System.out.println("Total was over the limit");
        }
    }
}
