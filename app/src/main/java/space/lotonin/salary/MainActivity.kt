package space.lotonin.salary

import MyAlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set_itog()
        SetChoise()
    }

    override fun onClick(v: View) {}



    private var m1: EditText? = null
    private var m2: EditText? = null
    private var m3: EditText? = null
    private var t1: EditText? = null
    private var t2: EditText? = null
    private var t3: EditText? = null
    private var w1: EditText? = null
    private var w2: EditText? = null
    private var w3: EditText? = null
    private var th1: EditText? = null
    private var th2: EditText? = null
    private var th3: EditText? = null
    private var f1: EditText? = null
    private var f2: EditText? = null
    private var f3: EditText? = null
    private var s1: EditText? = null
    private var s2: EditText? = null
    private var s3: EditText? = null
    private var i1: TextView? = null
    private var i2: TextView? = null
    private var i3: TextView? = null
    private var tv1: TextView? = null
    private var tt = 0
    private var tf = 0
    private var ts = 0
    private var btn: Button? = null
    private var btn_m: Button? = null
    private var btn_t: Button? = null
    private var btn_w: Button? = null
    private var btn_th: Button? = null
    private var btn_f: Button? = null
    private var btn_s: Button? = null

    fun init() {
        m1 = findViewById(R.id.m1)
        m2 = findViewById(R.id.m2)
        m3 = findViewById(R.id.m3)
        btn_m = findViewById(R.id.btn_m)
        t1 = findViewById(R.id.t1)
        t2 = findViewById(R.id.t2)
        t3 = findViewById(R.id.t3)
        btn_t = findViewById(R.id.btn_t)
        w1 = findViewById(R.id.w1)
        w2 = findViewById(R.id.w2)
        w3 = findViewById(R.id.w3)
        btn_w = findViewById(R.id.btn_w)
        th1 = findViewById(R.id.th1)
        th2 = findViewById(R.id.th2)
        th3 = findViewById(R.id.th3)
        btn_th = findViewById(R.id.btn_th)
        f1 = findViewById(R.id.f1)
        f2 = findViewById(R.id.f2)
        f3 = findViewById(R.id.f3)
        btn_f = findViewById(R.id.btn_f)
        s1 = findViewById(R.id.s1)
        s2 = findViewById(R.id.s2)
        s3 = findViewById(R.id.s3)
        btn_s = findViewById(R.id.btn_s)
        i1 = findViewById(R.id.i1)
        i2 = findViewById(R.id.i2)
        i3 = findViewById(R.id.i3)
        tv1 = findViewById(R.id.tv1)
        btn = findViewById(R.id.btn)
    }

    fun set_i1() {
        if (m1!!.text.toString().trim { it <= ' ' } != "") {
            tt += m1!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (t1!!.text.toString().trim { it <= ' ' } != "") {
            tt += t1!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (w1!!.text.toString().trim { it <= ' ' } != "") {
            tt += w1!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (th1!!.text.toString().trim { it <= ' ' } != "") {
            tt += th1!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (f1!!.text.toString().trim { it <= ' ' } != "") {
            tt += f1!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (s1!!.text.toString().trim { it <= ' ' } != "") {
            tt += s1!!.text.toString().trim { it <= ' ' }.toInt()
        }
    }

    fun set_i2() {
        if (m2!!.text.toString().trim { it <= ' ' } != "") {
            tf += m2!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (t2!!.text.toString().trim { it <= ' ' } != "") {
            tf += t2!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (w2!!.text.toString().trim { it <= ' ' } != "") {
            tf += w2!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (th2!!.text.toString().trim { it <= ' ' } != "") {
            tf += th2!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (f2!!.text.toString().trim { it <= ' ' } != "") {
            tf += f2!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (s2!!.text.toString().trim { it <= ' ' } != "") {
            tf += s2!!.text.toString().trim { it <= ' ' }.toInt()
        }
    }

    fun set_i3() {
        if (m3!!.text.toString().trim { it <= ' ' } != "") {
            ts += m3!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (t3!!.text.toString().trim { it <= ' ' } != "") {
            ts += t3!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (w3!!.text.toString().trim { it <= ' ' } != "") {
            ts += w3!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (th3!!.text.toString().trim { it <= ' ' } != "") {
            ts += th3!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (f3!!.text.toString().trim { it <= ' ' } != "") {
            ts += f3!!.text.toString().trim { it <= ' ' }.toInt()
        }
        if (s3!!.text.toString().trim { it <= ' ' } != "") {
            ts += s3!!.text.toString().trim { it <= ' ' }.toInt()
        }
    }

    fun set_itog() {
        tt = 0
        tf = 0
        ts = 0
        init()
        set_i1()
        set_i2()
        set_i3()
        if (tt != 0) i1!!.text = Integer.toString(tt)
        if (tf != 0) i2!!.text = Integer.toString(tf)
        if (ts != 0) i3!!.text = Integer.toString(ts)
    }

    fun SetChoise() {
        btn_m?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = m2
            fragment.et2 = m3
            fragment.show(manager, "myDialog")

        }
        btn_t?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = t2
            fragment.et2 = t3
            fragment.show(manager, "myDialog")

        }
        btn_w?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = w2
            fragment.et2 = w3
            fragment.show(manager, "myDialog")

        }
        btn_th?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = th2
            fragment.et2 = th3
            fragment.show(manager, "myDialog")

        }
        btn_f?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = f2
            fragment.et2 = f3
            fragment.show(manager, "myDialog")

        }
        btn_s?.setOnClickListener {
            val fragment = MyAlertDialog()
            val manager = supportFragmentManager
            fragment.et = s2
            fragment.et2 = s3
            fragment.show(manager, "myDialog")

        }
    }

    fun FrostClick(et: EditText?) {
        if(et?.visibility == View.VISIBLE){
            et?.visibility = View.INVISIBLE
            et?.text = null
        }else{
            et?.visibility = View.VISIBLE
        }
    }

    fun SecondClick(et: EditText?) {
        if(et?.visibility == View.VISIBLE){
            et?.visibility = View.INVISIBLE
            et?.text = null
        }else{
            et?.visibility = View.VISIBLE
        }
    }

}