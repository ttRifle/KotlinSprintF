package org.example.lesson_2

fun main() {

    val numberCompanyWorkers = 50
    val numberCompanyInterns = 20
    val salaryWorker = 30000
    val salaryIntern = 20000

    val salaryCompanyWorkers = numberCompanyWorkers * salaryWorker
    val salaryCompany = salaryCompanyWorkers + salaryIntern * numberCompanyInterns
    val avarageCompanySalary = salaryCompany / (numberCompanyInterns + numberCompanyWorkers)

    println(salaryCompanyWorkers)
    println(salaryCompany)
    println(avarageCompanySalary)

}