package com.example.kotlinfund

fun main(){
    val nums = listOf(1,2,3,4)
    val fold = nums.runningFold(0){acc, i -> acc + i}
    val students = mutableListOf(Student(0,50,"m"), Student(1,70,"k"), Student(2,100,"j"))
/*
 //    val list = Node(1, Node(2, Node(3, Node(4, Node(5)))))
//    println(list)
//    list.printRev()

    //println(fold)
   // pushExample()
//    val folds = students.fold(0){acc, student ->
//        acc + student.percent
//    }

    //println(folds)
//    val test = students.map { it.name.uppercase() }
//    val test2 = students.filter { it.percent >50 }
//    val test3 = students.partition { it.percent >50 }
//    val (sucess,fail) = students.partition { it.percent >50 }
//    //println(students)
//    println(test)
//    println(test2)
//    println(test3)
//    println(sucess)
//    println(fail)
* */

    val integers = intArrayOf(1,5,-2,-4,0)

    val res = containsDuplicate(integers)
    println(res)
}
fun containsDuplicate(nums: IntArray): Boolean {

    var tempNums = intArrayOf().toMutableList()
    for (item in nums)
        if(tempNums.contains(item)){
            println(tempNums)

            return true
        }else{
            tempNums.add(item)
        }
return false
}
fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length)
        return false
    else {
        fun getFreqMap(chars: String): Map<String, Int> {
            val freq: MutableMap<String, Int> = HashMap()
            for (c in chars)
            {
                freq.putIfAbsent(c.toString(), 0)
                freq[c.toString()] = freq[c.toString()]!! + 1
            }
            return freq
        }

        val freq1 = getFreqMap(s)
        val freq2 = getFreqMap(t)

        fun matchesMap(map1: Map<String, Any>, reference: Map<String, Any>): Boolean {
            return reference.all { (k, v) ->  map1[k] == v }
        }

        val cond = matchesMap(freq1, freq2)

        if(cond){
            println("true")
        }
        println(freq1)
        println(freq2)
        return true
    }
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    val numsHash: MutableMap<Int, Int> = HashMap()
    val ans: IntArray = IntArray(2)
    var i = 0
    for(i in nums.indices){
        if(numsHash.containsKey(target - nums[i])){
            ans[0] = i
            if(target - nums[i] != null)
                ans[1] = numsHash[target - nums[i]]!!
            return ans
        }
        numsHash[nums[i]] = i
    }
    return ans
}
fun pushExample(){
    val list = LinkedList<Int>()
    list.push(3)
    list.push(4)
    list.push(5)
    list.push(6)

    println(list)
}
data class Student(
val id: Int,
val percent: Int,
val name: String)