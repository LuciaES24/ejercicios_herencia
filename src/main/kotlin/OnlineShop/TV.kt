package OnlineShop

class TV : Electronics {
    var size = 0
    constructor(regularInitialPrice:Double, manufact:String, s:Int):super(regularInitialPrice, manufact){
        regularPrice = regularInitialPrice
        manufacturer = manufact
        size = s
    }

    override fun computeSalePrice(): Double {
        return regularPrice*0.8
    }
}