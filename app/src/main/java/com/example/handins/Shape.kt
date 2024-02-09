package com.example.handins

import kotlin.math.PI
import kotlin.math.sqrt

open class Shape(val color:String, val isTransperent:Boolean) {
    open fun calculatePerimeter(){
        println("The perimeter of the shape is being calculated")
    }
    open fun calculateArea(){
        println("The Area of the shape is being calculated")
    }
}

class Circle (color: String,isTransperent: Boolean, val radius: Double): Shape(color, isTransperent){
    override fun calculatePerimeter() {
        println("The Perimeter of the circkle is ${this.radius * 2 * PI}")
    }

    override fun calculateArea() {
        println("The Area of the circle is ${(this.radius)*(this.radius)* PI} ")
    }
}

class Rectangle (color: String,isTransperent: Boolean, val width: Double, val height: Double): Shape(color, isTransperent){
    override fun calculatePerimeter() {
        println("The Perimeter of the Rectangle is ${this.height * 2 + this.width * 2}")
    }

    override fun calculateArea() {
        println("The Area of the rectangle is ${this.height * this.width} ")
    }
}

class Triangle (color: String,isTransperent: Boolean, val a: Double, val b: Double, val c:Double): Shape(color, isTransperent){
    override fun calculatePerimeter() {
        println("The Perimeter of the triangle is ${this.a + this.b + this.c}")
    }

    override fun calculateArea() {
        println("The Area of the triangle is ${0.25 * sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))} ") // Herons formel
    }
}

fun main(){
    val circle = Circle("red",false,14.0)

    circle.calculateArea()
    circle.calculatePerimeter()

    val rectangle = Rectangle("blue",true,10.0,10.0)
    rectangle.calculateArea()
    rectangle.calculatePerimeter()

    val triangle = Triangle("yellow",false,2.0,2.0,2.0)
    triangle.calculatePerimeter()
    triangle.calculateArea()

}