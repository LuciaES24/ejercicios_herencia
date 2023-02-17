package OnlineShop

fun main(){
    var compra = mutableListOf<Produt>()

    var television = TV(1000.00,"Samsung",30)
    compra.add(television)
    var television2 = TV(2000.00,"Sony",50)
    compra.add(television2)
    var mp3 = MP3Player(250.50,"Apple","blue")
    compra.add(mp3)
    var book1 = Book(34.89,"Sun press",1992)
    compra.add(book1)
    var book2 = Book(15.75,"Korea press",1986)
    compra.add(book2)

    var totalRegularPrice = 0.0
    var totalSalePrice = 0.0


    for (i in compra){
        println("Información del producto")
        println("Producto: $i")
        totalRegularPrice += i.regularPrice
        totalSalePrice += i.computeSalePrice()
    }

    println("El precio total regular es $totalRegularPrice")
    println()
    println("El precio total es $totalSalePrice")


}