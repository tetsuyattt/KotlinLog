package jp.techacademy.tetsuya.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //追加１ Log.d()追加したら自動で追加された

//パッケージレベルに定義した関数
fun fotmatMyTag(): String {
    return "[" + MY_TAG + "]"
}
const val MY_TAG = "kotlintest"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dog = Dog("ポチ", 3)
//      dog.move()

        val human = Human("とがし", 32, "お金儲け")
        human.say()
        human.think()

        val human2 = Human("てつや", 99, "長生きの秘訣")
        human2.say()
        human2.think()

    }

}