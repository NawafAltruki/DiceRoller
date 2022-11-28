package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.diceButton)
        rollButton.setOnClickListener {
            rollDice()

            //End of OnClickListener.
        }
        //End of OnCreate Fun.
    }

    private fun rollDice() {
        var dice = Dice(6)
        var diceRoll = dice.roll()
        var diceRoll2 = dice.roll()
        var diceImage : ImageView = findViewById(R.id.diceViewImage)
        var diceImage2 : ImageView = findViewById(R.id.diceImageView)
        /*var drawbaleResourse = when (diceRoll){
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        var drawbaleResourse2 = when (diceRoll2){
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else ->R.drawable.dice_6
        }*/

        //Dice 1
        if(diceRoll==1){
            diceImage.setImageResource(R.drawable.dice_1)
        }else if(diceRoll==2){
            diceImage.setImageResource(R.drawable.dice_2)
        }else if(diceRoll==3) {
            diceImage.setImageResource(R.drawable.dice_3)
        }else if(diceRoll==4) {
            diceImage.setImageResource(R.drawable.dice_4)
        }else if(diceRoll==5) {
            diceImage.setImageResource(R.drawable.dice_5)
        }else if(diceRoll==6) {
            diceImage.setImageResource(R.drawable.dice_6)
        }

        //Dice 2
        if(diceRoll2==1){
            diceImage2.setImageResource(R.drawable.dice_1)
        }else if(diceRoll2==2){
            diceImage2.setImageResource(R.drawable.dice_2)
        }else if(diceRoll2==3) {
            diceImage2.setImageResource(R.drawable.dice_3)
        }else if(diceRoll2==4) {
            diceImage2.setImageResource(R.drawable.dice_4)
        }else if(diceRoll2==5) {
            diceImage2.setImageResource(R.drawable.dice_5)
        }else if(diceRoll2==6) {
            diceImage2.setImageResource(R.drawable.dice_6)
        }

        //End of rollDice Fun.
    }
    //End of Class MainActivity.
}

class Dice(val numSide:Int){

    fun roll():Int{
        return (1..numSide).random()
        //End of roll Fun.
    }
    //End of class Dice.
}