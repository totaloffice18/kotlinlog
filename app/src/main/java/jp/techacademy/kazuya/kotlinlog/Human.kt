package jp.techacademy.kazuya.kotlinlog

import android.util.Log

open class Human:Animal,Thinkable {

    constructor(name:String,age:Int):super(name,age){
    }
    override fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。")
    }

    var hobby:String

    constructor(hobby:String)
    this.hobby=hobby

    override fun think(){
        Log.d("kotlintest","私は"+hobby+"について考える。")
    }
}