# android-button-click-demo

## 简介

演示如何在 Android 应用中处理按钮的点击事件。

## 基本原理

- 按钮点击通过 `OnClickListener` 监听
- 通过 `findViewById()` 获取布局中的视图组件
- 使用 `setOnClickListener()` 设置点击监听器

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 运行应用
3. 点击按钮观察效果

## 教程

### 什么是点击事件？

点击事件是用户与应用交互的最基本方式。在 Android 中，我们通过设置监听器来处理点击事件。

### 处理按钮点击

```kotlin
// 获取按钮组件
val button = findViewById<Button>(R.id.button)

// 设置点击监听器
button.setOnClickListener {
    // 处理点击逻辑
    clickCount++
    textView.text = "点击次数: $clickCount"
}
```

### 关键点

1. **findViewById**: 通过资源 ID 获取布局中的视图
2. **setOnClickListener**: 设置点击监听器
3. **lambda 表达式**: Kotlin 中简化了监听器的写法

### 注意事项

- 组件必须在布局中定义 ID: `android:id="@+id/button"`
- 组件类型必须与布局中定义的一致
- 初始化组件在 onCreate 方法中进行
