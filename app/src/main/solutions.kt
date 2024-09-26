fun main() {
    fun fizzBuzz(n: Int): Unit {
        // Write your code here

        for(i in 1..n){
            when{
                (i mod 5) == 0 && (i mod 3) == 0 -> println("FizzBuzz")
                (i mod 3) == 0 -> println("Fizz")
                (i mod 5) == 0 -> println("Buzz")
                else -> println(i)
            }
        }


    }
}