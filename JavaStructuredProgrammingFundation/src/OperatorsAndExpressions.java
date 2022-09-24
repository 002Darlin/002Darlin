public class OperatorsAndExpressions {
    public static void main(String[] args) {
        Expression();
        UseOperator();
    }
    /*
    Java算术运算符
    基本与C一致 + - * / % Math.pow
    算术运算的优先级
    复合赋值运算符
    += -= *= /= %=
    自增自减运算符
    i++ i--
    逻辑关系运算符
    == != > < >= <= && || !
    位运算符
    & | ^ ~ << >>(二进制数表示)
    运算符的结合性
    x = y = z 相当于 x = (y = z)
     */
    public static void Expression() {

        int a = 100;
        int b = 10;
        //表达式肯定有一个值，这个值可以被另一个变量所接收
        int result = a / b - 5;
        System.out.println(result); //5
        //可以把表达式当成一个值，传给另外一个函数作为参数
        System.out.println(++a); //101

        CaculateRoot();
    }

    //计算一元二次方程的根
    private static void CaculateRoot() {
        double a = 5;
        double b = -4;
        double c = -1;
        //依据求根公式，开始构建表达式
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("此方程无解");
            return;
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("x1=" + x1); //x1=1.0
        System.out.println("x2=" + x2); //x2=-0.2
    }

    public static void UseOperator() {

        int a = 1, b = 2, c = 3;
        //计算平均值，应该采用浮点数除法，
        //否则，分子分母都是整数，就变成整除了
        double average = (a + b + c) / (double) 3;
        System.out.println(average); //2.0

        System.out.println();

        //复合赋值运算符示例（注意前一句执行的结果会影响到后一句）
        System.out.println(a += 1);  //2
        System.out.println(a -= 1);  //1
        System.out.println(a *= 2);  //2
        System.out.println(a /= b);  //1
        System.out.println(b % 3);   //2

        System.out.println();

        int value = 1;
        value++; //等价于value += 1;
        System.out.println(value);  //2

        value = 1;
        value--; //等价于value -= 1;
        System.out.println(value); //0

        System.out.println();

        //逻辑关系运算符
        int m = 1, n = 2;
        System.out.println(m == n); //false
        System.out.println(m != n); //true
        System.out.println(m > n);  //false
        System.out.println(m > n && m < 100); //false
        System.out.println(m > n || m < 100); //true
        System.out.println(!(m > n));  //true

        System.out.println();

        //位操作运算符
        System.out.println(1 & 0); //0
        System.out.println(1 | 0);   //1
        System.out.println(1 ^ 0); //1
        System.out.println(~0);    //-1
        System.out.println(1 << 2);  //4

        System.out.println();

        int x, y, z = 3;
        //实际开发中，别写这种奇葩的代码！
        System.out.println(x = y = z); //3
    }
}
