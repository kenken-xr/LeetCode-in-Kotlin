package g0001_0100.s0078_subsets

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Bit_Manipulation #Backtracking
// #Algorithm_II_Day_9_Recursion_Backtracking #Udemy_Backtracking/Recursion
// #2022_11_25_Time_191_ms_(97.44%)_Space_36.1_MB_(96.15%)

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        solve(nums, ArrayList(), res, 0)
        return res
    }

    private fun solve(nums: IntArray, temp: MutableList<Int>, res: MutableList<List<Int>>, start: Int) {
        res.add(ArrayList(temp))
        for (i in start until nums.size) {
            temp.add(nums[i])
            solve(nums, temp, res, i + 1)
            temp.removeAt(temp.size - 1)
        }
    }
}