package OnlineShop

class MP3Player: Electronics {
    var color = ""
    constructor(regularInitialPrice:Double, manufact:String, c:String):super(regularInitialPrice, manufact){
        regularPrice = regularInitialPrice
        manufacturer = manufact
        color = c
    }

    override fun computeSalePrice(): Double {
        return regularPrice*0.9
    }
}