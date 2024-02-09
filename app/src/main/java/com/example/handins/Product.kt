package com.example.handins

open class Product(name:String,price:Double,quantity:Int) {
    open fun identifyProductCategory(){
        println("I am a Product")
    }
}

class Shoe(name: String,price: Double,quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a shoe")
    }
}
class Tshirt(name: String,price: Double,quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a T-shirt")
    }
}
class Book(name: String,price: Double,quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a Book")
    }
}