package g0001_0100.s0050_powx_n

// #Medium #Top_Interview_Questions #Math #Recursion #Udemy_Integers
// #2022_09_21_Time_307_ms_(17.33%)_Space_35.2_MB_(54.67%)

class Solution {
    fun myPow(x: Double, n: Int): Double {
        var x = x
        var nn = n.toLong()
        var res = 1.0
        if (n < 0) {
            nn *= -1
        }
        while (nn > 0) {
            if (nn % 2 == 1L) {
                nn--
                res *= x
            } else {
                x *= x
                nn /= 2
            }
        }
        return if (n < 0) {
            1.0 / res
        } else res
    }
}