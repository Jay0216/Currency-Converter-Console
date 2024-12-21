//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("")
    println("")
    println("---------  Currency Converter App (LKR to FC / FC to LKR) --------------")


    print("Enter Primary Currency Type : ")
    val curreny_type = readln()

    print("Enter Secondary Currency Type : ")
    val convert_type = readln()

    print("Enter ${curreny_type} Value : ")
    val value = readln().toInt()

    println("${curreny_type} => ${convert_type}")

    val converter = Converter()

    converter.c_type = curreny_type.trim()
    converter.convert_type = convert_type.trim()
    converter.value = value

    // convert operation (facade pattern to simplify client process)
    converter.convert()



    //currency.convertCurrency()






}