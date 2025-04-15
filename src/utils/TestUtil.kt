package utils

import kotlin.collections.*

fun <T> Comparable<T>.runTestcase(expected: Comparable<T>) {
    printTestResult(result = this == expected, expected = expected)
}

fun CharArray.runTestcase(expected: CharArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun ShortArray.runTestcase(expected: ShortArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun IntArray.runTestcase(expected: IntArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun LongArray.runTestcase(expected: LongArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun FloatArray.runTestcase(expected: FloatArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun DoubleArray.runTestcase(expected: DoubleArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun BooleanArray.runTestcase(expected: BooleanArray) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

fun <T> Array<T>.runTestcase(expected: Array<T>) {
    this.asIterable()
        .printTestResult(
            result = contentEquals(expected),
            expected = expected.asIterable()
        )
}

private fun <T> Comparable<T>.printTestResult(result: Boolean, expected: Comparable<T>) {
    println(
        "Test Result: ${if (result) "Accepted" else "Wrong Answer"}, " +
                "Output: $this, " +
                "Expected: $expected"
    )
}

private fun <T> Iterable<T>.printTestResult(result: Boolean, expected: Iterable<T>) {
    println(
        "Test Result: ${if (result) "Accepted" else "Wrong Answer"}, " +
                "Output: ${joinToString(separator = ",", prefix = "[", postfix = "]")}, " +
                "Expected: ${expected.joinToString(separator = ",", prefix = "[", postfix = "]")}"
    )
}
