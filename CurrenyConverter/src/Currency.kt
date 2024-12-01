class Currency{


    var c_type: String = ""


    //need a map datastructure for store key and value pair
    private val _currency_list: ArrayList<Any> = arrayListOf("usd", "lkr", "eur")






    fun convertCurrency(){


        checkingInputs()
    }

    fun checkingInputs(){
        print("checking input currency")

        if(_currency_list.contains(c_type)) {
            print("the entered currency founded")

            fetchingRates()
        }else{
            print("the entered currency not founded")

        }
    }


    fun fetchingRates(){
        print("fetching rates")


    }

    fun saveHistory(){
        print("saving history")
    }

    fun convertionHistory(){
        print("fetching history")
    }



}