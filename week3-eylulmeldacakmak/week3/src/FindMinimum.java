public class FindMinimum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean num1_min = num1 < num2 && num1 < num3;
        boolean num2_min = num2 < num1 && num2 < num3;
        int min = num1_min ? num1 : num2_min ? num2 : num3;

        if (num1 < num2 && num1 < num3) {
            System.out.println("Minimum is:" + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Minimum is:" + num2);
        }
        else if (num3 < num1 && num3 < num2) {
            System.out.println("Minimum is:" + num3);
        }
    }
}
