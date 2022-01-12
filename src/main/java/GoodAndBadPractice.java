public class GoodAndBadPractice {

    // Good Practice
    public static int sum(int a,int b){
    return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }



    /*
    =================================================================
     */



    // Bad Practice
    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }

    public static int sumThreeNumbers(int a, int b, int c){
        return a + b + c;
    }

    public static int sumFourNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }





}
