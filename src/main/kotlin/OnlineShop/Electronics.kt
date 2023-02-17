package OnlineShop

abstract class Electronics : Produt {
    var manufacturer = ""
    constructor(regularInitialPrice:Double, manufact:String):super(regularInitialPrice){
        regularPrice = regularInitialPrice
        manufacturer = manufact
    }
}