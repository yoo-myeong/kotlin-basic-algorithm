# 코틀린 기초문법 정리

## 표기법

- 클래스 - 파스칼 표기법

  ex) AuthService : 대문자로 시작

- 함수, 변수 - 카멜 표기법

  ex) functionName : 소문자로 시작

<br>

## 변수

- var : 읽기, 쓰기 가능
- val : 처음 선언에서만 값을 할당

<br>

## 자료형

- nullable
  - `var a :Int? = null`
  - 코틀린은 null point exception을 막기 위해 원천적으로 값이 할당되지 않는 상황을 차단
  - 따라서 값을 할당하지 않을 때는 **nullable**변수로 선언해주어야 함

<br>

#### 자료형 체크

코틀린은 `is`연산자를 통해 자료형의 참 거짓을 얻을 수 있다.

```kotlin
var a = 5
a is Int // true
a is Char // false
```

<br>

## 형변환

코틀린은 오류를 막기위해 **명시적형변환**만이 가능

- toInt()
- toFloat()
- toChar()

<br>

## 배열

처음 선언한 크기에서 변경이 불가능하다.

- 일반 배열
  - `var arr = arrayOf(1,2,3,4,5)`
- 비어있는 배열
  - `var arr = arrayOfNulls<Int>(5)`

<br>

## 함수

```kotlin
fun add(a:Int, b:Int) : Int {
    return a + b
}
```

위 함수를 단일표현식 함수로 더 짧게 표현할 수 있다.

#### 단일표현식 함수

```kotlin
fun add(a:Int, b:Int) = a + b
```

<br>

## for문

- 일반 반복문
  ```kotlin
  for(i in 0..9) {
      print(i)
  }
  ```
- step
  ```kotlin
  for(i in 0..9 step 3){
      print(i)
  }
  ```
- 감소 반복문
  ```kotlin
  for(i in 9 downTo 0){
      print(i)
  }
  ```
  - .. 대신 `downTo`를 붙인다.
  - 뒤에 `step`을 붙이면 단계를 변경할 수 있다.
- labele
  ```kotlin
  for(i in 0..9){
      for(j in 0..9){
          if(i==1 && j==2) break
          return i+j
      }
      if(i==1 && j==2) break
  }
  ```
  위 코드를 코틀린은 lable을 사용해서 간단하게 처리한다.
  ```kotlin
  loop@for(i in 0..9){
      for(j in 0..9){
          if(i==1 && j==2) break@loop
          return i+j
      }
  }
  ```
