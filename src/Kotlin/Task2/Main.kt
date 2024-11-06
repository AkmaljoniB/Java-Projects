package Kotlin.Task2

fun main(){
    val tractor=Tractor(100)
    tractor.start()
    tractor.loadCargo(50)
    tractor.plowField()
    tractor.stop()

    val truck=Truck(80)
    truck.start()
    truck.loadCargo(40)
    truck.unloadCargo()
    truck.stop()

    val bicycle=Bicycle()
    bicycle.start()
    bicycle.loadCargo(10)
    bicycle.checkFuel()
    bicycle.stop()
}