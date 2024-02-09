package com.example.handins

open class Computer(val storageInGb:Int, val os:String, val year:Int) {
    open fun turnOn(){
        println("Hello, im running on ${this.os}")
    }

    open fun turnOf (){
        println("Shutting down")
    }
}

class Laptop (storageInGb: Int,os: String,year: Int, val price:Double): Computer(storageInGb, os, year) {
    fun screenShot (){
        println("Took screenshot")
    }
}

class SmartPhone (storageInGb: Int,os: String,year: Int, var battery:Int): Computer(storageInGb, os, year){
    fun lowbattery(){
        if (this.battery < 10) {
            println("Low battery")
        }
    }
}

fun main() {
    val Laptop = Laptop(1000,"Windows",2021,8999.99)
    val phone = SmartPhone(256,"Android", 2023,99)

}