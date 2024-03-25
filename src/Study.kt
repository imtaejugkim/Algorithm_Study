import kotlin.math.max
import kotlin.math.min

class Solution1 {
    fun isPalindrome(s: String): Boolean {
        val regex = Regex("[^A-Za-z0-9]")
        val text = regex.replace(s,"").toLowerCase()
        var first = 0
        var last = text.length - 1
        while(first < last){
            if(text[first] !=text[last]){
                return false
            }
            first++
            last--
        }
        return true
    }
}

class Solution2 {
    fun reverseString(s: CharArray): Unit {
        val first = 0
        val last = s.size - 1
        while (first < last) {
            val a = s[first]
            s[first] = s[last]
            s[last] = a
        }
    }
}

//3주차
//EASY 1
class Solution561 {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var result = 0
        for(i in 0 until nums.size/2){
            result+= nums[2*i]
        }

        return result
    }
}

//EASY 2
class Solution238 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        for(i in nums.indices){
            var extra = 1
            for(j in nums.indices){
                if(j!=i){
                    result[i] = extra * nums[j]
                    extra = nums[i]
                }
            }
        }
        return result
    }
}

//EASY 3
class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        var newMin = prices[0]
        var maxDiff = 0

        for(i in 1 until prices.size) {

            val diff = prices[i] - newMin
            if(diff >= 0) {
                maxDiff = max(maxDiff, diff)
            }
            else {
                newMin = prices[i]
            }
        }
        return maxDiff
    }
}

// MEDIUM
class Solution463{
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var result = 0
        val size = grid.size
        val sizeC = grid[0].size

        for(i in 0 until size){
            for(j in 0 until sizeC){
                if(grid[i][j] == 1){
                    var line = 4
                    if(i > 0 && grid[i-1][j] == 1 ){
                        line -= 1
                    }
                    if(j > 0 && grid[i][j-1] == 1){
                        line -= 1
                    }
                    if(i < size - 1 && grid[i+1][j] == 1){
                        line -= 1
                    }
                    if(j < sizeC - 1 && grid[i][j+1] == 1){
                        line -= 1
                    }
                    result += line
                }
            }
        }
        return result
    }
}

// HARD
class Solution {
    fun solveSudoku(board: Array<CharArray>): Unit {
        // 한 줄 읽어서 없는 숫자 양옆
        // 한 줄 읽어서 없는 숫자 위아래
        // 한 블럭 읽어서 없는 숫자 3*3
        for(i in board.indices){
            for(j in board.indices){

            }
        }
    }
}

fun main(){
    val solution = Solution238().productExceptSelf(intArrayOf(1,2,3,4))
    println(solution)
}