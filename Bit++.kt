fun main(){
    val n = readln().toInt()
    var x = 0
    for (i in 1..n){
        val input = readln()
        val plus = '+'
        val minus = '-'
        val count1 = input.count {it == plus}
        val count2 = input.count {it == minus}
        if (count1 == 2){
            x++
        }
        if (count2 == 2){
            x--
        }
    }
    print(x)
}