import ProgramControlFlow.*;

public class StatementAndControlStructure {
    public static void main(String[] args) {
        /*Java中的语句
        Java程序由语句构成,分号结尾
        除了字符串内部 语句之间的缩进或换行不影响编译运行
         */
        /*语句块与变量作用域
        {语句块}生存周期只在本语句块
         */
        StatementBlock.main(args);
        /*-----------------------*/
        /*程序语句执行的三种方式
         顺序  分支(条件) 循环*/
        //条件语句  (返回bool值的表达式)
        IfStatement.main(args);
        /*
        条件的组合 || && !
        嵌套else
        "?:"表达式
        多分支语句:switch
         */
        SwitchStatement.main(args);
        /*switch表达式
        JDK14特性 整个结构被当为表达式 一定有返回值 必须有default分支
        ->
         */
        /*循环结构
        do/while
        while
        for
        死循环+break
        continue跳过本次循环
         */
        /*-------------*/
        //调试功能 断点

        //在线查看Unicode字符集 https://unicode-table.com/
    }
}
