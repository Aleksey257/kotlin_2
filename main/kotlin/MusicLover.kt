fun main(){
    val previousPurchase = 11000
    val discount = 100
    val discountStart1000 = 1001
    val discountStart10000 = 10001
    val newPurchase = 17845
    var totalPrice = 0
    val musicLover = false

    if (previousPurchase > discountStart10000) {
        totalPrice = (newPurchase / 100) * 95
        println(totalPrice)
    }
    else if  (previousPurchase > discountStart1000){
            totalPrice = newPurchase - discount
    }
    else {
        totalPrice = newPurchase
    }
    if (musicLover){
        totalPrice = (totalPrice / 100) * 99
    }
    println("Total cost =   $totalPrice")
}