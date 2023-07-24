package jp.techacademy.tetsuya.kotlinlog

import android.util.Log

//他でoverrideする時はopen classにする
open class Dog: Animal, Movable {

    //コンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    //Animalクラスのメソッド　他にoverrideする時はopenにする
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //Movableクラスのメソッド　他にoverrideする時はopenにする
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った")
    }

}