package com.example.bin_go

import Cuadricula
import Nambas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var b_arr : Array<Button>? = (null)
    var numz : Nambas = Nambas()
    var n_inx : Int = 0

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

        numz.inic()

    }

    var cb = ctrl_btn()
    var q = Cuadricula()

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

    fun clear(){
        for(bot in b_arr!!){
            bot.background = ColorDrawable(Color.WHITE)
        }

        cb.setT()

        numz.inic()

        n_inx = 0

        displei.setText("?")
    }

    fun reset(view: View){
        clear()

        fill()
    }

    fun inv(btn : Button, estado : Boolean) : Boolean{

        if(estado)
            btn.background = ColorDrawable(resources.getColor(R.color.colorAccent))
        else
            btn.background = ColorDrawable(Color.WHITE)

        return estado.not()
    }

    fun r5(columna : Array<Int>) : ArrayList<Int>? {
        var col : ArrayList<Int>? = ArrayList()
        var tarr : ArrayList<Int> = columna.toCollection(ArrayList<Int>())

        for (x in 1..5){
            var index : Int = (0 until (tarr.size)).random()

            col?.add(tarr[index])

            tarr.removeAt(index)
        }

        return col

    }

    fun fill(){
        var bc = r5(q.bl)

        b1.setText("B " + bc!![0].toString())
        b2.setText("B " + bc!![1].toString())
        b3.setText("B " + bc!![2].toString())
        b4.setText("B " + bc!![3].toString())
        b5.setText("B " + bc!![4].toString())

        var ic = r5(q.il)

        i1.setText("I " + ic!![0].toString())
        i2.setText("I " + ic!![1].toString())
        i3.setText("I " + ic!![2].toString())
        i4.setText("I " + ic!![3].toString())
        i5.setText("I " + ic!![4].toString())

        var nc = r5(q.nl)

        n1.setText("N " + nc!![0].toString())
        n2.setText("N " + nc!![1].toString())
        n3.setText("★")
        n4.setText("N " + nc!![3].toString())
        n5.setText("N " + nc!![4].toString())

        var gc = r5(q.gl)

        g1.setText("G " + gc!![0].toString())
        g2.setText("G " + gc!![1].toString())
        g3.setText("G " + gc!![2].toString())
        g4.setText("G " + gc!![3].toString())
        g5.setText("G " + gc!![4].toString())

        var oc = r5(q.ol)

        o1.setText("O " + oc!![0].toString())
        o2.setText("O " + oc!![1].toString())
        o3.setText("O " + oc!![2].toString())
        o4.setText("O " + oc!![3].toString())
        o5.setText("O " + oc!![4].toString())
    }

    fun getN(view: View){
        if (n_inx < numz.nums?.size!!){
            displei.setText(numz.nums!![n_inx])
            n_inx++
        }
        else{
            displei.setText("${resources.getText(R.string.app_name)}!")
        }
    }

    fun clrT(view: View){
        clear()
    }

}
