package com.example.hacker

import android.provider.UserDictionary.Words
import kotlin.math.abs

fun main() {

    class Solution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            var tempArray : IntArray = IntArray(n+m)

            for(i in 0 until m ){
                for (j in 0 until n) {
                    if (nums1[i] > nums2[j]) {
                        nums1[i + j] = nums1[i]
                    } else {
                        nums1[i + j] = nums2[j]
                    }
                }
            }

        }

        class Solution1 {
            fun removeElement(nums: IntArray, valueToCheck: Int): Int {
                var index = 0
                var k : Int = 0
                for (i in nums.indices) {
                    if (nums[i] == valueToCheck) {


                    }else{k++}
        }
                return k
    }

            fun removeDuplicates(nums: IntArray): Int {
                var k : Int = 1

                for (i in 1..nums.size) {
                        if (nums[i] != nums[i -1 ]){
                            nums[k] = nums[i]
                            k++
                        }
                    }
                return k
            }

    //compute the sum of 2 integers
    fun solveMeFirst(a : Int, b : Int): Int{
        return a + b
    }

    fun simpleArraySum(ar : Array<Int>) : Int{
        return ar.sum()
    }

    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        var aPoint : Int = 0
        var bPoint : Int = 0
        for(i in a.indices) {
            when {
                a[i] > b[i] -> aPoint++
                a[i] < b[i] -> bPoint++
            }

        }
            return arrayOf(aPoint, bPoint)

    }

    fun aVeryBigSum(ar: Array<Long>): Long {

        return ar.sum()

    }

    fun minimalOperations(words: Array<String>): Array<Int> {
        var result = Array<Int>(words.size) { 0 }
        for (i in words.indices) {
            var substitutions = 0
            for (char in words[i]) {
                var preciousChar = ' '
                var posibleMiddles = ' '

                if (char == preciousChar && char != posibleMiddles) {
                    substitutions++
                    posibleMiddles = char
                    preciousChar = char
                }
                if (char == preciousChar && char == posibleMiddles) {
                    substitutions++
                    posibleMiddles = ' '
                    preciousChar = char
                }
                if (char == preciousChar){
                    substitutions++
                    posibleMiddles = char

                }

                result[i] = substitutions

            }

        }
        return result
    }

    fun findMinimumShifts(mat: Array<String>): Int {
        // Write your code here
        val n = mat.size // Number of rows
        val m = mat[0].length // Number of columns

        var minShifts = Int.MAX_VALUE
        for (col in 0 until m) {
            var shiftsForCurrentColumn = 0
            // Check if shifting this column can make it all 1s
            for (row in 0 until n) {
                // Count shifts needed to align '1' in this row to the current column
                var shifts = 0
                while (mat[row][(col + shifts) % m] == '0') {
                    shifts++
                }
                shiftsForCurrentColumn += shifts
            }
            // Update minimum shifts if current column requires fewer shifts
            minShifts = minOf(minShifts, shiftsForCurrentColumn)
        }

        return if (minShifts == Int.MAX_VALUE) -1 else minShifts

    }

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var decendingSum = 0
        var ascendingSum = 0

        for(i in arr.indices) {
            for (j in arr.indices) {
                if (i == j) {
                    decendingSum += arr[i][j]
                }
                if (i + j == arr.size - 1) {
                    ascendingSum += arr[i][j]
                }
            }
        }
        return abs(decendingSum  + ascendingSum)

    }
    fun plusMinus(arr: Array<Int>): Unit {
        // Write your code here
        var postivesSum = 0
        var negativesSum = 0
        var zerosSum = 0

        for(i in arr.indices) {
            when {
                arr[i] > 0 -> postivesSum++
                arr[i] < 0 -> negativesSum++
                arr[i] == 0 -> zerosSum++
            }
        }
            println(postivesSum.toFloat().div(arr.size))
            println(negativesSum.toFloat().div(arr.size))
            println(zerosSum.toFloat().div(arr.size))
    }

    fun staircase(n: Int): Unit {
        // Write your code here

        for(i in 1..n)
           for ()

    }

    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))

}