package basic

fun main(args : Array<String>) {
    //限制在函数返回
    println(parseInt("s")==null)
    //限制在变量
    val a: Int? = 0

}
//类型检测以及转换
//相比java的代码，当instanceof判断的对象类型之后 仍旧需要进行强转
fun typeDetect(any:Any):Int?{
    if (any is String && any.length>0){ //判断类型之后便可以直接当成该类型使用
        return any.length;
    }
    return null;
}

//如果这个函数能够返回null，那么则需要进行声明，也就使用?
fun parseInt(str:String):Int?{
    try {
        return Integer.parseInt(str)
    }catch (e:Exception){
        return null;
    }
}












