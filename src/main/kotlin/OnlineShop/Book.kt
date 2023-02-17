package OnlineShop

class Book : Produt {
    var publisher = ""
    var yearPublished = 0
    constructor(regularInitialPrice:Double, publi : String, year:Int):super(regularInitialPrice){
        regularPrice = regularInitialPrice
        publisher = publi
        yearPublished = year
    }

    override fun computeSalePrice(): Double {
        return regularPrice*0.5
    }
}