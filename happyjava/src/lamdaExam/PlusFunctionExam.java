package lamdaExam;

@FunctionalInterface
interface PlusFunction {
    int plus(int a, int b);
}

@FunctionalInterface
interface CalFunction {
    int cal(int a, int b);
}

public class PlusFunctionExam {
    public static void main(String[] args) {


        CalFunction add = (a, b) -> a + b;
        CalFunction sub = (a, b) -> a - b;
        CalFunction mul = (a, b) -> a * b;
        CalFunction div = (a, b) -> a / b;

        System.out.println(add.cal(10, 20));
        System.out.println(sub.cal(10, 20));
        System.out.println(mul.cal(10, 20));
        System.out.println(div.cal(10, 20));

    }
}

