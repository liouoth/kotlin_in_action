package basic

fun main(args : Array<String>) {
    //基础使用
    val a = 1
    println( "a is $a")

    //$ 就相当于调用 有点像shell中的命令,可以调用变量、还可以调用函数
    val b = "q is victim"
    println("${b.compareTo("a")}")
    println("${a==1}")
    println("${b +" "+ a}")

    //条件表达式没有什么不同
    if (a==1){

    }else if(a==2){

    }else{

    }

}










