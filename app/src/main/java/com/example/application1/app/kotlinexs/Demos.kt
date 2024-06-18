package com.example.application1.app.kotlinexs

fun main() {
    println("".printVitNames("Students of vit"))
    println(  double(2))
    tempToday("mon",32)
    drive(mph=18,speed="slow")
    var a= "anubhav"


    val numberOfDogs:Int = 3
    val numberOfCats=2
    println("i have $numberOfDogs of dogs and $numberOfCats of cats")
}

fun printHello(name:String?) {
    println("Hi there!")
}

fun drive(speed:String = "fast", mph:Int): String {
    return "driving $speed"
}

fun tempToday(day:String, temp:Int)  {
    println("Today is  $day and it's $temp degrees")
}

fun double(x:Int) = x*2

fun String.printVitNames(names:String) {
    println(names)
}

