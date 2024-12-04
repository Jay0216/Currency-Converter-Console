//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("---------  Currency Converter App --------------")


    print("Enter Primary Currency Type : ")
    val curreny_type = readln()

    print("Enter Secondary Currency Type : ")
    val convert_type = readln()

    print("Enter ${curreny_type} Value : ")
    val value = readln().toInt()

    println("${curreny_type} => ${convert_type}")

    val currency = Currency()

    currency.c_type = curreny_type.trim()
    currency.convert_type = convert_type.trim()
    currency.value = value

    currency.convertCurrency()






}