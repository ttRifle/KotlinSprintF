package org.example.lesson_2

fun main() {

    val crystalOreCraft = 7
    val ironOreCraft = 11
    val percentBuff = 20

    val crystalOreBuff = crystalOreCraft * percentBuff / 100
    val ironOreBuff = ironOreCraft * percentBuff / 100

    println("Бонус на добычу кристаллической руды " + crystalOreBuff.toInt())
    println("Бонус на добычу железной руды " + ironOreBuff.toInt())

}