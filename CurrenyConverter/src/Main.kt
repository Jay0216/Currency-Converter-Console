//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("---------  Currency Converter App --------------")


    print("Enter Currency Type You Want : ")
    val curreny_type = readln()

    val currency = Currency()

    currency.c_type = curreny_type.trim()

    currency.convertCurrency()






}