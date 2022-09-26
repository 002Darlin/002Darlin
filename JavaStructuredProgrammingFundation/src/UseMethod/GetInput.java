package UseMethod;

import java.util.Scanner;

public class GetInput {

    public static void main(String[] args) {

        //addTwoNumber();
        //addTwoNumberUseMethod();
    }

    private static void addTwoNumber(){

        var sc = new Scanner(System.in);

        System.out.print("输入第一个数: ");
        double d1 = sc.nextDouble();

        System.out.print("输入第二个数: ");
        double d2 = sc.nextDouble();

        double result = d1 / d2;
        System.out.println("结果为 " + result);
    }

    private static void addTwoNumberUseMethod() {

        //调用getInput()方法读取用户输入
        double d1 = getInput( "输入第一个数: ");
        double d2 = getInput("输入第二个数: ");

        double result = d1 / d2;

        System.out.println("结果为 " + result);
    }
    //将读取用户输入的功能抽取为单独的函数
    private static double getInput(String prompt) {
        var sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }


}

