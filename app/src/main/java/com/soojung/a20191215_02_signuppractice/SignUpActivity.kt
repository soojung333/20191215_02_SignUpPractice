package com.soojung.a20191215_02_signuppractice

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

// MainActivity를 SignUpActivity로 변경하고 싶다. => 커서올리고 Shift + F6
class SignUpActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


            birthDayTxt.setOnClickListener {

                val datePickerDialog = DatePickerDialog(mContext, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                    val selectedDateStr = "${year} / ${month} / ${dayOfMonth}"
                    birthDayTxt.text = selectedDateStr


//                    자바에서는 월을 0~11월로 사용함. 생각하는 것 보다 1 작은 숫자를 월로 넣어줘야 함.
//                    Calendar 클래스의 변수를 활용해서 월을 입력하면 보기 직관적.

                }, 2019, Calendar.DECEMBER, 15)

                datePickerDialog.show()





            val inputStr = it.toString()
            if (inputStr.length == 0) {
                pwStatusTxt.text = "비밀번호가 입력되지 않았습니다."
                pwStatusTxt.setTextColor(Color.RED)
            }
            else if (inputStr.length<8) {
                pwStatusTxt.text = "입력된 비밀번호가 너무 짧습니다."
                pwStatusTxt.setTextColor(Color.parseColor("#DA6142"))
            }
            else {
                pwStatusTxt.text = "사용해도 좋은 비밀번호입니다"
                pwStatusTxt.setTextColor(Color.parseColor("#4E92DF"))
            }
        }


//        pwEdt.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                Log.d("입력된 값",s.toString())
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//
//        })
    }

    override fun setValues() {


    }


}
