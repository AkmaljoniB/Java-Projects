package Kotlin.Taks3

val names= mutableMapOf(
    "Действуй" to 1,
    "Всё решает Мотивация" to 2,
    "Сказать Да" to 3,
    "Теория Везения" to 4,
    "Успех Богатство" to 5,
    "Kolin За час" to 6,
    "OOП в Java" to 7,
    "Android на Kotlin" to 8,
    "OOП в Kotlin для чайников" to 9,
    "GitHub с нуля до middle" to 10,
    "Виды спорта" to 11,
    "Haikyuu season 1" to 12,
    "Haikyuu season 2" to 13,
    "Bluelock season 2" to 14,
    "Solo leveling season 2" to 15
)
val autors=mapOf(
    "Jamol" to mutableListOf(1,5,8),
    "Umed" to mutableListOf(2,7,10),
    "Akmal" to mutableListOf(3,4,9),
    "Mahnoz" to mutableListOf(5),
    "Ronaldo" to mutableListOf(11),
    "Hinata" to mutableListOf(12,13),
    "Isagi" to mutableListOf(14),
    "Son Jin Wu" to mutableListOf(15)
)
val category= mapOf(
    1 to "Мотивация",
    2 to "Мотивация",
    3 to "Мотивация",
    4 to "Мотивация",
    5 to "Мотивация",
    6 to "Програмирование",
    7 to "Програмирование",
    8 to "Програмирование",
    9 to "Програмирование",
    10 to "Програмирование",
    11 to "Спорт",
    12 to "Манга",
    13 to "Манга",
    14 to "Манга",
    15 to "Манга"
)
val year= mapOf(
    1 to 2000,
    2 to 2003,
    3 to 2005,
    4 to 2008,
    5 to 2015,
    6 to 2020,
    7 to 2022,
    8 to 2022,
    9 to 2019,
    10 to 2019,
    11 to 2020,
    12 to 2008,
    13 to 2015,
    14 to 2020,
    15 to 2023
)

fun printMap(map:Map<String,Int>){
    for((key,_)in map)println(key)
}
fun printMap2(map:Map<String,MutableList<Int>>){
    for((key,_)in map) println(key)
}
fun printMap(map:Map<String,Int>,autor:String){
    for((key,value)in map)if(autors[autor]!!.contains(value))println(key)
}
fun search(id:Int){
    for((key,value)in autors){
        if(value.contains(id)){
            println(key)
            return
        }
    }
}