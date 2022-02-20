fun main () {
    printName("Esther")
    var result = getRemainder(5,2)
    println(result)
    var sum = getSum(1,2,3,4)
    println(sum)
    printInterestingFact("baking")

}

fun printName(name: String){
    println("Hello" + " " + name)
}
fun getRemainder(num1:Int, num2:Int):Int{
    var modulus= num1 % num2
    return modulus
}
fun getSum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum= a+b+c+d
    return sum
}
fun printInterestingFact(fact:String){
    println("I love" + " " + fact)
}