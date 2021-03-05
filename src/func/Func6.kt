package func

import kotlin.reflect.KFunction1

fun main(){
    //funcParam(::funcRef1)
    //funcParam2(::funcRef2)
    //funcParam3(::funcRef3,"加油","奥利给")
    funcParam2(Foo()::func) //类的成员方法
}

//函数引用,func_ref1 ()->String
fun funcRef1():String{
    println("ref1 run")
    return ""
}

fun funcParam(func:()->String){
    func()
}

//函数引用，无返回
fun funcRef2(){
    println("ref2 run")
}

fun funcParam2(func:()->Unit){
    func()
}

//函数引用带参数，无返回
fun funcRef3(p1:String,p2:String){
    println("p1=$p1,p2=$p2")
}

fun funcParam3(func:(String,String)->Unit,p1:String,p2:String){
    func(p1,p2)
}

//receiver 写法
class Foo{
    fun func(){}
}