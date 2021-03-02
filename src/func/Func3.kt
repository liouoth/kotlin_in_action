package func

import java.util.Arrays.asList

class Func3 {
}

//通过= 设置默认值
fun fun_test1(a:Int,b:Int=10){
}

//成员函数
open class Test_func1{
    open fun func(){}
}

class Test_func2 : Test_func1() {
//    override fun func(i:Int){}; 不允许给重写的函数添加默认函数
}

//以前js之类的，一般要求默认参数在最左侧，而kotlin可以通过具名参数解决
fun test_func1(i:Int=1,j:Int){}

fun main(){
//    test_func1(i=10,j=10)
//    test_func1(j=10) //这样i使用默认1
    //使用具名参数之后，可以不必考虑参数的顺序
//    test_func1(j=1,i=20)

    //当一个函数的最后一个参数是lambda函数时，可以使用具名参数传入，也可以在括号外传入
    test_func2(2){ println("123")} //一个参数的话，第二参数使用默认值，按照顺序覆盖
    test_func2(func = { println()}) //i j 都使用默认
    test_func2 { println() }

    //使用spread 通过*进行获取数组中的值
    foo(*arrayOf("a", "b", "c"))
    foo(*asList("a", "b", "c").toTypedArray())
    foo("a","b","c")
    //spread还可以在多种情境中使用，在asList中使用
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)
}

//使用()->Unit代表一个无返回的一个函数
fun test_func2(i:Int=1,j:Int=2,func:()->Unit){
    println("i=$i,j=$j")
}

//返回一个Int的一个函数，同样可以根据需求自定义
fun test_func3(i:Int=1,j:Int,func:()->Int){
}

//返回Unit的函数
//单表达式的函数，kotlin能够推断出返回类型

//可变参数
fun foo(vararg strings: String) {
}