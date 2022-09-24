import java.util.Date;

public class VariablesAndDataTypes {
    /*变量可以看做是一种数据容器 即不同的数据类型*/
    public static void main(String[] args) {
        ConstantAndVariable();
        UseVar();
    }

    public static final int MAX_NUMBER = 255;
    /*
    格式
    变量可接收的类型 变量名 = 初始值;
    谈谈内存地址
    汇编语言 可以直接指定地址获取内存单元 但是低效
    因为
    不同的计算机硬件，可以访问的物理内存数量是变化的
    不同的操作系统，甚至是同一操作系统的不同版本，对内存单元的存取可能都有着不同的要求
     所以通过变量名间接获取内存
     */

    /*
    变量赋值
    变量名 = 变量新值
    变量之间的相互渎职,本质上是内存单元间的值复制
    i 与 j 之间是完全独立的
     */

    /*
     表达式Expression 和 标识符identifier
     */
    //常量定义

    public static void ConstantAndVariable() {
        //变量定义
        int num = 100;
        //将变量num的值取出来，加1，再保存回变量num中
        num = num + 1;
        //变量和常量之间可以进行运算
        System.out.println(num + MAX_NUMBER);//356
    }
    /*
    JDK10新特性——隐式定义的局部变量
     */
    public static void UseVar() {

        //使用var定义局部变量，是JDK10引入的特性
        //变量的类型，由Java编译器依据其接收的值自动判断
        //在本例中，intValue的类型为int。
        var intValue = 100;
        //以下语句将intValue变量加一，相当于
        //intValue=intValue+1
        intValue++;
        int newValue = 101;
        //输出：true
        System.out.println(intValue == newValue);

        //var所定义的变量，其类型不受限制
        var info = "当前时间为：";
        var now = new Date();
        //var所定义的变量，其用法与普通变量没什么两样
        //当前时间为：Wed Sep 23 09:02:24 CST 2020
        System.out.println(info + now.toString());
        //以下两句调用JDK所提供之“反射“功能，提取特定变量的类型信息
        //java.lang.String
        System.out.println(info.getClass().getName());
        //java.util.Date
        System.out.println(now.getClass().getName());
    }
    /*
    对标识符的要求
    开头字母, _ 和 $
    不能数字开头 不能包含制表,空格,回车,换行符
    不能用关键字

    起名 做到望名知义

    包名: 小写 互联网域名反写 cn.edu.bit.cs
    类名: 用名词 采用驼峰形式拼写 首字母大写
    接口名: 与类名类似 最好能体现出接口的类的特性
    方法名: 小写字母打头 动宾结构 除第一个外首字母大写
    泛型参数: 大写的单字母, E -Element(泛式集合) K -Key V -Value S U V
    */

    /*
    原始数据类型 与 引用数据类型
    除int float等少数数据类型 其他都是引用类型
    int float称为原始数据类型
    8种
    boolean byte char short int long float double
    ps: 这八种数据类型全部都是小写字母开头 String是引用类型 而且首字母大写
     */
}
