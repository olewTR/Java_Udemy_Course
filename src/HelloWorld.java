public class HelloWorld {

    public static void main(String args[]) {
        byte myByteVariable = 10;
        short myShortVariable = 100;
        int myIntVariable = 1000;
        long myLongVariable = 50000 + 10 * (myByteVariable + myShortVariable + myIntVariable);
        System.out.println("my long value equals to: " + myLongVariable);

        // nie trzeba robic castu do longa, bo jest to operacja wsadzania mniejszej wartosci do wiekszej. Odwrotnie sie
        // domyslnie nie da, trzeba castowac (byte) itd.
    }
}

/*
1. Create a byte variable and set it to any valid byte number
2. Create a short variable and set it to any valid short number
3. Create an int variable and set it to any valid int number
4. Create a variable of type long. make it equal to
    50.000 + 10 times the sum of the byte plus the short plus the int

 */