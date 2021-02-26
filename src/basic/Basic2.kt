package basic

//全局变量,全局变量的修饰符 同样可以是var 或者是 val
var x = 10;

fun main(args : Array<String>) {
    //变量定义
    val a : Int = 1

    //通过值进行推断变量类型
    val b = 1
    //b = "" 不可以 实际上kotlin应该只是脚本 并不能改变java是强类型语言

    //val c  不可以不初始化 类型未定的变量
    val c : Int
    c=10

    //var与val的区别,val的变量不可以重新赋值，这些都是在编译前
    var d = 10
    d = 20
    val e = 20
    //e=10


    //只能够不初始化 类型确定的变量 那么是否有可能会有变量范围的问题
    //这个问题估计估计会在kotlin编译成java代码的时候报错
    //val d:Byte
    //d=100000

    println(x)

    //var val可以用来替代final修饰符，那么static等变量该如何保证
    /**
     * 可以循环注释虽然也没啥卵用
     * //
     * /*
     *
     * */
     */
}










