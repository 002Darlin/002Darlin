import exampleToLearnJAVABasicProgrammingSkills.*;

public class JAVABasicProgrammeSkills {
    public static void main(String[] args) {
        /*
        Java中的内存模型
        变量可看成是某内存单元(区域)的名字
        Java10 可以使用var关键字 编译器自动确定类型

        变量与内存
        变量都有 名字 数据类型 所占内存单元和一个值
        变量的读写 当新值被赋给变量时 旧值会被取代 仅从内存中读取数据不会破坏数据

        E.G. Addition.java
         */
        Addition.main(args);
        /*
        变量的作用域
        "同名变量的屏蔽原则"
        E.G. WhichIsUsed.java
         */
        WhichIsUsed.main(args);
        /*
        变量的使用准则
        用变量存储输入数据 变量名反映数据含义 变量在使用前保证有确切值
         */

        /*
        读取用户输入
        方法一:使用JOptionPane类的showInputDialog方法 Addition.java
        方法二:使用Scanner类(JDK 5.0以上) InputTest.java
         */
        InputTest.main(args);
        /*
        变量间的类型转换
        自动类型转换是安全的 强制类型转换可能会引起信息损失
        int-float long-double long-float有精度损失(所占位数和表示范围有关)

        定义变量时隐式指定数据类型
        如果使用var来定义变量,通过数值常量的后缀可判断数据类型
        比如5 5f 5d 5L

        也可以通过原始类型的包装类完成类型转换
        适用场景 同一个数据需要转换为多种类型 并且长期使用 (一般直接使用强制类型转换)

        将原始数据类型的名字首字母大写 得到对应的包装类型(是引用类型) 好多方法
         */
        DataTypeChange.main(args);
        /*
         关于double的近似
         TestDouble.java
         结论: 使用double类型的数值进行计算，其结果是近似的。
         (由于double类型的数值只有64bit 除去最高位表示正负符号的位，在最低位上一定会与实际数据存在误差)

         如何处理精度损失
         使用BIgDecimal类
         TestBigDecimal.java
         注意 在构建BigDecimal对象时应使用字符串而不是double数值
         (参数类型为
         double的构造方法的结果有一定的不可预知性
         String类型参的构造方法是完全可预知的
         当是形参为浮点数时，推荐先将浮点数转换为字符串类型然后放入构造函数中
         )
         */
        TestDouble.main(args);
        TestBigDecimal.main(args);
        /*
        字符串转化为数字的基本方法
        int number = Integer.parseInt(numberString);
        类Integer在包Java.lang, 封装了int类型的整数 是原始数据类型int的包装类
         */
        RandomStr.main(args);
        /*
        字符联接操作
        运算符+ (String和其他数据类型相加 就是新的String)
         */
        int X = 100;
        int Y = 200;
        System.out.println("X+Y="+X+Y);
        System.out.println(X+Y+"=X+Y");
    }
}