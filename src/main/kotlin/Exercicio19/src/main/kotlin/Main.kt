fun romanToInt(s: String): Int {
    var result = 0
    var i = 0
    while (i < s.length) {
        val current = s[i]
        val currentValue = getValue(current)
        if (i < s.length - 1) {
            val next = s[i + 1]
            val nextValue = getValue(next)
            if (nextValue > currentValue) {
                result += nextValue - currentValue
                i += 2
                continue
            }
        }
        result += currentValue
        i++
    }
    return result
}

@Suppress("UNREACHABLE_CODE")
fun getValue(c: Char): Int {
    return when (c) {
        'I' -> return 1
        'V' -> return 5
        'X' -> return 10
        'L' -> return 50
        'C' -> return 100
        'D' -> return 500
        'M' -> return 1000
        else -> throw IllegalArgumentException("Caractere inválido: $c")
    }
}
