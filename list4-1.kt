/*

- Chapter 4 리스트 4-1
- p.45

 */

fun main(args: Array<String>) {
    println(makeMessage1(1))
    println(makeMessage1(2))
    println(makeMessage2(1))
    println(makeMessage2(2))
}

fun makeMessage1(msgType: Int) : String {
    return if (msgType == 1) "안녕하세요?" else "또 만났군요!!"
}

fun makeMessage2(msgType: Int) = if (msgType == 1) "날씨 좋죠?" else "참 맑군요!!"