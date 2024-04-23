package org.example.lesson_2

fun main(){
    val numberOfPermStaff= 50
    val salaryOfPermStaff = 30000
    // Расходы на выплату зарплаты постоянных сотрудников
    val payrollExpensePerm: Int = numberOfPermStaff * salaryOfPermStaff
    println(payrollExpensePerm)

    val numberOfInternStaff= 30
    val salaryOfInternStaff = 20000

    // Общие расходы по ЗП после прихода стажеров
    val payrollExpenseTotal: Int = payrollExpensePerm + (numberOfInternStaff * salaryOfInternStaff)
    println(payrollExpenseTotal)

    // Средняя ЗП одного сотрудника после устройства стажеров
    val salaryAverage: Int = payrollExpenseTotal / (numberOfPermStaff + numberOfInternStaff)
    println(salaryAverage)
}