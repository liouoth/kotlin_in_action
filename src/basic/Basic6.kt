package basic


fun main(args : Array<String>) {
    var list = listOf(1,2,3,4,4);
    //集合迭代
    //使用for之类的

    //判断集合中是否存在某个元素
    println(list.contains(1))
    //单个
    println(1 in list)
    //多个
    when{
        1 in list -> println("bingo!")
    }

    //lambda
    list.filter {i->i>0}
        .sortedBy {it}
        .forEach(::print) //存疑,也就是方法引用前缀
}












