package jp.techacademy.kazuya.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val human = Human("かずや",52,"エネルギー")

        human.say()
        human.think()

        val human2 = Human("てつと",23,"AI")

        human2.say()
        human2.think()

    }




}