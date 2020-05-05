package com.example.bin_go

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var b_arr : Array<Button>? = (null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_arr  = arrayOf<Button>(

            b1, b2, b3, b4, b5,
            i1, i2, i3, i4, i5,
            n1, n2, n3, n4, n5,
            g1, g2, g3, g4, g5,
            o1, o2, o3, o4, o5

        )
    }

    var cb = ctrl_btn()


    //Botones B
    fun be1(view: View){
        cb.bb1 = inv(b1, cb.bb1)
    }

    fun be2(view: View){
        cb.bb2 = inv(b2, cb.bb2)
    }

    fun be3(view: View){
        cb.bb3 = inv(b3, cb.bb3)
    }

    fun be4(view: View){
        cb.bb4 = inv(b4, cb.bb4)
    }

    fun be5(view: View){
        cb.bb5 = inv(b5, cb.bb5)
    }

    //Botones I
    fun ie1(view: View){
        cb.ii1 = inv(i1, cb.ii1)
    }

    fun ie2(view: View){
        cb.ii2 = inv(i2, cb.ii2)
    }

    fun ie3(view: View){
        cb.ii3 = inv(i3, cb.ii3)
    }

    fun ie4(view: View){
        cb.ii4 = inv(i4, cb.ii4)
    }

    fun ie5(view: View){
        cb.ii5 = inv(i5, cb.ii5)
    }

    //Botones N
    fun ne1(view: View){
        cb.nn1 = inv(n1, cb.nn1)
    }

    fun ne2(view: View){
        cb.nn2 = inv(n2, cb.nn2)
    }

    fun ne3(view: View){
        cb.nn3 = inv(n3, cb.nn3)
    }

    fun ne4(view: View){
        cb.nn4 = inv(n4, cb.nn4)
    }

    fun ne5(view: View){
        cb.nn5 = inv(n5, cb.nn5)
    }

    //Botones G
    fun ge1(view: View){
        cb.gg1 = inv(g1, cb.gg1)
    }

    fun ge2(view: View){
        cb.gg2 = inv(g2, cb.gg2)
    }

    fun ge3(view: View){
        cb.gg3 = inv(g3, cb.gg3)
    }

    fun ge4(view: View){
        cb.gg4 = inv(g4, cb.gg4)
    }

    fun ge5(view: View){
        cb.gg5 = inv(g5, cb.gg5)
    }

    //Botones O
    fun oe1(view: View){
        cb.oo1 =inv(o1, cb.oo1)
    }

    fun oe2(view: View){
        cb.oo2 =inv(o2, cb.oo2)
    }

    fun oe3(view: View){
        cb.oo3 =inv(o3, cb.oo3)
    }

    fun oe4(view: View){
        cb.oo4 =inv(o4, cb.oo4)
    }

    fun oe5(view: View){
        cb.oo5 = inv(o5, cb.oo5)
    }

    fun reset(view: View){
        for(bot in b_arr!!){
            bot.setText("?")
            bot.background = ColorDrawable(Color.WHITE)
        }

        cb.setT()

    }

    fun inv(btn : Button, estado : Boolean) : Boolean{

        if(estado)
            btn.background = ColorDrawable(Color.CYAN)
        else
            btn.background = ColorDrawable(Color.WHITE)

        return estado.not()
    }
}
