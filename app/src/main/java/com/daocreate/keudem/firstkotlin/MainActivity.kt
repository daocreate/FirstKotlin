package com.daocreate.keudem.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    var foodList = arrayListOf("Macabo", "Tapioca", "Taro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var etName = findViewById<EditText>(R.id.editTextName)
        //var bnt    = findViewById<Button>(R.id.btn_add)
       btn_add.setOnClickListener{
            val newFood = editTextName.text.toString()
           foodList.add(newFood)
           editTextName.text.clear()
           println(foodList)
            //Toast.makeText(this,"$name ${editTextName.text}", Toast.LENGTH_LONG).show()

        }
        btn_decide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            var name:String = foodList[randomFood]
            textViewFoodSelect.text = foodList[randomFood]

        }

    fun main(args: Array<String>){

    }
    }
}
