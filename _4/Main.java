package Java_Develhope.javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 23;
        System.out.println("My age is = " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char nameInitial = 'F';
        int myAge = 23;

        System.out.println("my age = " + myAge + " and my initial = " + nameInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3()
    {
        //la stampa va a capo e solo nella riga dopo viene scritto "Exercise 3:"
        System.out.println("\nExercise 3:");
        //viene dichiarata la variabile booleana hasEatenLunch, uguale a false
        boolean hasEatenLunch = false;
        //viene dichiarata la variabile double linchCost, uguale a 5.99
        double lunchCost = 5.99;
        //stampa la stringa "Lunch cost=5.99" (richiamato lunchCost)
        System.out.println("Lunch cost=" + lunchCost);
        //stampa la stringa "has Eaten lunch=false" (richiamato hasEatenLunch)
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
