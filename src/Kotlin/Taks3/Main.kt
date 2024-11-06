package Kotlin.Taks3

fun main(){
    println("Привет!")
    var a=0
    while(true){
        if(a!=1)println("Показать список книг напишите 1")
        if(a!=2)println("Показать список авторов напишите 2")
        println("Поиск по имени напишите 3")
        println("Поиск по автору напишите 4")
        println("Поиск по году напишите 5")
        println("Поиск по теме напишите 6")
        a=readln().toInt()
        if(a==1)printMap(names)
        else if(a==2)printMap2(autors)
        else if(a==3){
            println("Напишите имя книги")
            val name=readln()
            if(names.containsKey(name)){
                println("Да у нас есть $name")
                println("Если вы хотите забрать напишите 1")
                println("Если вы хотите попасть в меня напишите 2")
                if(readln().toInt()==1){
                    val id=names[name]
                    println("Название книги: $name")
                    println("Автор книги: ")
                    if(id!= null)search(id)
                    println("Год выпуска книги: ${year[id]}")
                    println("Категория книги: ${category[id]}")
                    println("Теперь это книга ваша! Хорошего вам чтения")
                    names.remove(name)
                }
            }else println("Простите но у нас нет такой книги")
        }else if(a==4){
            println("Напишите автора книги")
            val autor=readln()
            if(autors.containsKey(autor)){
                println("Вот книги $autor:")
                printMap(names,autor)
            }else println("Простите но у нас нет такого автора")
        }
    }
}