public class FindMaximum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        boolean condition = num1 > num2;
        int max = condition ? num1 : num2;
        System.out.println(max);
    }
}
