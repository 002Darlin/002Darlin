package UseMethod;

public class VariableArgumentsTest {
    //定义一个支持可变参数的方法，此方法是获取所有输入参数中的最大值
    //在数据类型后面加三个点，意味着这个方法能接收数目可变的参数
    public static double max(double... values) {
        double largest = Double.MIN_VALUE;
        //传入的参数被当成是一个数组，可以使用foreach进行迭代
        for (double v : values)
            if (v > largest) largest = v;
        return largest;
    }
    //main方法也可以改为“可变参数”
    public static void main(String... args) {
        //在四个传给max方法的实参数值中，最大的是300
        //输出：Max:300.0
        System.out.println("Max:" + max(1, 11, 300, 2, 3));
    }
}

