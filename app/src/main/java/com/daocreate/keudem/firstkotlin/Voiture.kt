package com.daocreate.keudem.firstkotlin

class Voiture(): Roue() {
    var vitesse:Int?=null
    var model:String?=null
    var price:Double?= null

    constructor(vitesse:Int,model: String, price:Double ) : this(){
        this.vitesse=vitesse
        this.model  =model
        this.price  =price

    }




}