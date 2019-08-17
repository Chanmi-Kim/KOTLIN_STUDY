fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true

    // 아우라
    // if (isBlessed && healthPoints > 50 || isImmortal) {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }

    // if (healthPoints == 100) {
    val healthStatus = if (healthPoints == 100) {
        // println(name + " 최상의 상태임!")
        "최상의 상태임!"
    } else if (healthPoints >= 90) {
        // println(name + " 약간의 찰과상만 있음.")
        "약간의 찰과상만 있음."
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            // println(name + " 경미한 상처가 있지만 빨리 치유됨!")
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            // println(name + " 경미한 상처만 있음.")
            "경미한 상처만 있음."
        }
    } else if (healthPoints >= 15) {
        // println(name + " 많이 다친 것 같음.")
        "많이 다친 것 같음."
    } else {
        // println(name + " 최악의 상태임!")
        "최악의 상태임!"
    }

    // 플레이어의 상태 출력
    println(name + " " + healthStatus)
}