/* 10:56 AM Sunday, February 26, 2023


Computer science → Programming languages → Kotlin → Control flow → Control structures
~ Repeating blocks ~

Repeat by value | Problem difficulty: Medium
https://hyperskill.org/repeat/step/20145

Write a program that reads a number and prints it the number of times corresponding to the value of the input number.
*/
// import java.util.*

fun main() {
    // val scanner = Scanner(System.`in`)
    // val n = scanner.readln().toInt();
    val n = readln().toInt()
    repeat(n) {
        print(n)
    }
    println()
}
/*
[dragancajic@fedora kotlin]$ kotlinc repeat-by-value.kt
[dragancajic@fedora kotlin]$ kotlin Repeat_by_valueKt.class 
2
22
[dragancajic@fedora kotlin]$ kotlin Repeat_by_valueKt.class 
3
333
[dragancajic@fedora kotlin]$ kotlin Repeat_by_valueKt.class 
5
55555
[dragancajic@fedora kotlin]$ kotlin Repeat_by_valueKt.class 
7
7777777
[dragancajic@fedora kotlin]$ clear
*/
