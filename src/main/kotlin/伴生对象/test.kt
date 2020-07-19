package 伴生对象

fun main(){
    HttpRequest.loadData()
    ImageUtil.loadImage()
}

//静态类：里面都是静态属性 静态方法 (工具类都是静态的

object ImageUtil{
    fun loadImage(){

    }
}


class HttpRequest(){

    companion object{
        var url:String="www.baidu.com"
        fun loadData(){
            println("Loading data from $url")
        }
    }
}