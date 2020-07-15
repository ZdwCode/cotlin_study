package 数据类

import javax.jws.soap.SOAPBinding

//不需要再重写set，get方法
data class User(var name:String,var passwoed:String,var id:Int){

}

fun  main(){
    User("张三","123456",50).also { print(it) }
}