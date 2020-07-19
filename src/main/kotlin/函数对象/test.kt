package 函数对象
/*
    登陆-> 1.加载数据
          2.保存用户信息
 */

fun login(id:Int){
    var id:Int=id
    var data:String = loadData(id)
    var info:String= savaInfo(id)

}

fun loadData(id:Int):String{
    println("加载数据中")
    return "加载数据成功+数据"
}

fun savaInfo(id:Int):String{
    println("保存用户信息")
    return "保存用户信息成功"
}

fun login1(id:Int,funParam:(Int)->String){
    var id:Int=id
    funParam(id).also { println(it) }
    //var data:String = loadData(id)
    //var info:String= savaInfo(id)

}
fun main(){
    //login(1)
    //定义一个函数
    /**var funA=::loadData
    funA(1).also { print(it) }
    */
    //匿名函数
    /**var funA1=fun (id:Int):String{
        println("加载数据中")
        return "加载数据成功+数据"
    }*/

    //lambda 表达式
    //如果有返回值，不能使用return 默认返回最后一行
    var funA3={
        id:Int->String
        println("加载数据中")
        "$id 加载数据成功+数据"
    }

    login1(1,funA3)

}