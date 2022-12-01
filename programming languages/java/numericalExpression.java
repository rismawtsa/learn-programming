public class numericalExpression {
    public static void main(String[] args) {
        int y = 5 / 2;
        System.out.println(y); // 2

        double a = 5 / 2;
        System.out.println(a); // 2.0
        // - why is not a 2.5? because of 5 and 2 is integer so the division operator
        // acts as a integer operator
        // to make the result to be 2.5, we can add point 0 of one of the operand (5.0
        // or 2.0) or cast one of the operand to double

        double b = 5.0 / 2;
        System.out.println(b); // 2.5
        double c = (double) 5 / 2; // cast int to double
        System.out.println(c); // 2.5
    }
}
