public class ProblemSet {
    // Question 1.
    // B

    // Question 2.
    public static boolean isPrime(int x) {
        return true;
    }

    // Question 3.
    // A

    // Question 4.
    public static double absoluteValue(double x){
        if (x < 0){
            return -x;
        } else {
            return x;
        }
    }

    // Question 5.
    public static double calculateTip(double totalCost){
        double tip = totalCost * 0.15;
        return tip;
    }

    // Question 6.
    public static String nametagText(String name){
        String output = "Hello, my name is " + name;
        return output;
    }

    // Question 7.

    /**
     * function fahrenheitToCelsius takes temperature in F and returns value in C.
     * @param tempInF
     * @return tempInC
     */

    public static double fahrenheitToCelsius(double tempInF){
        return (tempInF - 32) * 5/9;

    }

    /**
     * function printTemperature takes temperature in F and then prints temperature both in F and C
     * @param tempInF
     */

    public static void printTemperature(double tempInF){
        System.out.println("F: "+tempInF);
        System.out.println("C: "+fahrenheitToCelsius(tempInF));
    }

    // Question 8.

    /**
     * Returns a random int (simulating a dice roll).
     * @param - sides (type the number of sides of dice).
     * @return - random int in range 1 to sides.
     */
    public static int rollTheDice(int sides){
        int letsRoll = (int) (Math.random() * sides) + 1;
        // generates random int + casting value to int
        return letsRoll;
    }

    public static int monopolyRoll(){
        int x = rollTheDice(6);
        int y = rollTheDice(6);
        if (x != y){
            System.out.println("Not equal!");
            return x + y;
        } else {
            System.out.println("Equal!");
            int z = rollTheDice(6);
            int u = rollTheDice(6);
            return x+y+z+u;
        }
    }

    public static void main(String[] args) {
    printTemperature(30);
    System.out.println(monopolyRoll());

    }
}
