import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ConstantsAndValues {
    public static void main(String[] args) {
        Java7();
        NumberFormatDemo();
        CustomFormat();
    }
    /*Java语言规范
    https://docs.oracle.com/javase/specs/
    */

    /*public 允许自由访问 & private 只在本类中使用
    static 可通过类型名直接访问
    final 不可改 常用于声明全局常量
    int 数据类型
    MAX_NUMBER 常量名称 习惯大写
     =
    255 值
    ps:在类和接口中都可以定义常量
     */

    /*
    Java常用数据类型
    整型: byte short int long
    浮点型: float double 科学计数法
    布尔型: true false
    字符型: 'a' 'A'
    字符串: "Hello, Java!"

    ps: Java7特性允许使用下划线分割数位
    1_000_000
     */
    public static void Java7() {
        int number1 = 1_000_000;
        int number2 = 1000000;
        //number1和number2两个数是相等的
        System.out.println(number1==number2);//true
    }

    //数字的格式化 NumberFormat类
    public static void NumberFormatDemo() {
        //将要被格式化的数字
        double doubleValue = 10_000_000.53;

        //按节显示数字
        NumberFormat numF = NumberFormat.getNumberInstance();
        //Number: 10,000,000.53
        System.out.println("Number: " + numF.format(doubleValue));

        //将浮点数四舍五入为整数
        NumberFormat intF = NumberFormat.getIntegerInstance();
        //Number: 10,000,001
        System.out.println("Number: " + intF.format(doubleValue));

        //关闭“按节显示功能”，显示“原始形式”的数值
        intF.setGroupingUsed(false);
        //Number: 10000001
        System.out.println("Number: " + intF.format(doubleValue));

        //不同的国家，会有不同的文化，通常会使用不同的方式，显示普通数字和金额数字
        //cn代表咱们中国
        Locale locale = new Locale("zh", "CN");
        NumberFormat localeFormatter = NumberFormat.getNumberInstance(locale);
        //按照中国惯例显示普通数字
        //Number: 10,000,000.53
        System.out.println("Number: " + localeFormatter.format(doubleValue));
        //按照人民币格式显示金额
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        //¥10,000,000.53
        System.out.println(currencyFormatter.format(doubleValue));
    }

    //数字的格式化-自定义格式
    public static void CustomFormat() {

        double pi = 3.1415927;//pi
        // 取一位整数
        System.out.println(new DecimalFormat("0").format(pi));// 3
        // 取一位整数和两位小数
        System.out.println(new DecimalFormat("0.00").format(pi));// 3.14
        // 取两位整数和三位小数，整数不足部分以0填补。
        System.out.println(new DecimalFormat("00.000").format(pi));// 03.142
        // 取所有整数部分
        System.out.println(new DecimalFormat("#").format(pi));// 3
        // 以百分比方式计数，并取两位小数
        System.out.println(new DecimalFormat("#.##%").format(pi));// 314.16%

        long c = 299792458;
        // 显示为科学计数法，并取五位小数
        System.out.println(new DecimalFormat("#.#####E0").format(c));// 2.99792E8
        // 显示为两位整数的科学计数法，并取四位小数
        System.out.println(new DecimalFormat("00.####E0").format(c));// 29.9792E7
        // 每三位以逗号进行分隔。
        System.out.println(new DecimalFormat(",###").format(c));// 299,792,458

        // 将格式嵌入文本
        System.out.println(new DecimalFormat("光速大小为每秒,###米。").format(c));

        //自定义转换格式显示金额
        NumberFormat df = new DecimalFormat("人民币：00.00元");
        //人民币：9315.60元
        System.out.println(df.format(9315.6));
        //人民币：01.00元
        System.out.println(df.format(1));
    }

    /*
    可用的数字格式占用符
    0 # . - , E % ?
     */
}
