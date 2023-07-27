import org.w3c.dom.ranges.Range
import java.awt.font.NumericShaper
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var a = arrayOf(10, 20, 30, 40)
    println("Array-1 by using arrayof() method : "+ Arrays.deepToString(a))

    var a2 = IntArray(size = 3)
    a2[0] = 10
    a2[1] = 20
    a2[2] = 30
    print("Array-2 by using IntArray() method : ")
    for (i in a2) {
        print(" "+i)
    }
    println("")

    var a3 = intArrayOf(1,2,3,4,5)
    print("Array-3 by using intArrayOf() method : ")
    for (j in a3) {
        print(" "+j)
    }
    println("")

    var a4 = Array<Int>(size = 5){0}
    println("Array-4 by using Array<>() : "+Arrays.deepToString(a4))

    val a5 = Array<Int>(size = 5) {index -> index * 2}
    print("Array-5 by using Array<>() and lambda function : ")
    for (i in a5) {
        print(" "+i)
    }
    println("")

    var a6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("2D Array-6 by using arrayOf() and intArrayOf() : "+Arrays.deepToString(a6))

    var b = IntArray(size = 5)
    println("Please enter Array values : ")
    for (i in 0 until 5) {
        print("a[$i] : ")
        var input = readLine()!!.toInt()
        b[i] = input
    }

    println("Entered Array : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("**********With Built-in Function**********")
    b.sort()
    println("After Sorting by built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("*********Without built-in function**********")
    bubbleSort(b)
    println("After Sorting without built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")
}

fun bubbleSort(b: IntArray) {
    var n = b.size
    for (i in 0 until n-1) {
        for (j in 0 until n-i-1) {
            if (b[j] > b[j+1]) {
                var temp = b[j]
                b[j] = b[j+1]
                b[j+1] = temp
            }
        }
    }
}
