package com.example.application1.app.kotlinegs

import kotlin.math.sqrt

var lamda: (Int) -> Int = { a -> a*a }

fun main() {
    var someLambda : (Int,Int) -> Int = {a:Int, b:Int -> a+b}
    var someLambda2 : (Int,Int) -> Int = ::add
    println(someLambda2(40,50))
    var lamda1:(Int,Int,String) -> Int = {a,b,c ->
        println("message is"+c)
        a*b
    }
}

fun operation(): (Int) -> Int {
    return ::square
}

fun add(a:Int,b:Int):Int{
    return a+b
}

fun square(x: Int)= x*x

/*fun main() {
    val func= operation()
    println(func(2))
}*/