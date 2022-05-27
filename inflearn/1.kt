fun main() {
    var answer = 0
    var str = readLine()
    str = str!!.lowercase()
    var target = readLine()!![0]
    target.lowercase()
    str.forEach { s->
        if (s == target) answer ++
    }

    print(answer)
}
