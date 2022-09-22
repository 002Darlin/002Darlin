package com.wzs02darling;
//如果cmd运行 找不到或无法加载主类
//只能java com.wzs02darling.MyClass
//而且目录也必须在对应的包
//类路径:代表Class Loader查找class文件要搜索的地方

public class MyClass {
    public static void main(String[] args) {
        System.out.println("I'm working");
        int result = MyClassFunc.add(1,2);
        System.out.println(result);
    }
}
