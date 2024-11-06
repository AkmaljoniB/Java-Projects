package Kotlin.Task1

open class Employee(val name:String,val salary:Double){
    open fun displayinfo(){
        println("$name : $salary")
    }
}
class Manager(val department:String,name:String,salary: Double):Employee(name,salary) {
    override fun displayinfo(){
        println(" $department")
    }
}