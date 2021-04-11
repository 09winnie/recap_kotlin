import java.util.*
fun main() {
    buddies()
    var student=Admission("Jackie Samba",7104,"Tamar01","Amber",40000.toFloat(),15000)
    println(student.name)
    println(student.pass)
    println(student.fees)

    var user=User("Winnie Grace","winky","winnie@gmail.com",9101997)
    user.intro("Facebook")
    user.logout("Facebook")
    user.mail
    user.username
}
fun buddies(){
    var names=arrayOf("Don","Milly","Dante","Mickey","Kinjo","Jackie","Wincate")
    println("I miss hanging out with my friends")
    println(names[2])
    println(names.size)
    println(names.count())
    names.set(4,"Nelson")
    println(Arrays.toString(names))
    println(names.get(4))
    println(names.indexOf("Nelson"))
}
data class Admission(val name:String,val num:Int,val pass:String,val stream:String,val fees:Float,var balance:Int)

class User(var name:String,val username:String,val mail:String,val pass:Int,){
    fun intro(site:String){
        println("Hello $name.Welcome to $site.We are happy to have you here.Enjoy!!")
    }
    fun logout(site:String){
        println("Hi $username ,You are now leaving $site.Like and subscribe to our updates if you loved it.Chao!!git")
    }
}

