/*
Extension Function
 - 확장함수는 기존 Class 에 새로운 Method 를 추가하고자 할 때 사용합니다.
 - 기존 Class 에 새로운 함수를 추가하는 개념입니다.
 - Kotlin Code 에서는 기존 Class 에 Method 를 추가해 사용 하는 것처럼 보이지만
  사실 객체의 주솟값을 받은 함수가 만들어지고 그 함수를 호출하는 방식으로 동잡합니다.
 */
fun main() {

    val str1 = "abcd"
    println(str1.getUpperString())
}

fun String.getUpperString() : String {

    return this.toUpperCase()
}