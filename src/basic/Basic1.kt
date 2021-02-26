package basic

class A {

}
//主函数，程序入口。易错点：和java不一样，main函数在class外
fun main(args : Array<String>) {
    println(def_fun(1,2))
    println(def_fun1(1,2))
    println(def_fun2(1,2))
    println(def_fun4(1,2))

    //打印 kotlin.Unit,这个玩意儿是什么，是作为一个返回值吗
    println(kotlin.Unit)
}
//自定义函数
fun def_fun(a:Int,b:Int):Int{
    return a+b
}

//省略返回，返回的都是 kotlin.Unit
//换句话说，Unit可以省略不写，返回的也是Unit
fun def_fun1(a:Int,b: Int){}
fun def_fun2(a:Int,b: Int):Unit{
}

//返回是Unit，然后
//fun def_fun3(a:Int,b: Int):Unit{
//    return a+b;
//}

//将表达式作为函数体，返回值类型自动推断的函数
fun def_fun3(a:Int,b:Int) = a+b

//因为if可以作为表达式，那么同样的可以用在这里
fun def_fun4(a:Int,b:Int) = if (a>0) a else b









