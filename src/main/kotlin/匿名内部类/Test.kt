package 匿名内部类

interface onTouchListener{
    fun onTouchEvent(event:String)
}

fun didTouch(listener:onTouchListener){
    listener.onTouchEvent("点击事件")
}
class MyListenser:onTouchListener{
    override fun onTouchEvent(event: String) {
        println("实现了：$event")
    }

}
fun main(){
    //didTouch(MyListenser())

   // MyListenser().also { didTouch(it) }

    //MyListenser().apply { didTouch(this) }

    didTouch(object :onTouchListener{
        override fun onTouchEvent(event: String) {
            print("实现了：$event")
        }
    })
}