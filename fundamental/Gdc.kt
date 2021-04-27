fun gdc(a: Int, b: Int): Int {
	return if (b == 0) a else gdc(b, a%b)
}

// kotlinc Gdc.kt -include-runtime -d test.jar && java -jar test.jar
fun main() {
	println("gdc(10, 35) = %s".format(gdc(10, 35)))
}