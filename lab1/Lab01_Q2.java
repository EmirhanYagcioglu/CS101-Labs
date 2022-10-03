public class Lab01_Q2 {
    public static void main(String[] args) {
        double res1, res2, res3;    //create variables for the results        

        double num1 = 32.2 - 17.0 / 22.0;                           //numerator of the first expression 
        double denum1 = ( 1.5 - 7.3 ) * ( 4.3 + 24.0 );           //denumerator of the first expression

        double num2 = 73.5 * 16.4 - Math.pow(3, 2) * 81.0;   //numerator of the second expression 
        double denum2 = Math.pow(2, 5) + 34.0;               //denumerator of the second expression

        double power3 = -2.0 / 6.0;
        double base3 = 2.4 - 0.4;
        
        res1 = num1 / denum1;
        res2 = num2 / denum2;
        res3 = Math.pow(base3, power3);

        System.out.println( "Result of expression 1 is: " + res1 );
        System.out.println( "Result of expression 2 is: " + res2 );
        System.out.println( "Result of expression 3 is: " + res3 );
    }
}
