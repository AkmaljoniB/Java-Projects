package Kotlin.Task2

class Tractor(private var fuelLevel:Int):Vehicle{
    override fun start(){
        println("Tractor is ready!")
    }
    override fun stop() {
        println("Tractor isn't ready!")
    }
    override fun loadCargo(k:Int){
        println("Трактор загружен грузом весом: $k кг.")
    }

    override fun checkFuel(): Boolean {
        return fuelLevel>10
    }
    fun refue(fuelAmount:Int){
        fuelLevel+=fuelAmount
        println("Трактор заправлен на $fuelAmount литров. Текущий уровень топлива: $fuelLevel")
    }
    fun plowField(){
        if(checkFuel()){
            println("Трактор начинает вспашку поля.")
            fuelLevel-=10
        }else{
            println("Недостаточно топлива для вспашки. Заправьте трактор.")
        }
    }
}