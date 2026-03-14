package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Button 点击演示 Activity
 * 展示如何在 Android 中处理按钮点击事件
 */
class MainActivity : AppCompatActivity() {

    // 声明界面组件变量
    private lateinit var button: Button
    private lateinit var textView: TextView

    // 点击计数器
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化组件 - 通过 ID 查找布局中的视图
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        // 设置按钮点击监听器
        button.setOnClickListener {
            // 点击事件处理逻辑
            clickCount++

            // 更新 TextView 显示
            textView.text = "点击次数: $clickCount"

            // 显示 Toast 提示
            Toast.makeText(this, "按钮被点击了!", Toast.LENGTH_SHORT).show()
        }
    }
}
