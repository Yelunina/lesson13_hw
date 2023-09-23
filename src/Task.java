public class Task {
    public static void main(String[] args) {

        exchangeOfValuesTwoVariables(10, 20);
        exchangeOfValuesTwoVariables1(10, 20);


    }

    public static void exchangeOfValuesTwoVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables1(int a, int b) {

        a = a + b - (b = a);
        System.out.println("a= " + a + "\n" + "b= " + b);
    }
}
