package homework_3_sealed.task_2

import homework_3.task_2.Expr
import homework_3.task_2.Num
import homework_3.task_2.Sum

sealed class Task_1 {
    @Throws(IllegalAccessException::class)
    fun eval(expr: Expr?): Int {
        if (expr is Num) {
            return (expr as Num).value
        }
        if (expr is Sum) {
            val sum = expr as Sum
            return eval(sum.left) + eval(sum.right)
        }
        throw IllegalAccessException("Unknow expression")
    }
}
