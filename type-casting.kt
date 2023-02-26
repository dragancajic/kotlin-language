/* 10:32 AM Sunday, February 26, 2023


Computer science → Programming languages → Kotlin → Types and data structures → Data types
~ Type of the numeric expression ~

Type casting | Problem difficulty: Hard
https://hyperskill.org/repeat/step/9514

Select all invalid lines in the following snippet.
*/
fun main() {
	val d0 = 1.0
	val f0 = 1f
	val l0 = 30L

	val d: Double = 1.0 % 10f         // Line 1
	val f: Float = d0.toLong() + 1.0  // Line 2
	val l: Long = f0.toInt() + 4      // Line 3
	val n: Int = l0.toByte() + 2      // Line 4
}
/*
[dragancajic@fedora kotlin]$ kotlinc type-casting.kt
type-casting.kt:18:17: error: type mismatch: inferred type is Double but Float was expected
	val f: Float = d0.toLong() + 1.0  // Line 2
                ^
type-casting.kt:19:16: error: type mismatch: inferred type is Int but Long was expected
	val l: Long = f0.toInt() + 4      // Line 3
               ^
[dragancajic@fedora kotlin]$ clear

> Answer:

o 1
• 2 √
• 3 √
o 4

HINT by khtemur
https://hyperskill.org/profile/210461978
1. If either operand is of type Double, the result is Double.
2. Otherwise, if either operand is of type Float, the result is Float.
3. Otherwise, if either operand is of type Long, the result is Long.
4. Otherwise, the result is Int.
*/
