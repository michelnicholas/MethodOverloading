public class Main {

    public static void main(String[] args) {

        // First method 2 parameters
        int newScore = calculateScore("Mitch",500);
        System.out.println("New score is " + newScore);

        // Second method 1 parameters
        calculateScore(75);
        // Third Method no parameters
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,-10);
        if (centimeters < 0.0 ){
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(156);
    }



    // Method Overloading same method name with different parameters
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName +  " scored " + score +  " points");
        return score * 1000;
    }

    // Method Overloading calculate score used with one parameter
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score +  " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    /*
    create a method called calcFeetAndInchesToCentimeters
    It needs to have two parameters
    feet is the first parameter, inches is the 2nd parameter

    You should validate the first parameter feet is >= 0
    You should validate that the 2n parameter inches is >= 0 and <=12
    return -1 from the method if either of the above is not true

    If the parameters are valid, then calculate how many centimetres
    comprise the feet and inches passed to this method and return that value.

    Create a 2nd method of the same name but with only one parameter
    inches is the parameter
    validate that its >=0
    return -1 if it is not true
    but if its valid, then calculate how many feet are in the inches
    and then here is the tricky part
    call the other overloaded method passing the correct feet and inches
    calculated so that it can calculate correctly

    hint use double for your number datypes is probably a good idea
    1inch = 2.54cm and one foot = 12 inches
    use the link i give you to confirm your code is calculating correctly.
    calling another overloaded method just requires you to use the right number of parameters
     */


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0 )|| ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

     double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " cm" );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
