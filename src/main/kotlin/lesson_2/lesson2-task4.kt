package org.example.lesson_2

fun main() {

    val crystalOreCraft = 7
    val ironOreCraft = 11
    val percentBuff = 0.2

    val crystalOreBuff = crystalOreCraft * percentBuff
    val ironOreBuff = ironOreCraft * percentBuff

    println("Бонус на добычу кристаллической руды " + crystalOreBuff.toInt())
    println("Бонус на добычу железной руды " + ironOreBuff.toInt())

}