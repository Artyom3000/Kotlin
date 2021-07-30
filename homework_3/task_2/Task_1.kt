package homework_3.task_2

class Task_1 {
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
