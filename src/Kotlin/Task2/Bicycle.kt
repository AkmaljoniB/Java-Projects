package Kotlin.Task2

class Bicycle:Vehicle{
    override fun start() {
        println("Bicycle is ready!")
    }
    override fun stop() {
        println("Bicycle isn't ready")
    }
    override fun loadCargo(k:Int){
        println("Велосипед загружен грузом весом: $k кг.")
    }
    override fun checkFuel():Boolean{
        println("Велосипед не требует топлива.")
        return true
    }
}