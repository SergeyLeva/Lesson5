package ua.sergeylevchenko.lesson5_natasha_sleep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        right_up_image.setOnClickListener {
            val phrases = listOf(
                "Уже 6 часов утра, Наташ",
                "Вставай, мы там всё уронили",
                "Мы уронили вообще всё, Наташ, честно",
                "Наташ, ты чё опять лежишь?",
                "Часики-то тикают",
                "Мужика-то хоть нашла себе?",
                "Уже дитачек пора рожать вообще-то"
            )
            val shuffledList = phrases.shuffled()
            second_text.text = shuffledList[0]
        }

        right_bottom_image.setOnClickListener {
            val phrases = listOf(
                "Алло",
                "Добрый день",
                "Сколько времени?",
                "Наташ, ты меня любишь?"
            )

            val shuffledList = phrases.shuffled()
            forth_text.text = shuffledList[1]
        }

        left_bottom_image.setOnClickListener {
            val phrases = listOf(
                "Несе галя воду",
                "Коромисло гнеться",
                "Гоп ца ца",
                "Ца ца гоп"
            )

            val shuffledList = phrases.shuffled()
            third_text.text = shuffledList[2]


        }
        up_image.setOnClickListener {
            val phrases = listOf(
                "4",
                "3",
                "2",
                "1"
            )

            val shuffledList = phrases.shuffled()
            up_text.text = shuffledList[3]
        }


    }


}

