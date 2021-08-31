package org.techtown.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import org.techtown.spinnerapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data = listOf("- 선택하세요-","1월","2월","3월","4월","5월","6월")
        //컨테이너: 데이터를 동적으로 출력할 때,데이터를 반복적으로 표시할 때 사용.
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,data)
        binding.spinner.adapter=adapter
        binding.spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.result.text= data[p2] //책에는 data.get(p2)라 나와있다.
            }
        }
    }
}
