package UseMethod;

public class SquareInt {
    public static void main(String[] args) {
        int result;
        for (int x = 1; x <= 10; x++) {
            //调用自定义函数求平方数
            result = square(x);
            //Math库中也提供了求平方数的方法
            //result = (int) Math.pow(x, 2);
            System.out.println(x + "的平方数是：" + result);
        }
    }

    // 自定义求平方数的静态方法
    public static int square(int y) {
        return y * y;
    }
}
