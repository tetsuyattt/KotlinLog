package jp.techacademy.tetsuya.kotlinlog

import android.util.Log

/*チャットGPTに「AnimalクラスからHumanクラスに継承したコンストラクタに「hobby」変数を追加する方法を教えて」って
聞いたらこう教えてくれた。→そしたらできた。すごい。
 */
open class Human(name: String, age: Int, val hobby: String) :Animal(name,age), Thinkable {


//単純に、↓こうかと思ったけどダメだった。Animalクラスでhobbyを定義してねって言われた
//    val hobby: String
//    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
//        this.name = name
//        this.age = age
//        this.hobby = hobby
//    }


    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age +"です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}