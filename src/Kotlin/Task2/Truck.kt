package Kotlin.Task2

class Truck(private var fuelLevel: Int):Vehicle{
    override fun start() {
        println("Truck is ready!")
    }
    override fun stop() {
        println("Truck isn't ready!")
    }
    override fun loadCargo(k:Int){
        println("Грузовик загружен грузом весом: $k кг.")
    }
    override fun checkFuel(): Boolean {
        return fuelLevel>20
    }
    fun unloadCargo(){
        println("Грузовик выгрузил груз.")
    }
}