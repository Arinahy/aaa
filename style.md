# 代码风格

## 文件编码

一律使用 UTF8 编码，禁止 GBK 编码。

## 缩进

一律四空格缩进，禁止 tab 缩进。

```java
public class App {
    public static void main(String[] args) {
```

## 空行

类的两个方法之间至少有一个空行。

```java
List<Literature> selectByTitle(String title);

List<Literature> selectByAuthor(String author);
```

方法体中两个业务逻辑块之间至少有一个空行。

```java
```

import 与 class 之间至少有一个空行。

```java
import cn.edu.nuist.lms.model.Literature;

public class App {
```

## 空格

运算符与变量之间加空格。

```java
c = a + b;
```

## 变量声明

禁止单行多变量声明。

```java
// 错误
String userName = null, password = null;

// 正确
String userName = null;
String password = null;
```

使用有意义的变量名称，不要用缩写和单字母命名。

```java
// 错误
String pswd=null;

// 正确
String password = null;
```

## 代码块

每个 if, for 等语句都应使用代码块，占用至少三行。

```java
// 错误
if (conn != null) conn.close();

// 正确
if (conn != null){
    conn.close();
}
```

## 资源路径

不要写死配置文件路径，应使用相对路径而不是绝对路径。

```java
this.getClass().getResource("../ico/add.gif"))
```
