package basic

fun main(args : Array<String>) {
    test_while()
}

//for只保留了foreach的形式
fun test_for(){
    //没有了java中的for，直接是foreach的语法，分别是通过索引下标、通过元素
    //kotlin 中也封装了相应的collections方法
    val list = listOf(1, 2, 3, 4)

    for (i in list) {
        println(i)
    }

    //通过索引下标
    for (i in list.indices){
        println(list[i])
    }
}

//while没什么特别的
fun test_while(){
    val list = listOf(1, 2, 3, 4)
    var index = 0;
    while (index<list.size){
        println(index)
        index++
    }
}

//有了when还需要switch吗？没有switch了
//when也可以作为表达式,如fun_when2
fun test_when(event:Any):String{
    return when(event){
        1->"one"
        2->"two"
        else ->"none"
    }
}

fun fun_when2(e:Any):String =
        when(e){
            1->"one"
            2->"two"
            else ->"none"
        }

//区间适用于规定的整数范围
fun fun_range(){
    //在if中使用
    if (1 in 1..2){
//        return true
    }
    //在循环中使用
    var i = 1
    while (i in 1..2){
        i++
    }

    //用于判读区间
    var index = 10;
    var list = listOf(1, 2, 3, 4)
    if (index in 0..list.size){
    }

    //用于数列迭代
    for (i in 0..10 step 2){
        println(i)
    }
}














