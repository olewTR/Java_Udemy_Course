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


    }
}
