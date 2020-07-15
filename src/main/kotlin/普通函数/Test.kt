package 普通函数
fun show(project:String):String{
    return "天才"
}
fun buy(project: String):Unit{

}

//fun add(a:Int,b:Int):Int{
//    return a+b
//}
fun add(a:Int ,b:Int )=a+b


fun showView(){
    fun loadData()="图片"

    fun showList(){
        loadData().also { println("正在下载：$it") }
    }

    showList()
}

fun main(){
    showView()
}