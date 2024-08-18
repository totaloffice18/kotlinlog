package jp.techacademy.kazuya.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val dog = Dog("ポチ", 3)  // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human = Human("かずや",52,"エネルギー")

        dog.say()
        human.say()
        human.think()
    }




}