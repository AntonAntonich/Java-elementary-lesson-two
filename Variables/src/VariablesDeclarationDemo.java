public class VariablesDeclarationDemo {
    public static void main(String[] args) {
        // declaration
        int a;
        // initialization
        a = 5;

        int numberOne = 10;
        int numberTwo = 2;

        int numberResult;
        numberResult = numberOne + numberTwo;
        System.out.println("result is: " + numberResult);

        numberResult = numberOne - numberTwo;
        System.out.println("result is: " + numberResult);

        numberResult = numberOne * numberTwo;
        System.out.println("result is: " + numberResult);

        numberResult = numberOne / numberTwo;
        System.out.println("result is: " + numberResult);

        numberOne = 11;
        numberResult = numberOne % numberTwo;
        System.out.println("result is: " + numberResult);

        // 11 - 100
        // 2 - x

        double percentValue = numberOne * 100 / (double) numberTwo;
        System.out.println("result is: " + percentValue);


        int t = 10;
        // incrementation - raise on 1
        // decr

        t++;
        t--;
        t += 1;
        // t = t + 1;
        t += 2;
        t *= 10;


    }
}
