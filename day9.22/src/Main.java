import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int value = 100;
        Integer obj = value;//装箱
        int result = obj*2;//拆箱

        //转到定义 -128 ~ 127 缓冲区
        Integer i = 100;
        Integer j = 100;
        System.out.println(i==j);//true

        Integer _i = 1000;
        Integer _j = 1000;
        System.out.println(_i==_j);//false

        //包(package)名是域名反写com.example.www
        //JOptionPane

        //跨模块的引用

        //外部引用
        //jar包的添加使用

        //字符串
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true 说明只保留一份 节省内存
        System.out.println(s1.equals(s2));//true
        String s3 = new String("abc");
        System.out.println(s1 == s3);//false
        System.out.println(s1.equals(s3));//true
        String s4 = "a"+"bc";
        System.out.println(s1 == s4);//true 判等 编译器的优化
        System.out.println(s1.equals(s4));//true

        s1 += "d";//本身只读 只初始化一次 修改是复制后新操作
        System.out.println(s1);//实质是新开辟内存

        /*String str = new String();
        for(int i=1;i<100;i++){
            str = str + i+",";
        }极差*/

        StringBuilder sb=new StringBuilder(2048) ;
        for(int k=1;k<100;k++){
            sb.append(k);
            sb.append(",");
        }
        System.out.println(sb.toString());
}

static class Point{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point move(int step) {
        return new Point(x + step, y + step);
    }

    //函数式编程风格 听不懂啦!!!
    //https://mvnrepository.com
}
}