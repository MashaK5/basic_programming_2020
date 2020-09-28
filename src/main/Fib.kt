package me.maria

/**
 * F_0 = 0
 * F_1 = 1
 * F_n = F_n-1 + F_n-2
 */

fun fibonacci(n : Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    var result = 0
    if (n > 1) {
        result += fibonacci(n - 1) + fibonacci(n - 2)
    }
    return result
}

fun main(args: Array<String>) {
    for (arg in args) {
        val isInt: Boolean = arg.all{
            it.isDigit()
        }
        if (isInt) {
            val result = fibonacci(arg.toInt())
            println("$result")
        }
        else {
            println("It was not Int!")
        }

    }
}