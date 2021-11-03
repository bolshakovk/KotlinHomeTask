import kotlin.math.*

class Dichotomy(a: Double, b: Double, val eps: Double) {
    private var a: Double = a
    private var b: Double = b

    private var c: Double = 0.0
    private var x: Double = 0.0

    fun f2(x:Double): Double {
        return x.pow(5.0) - x - 0.2
    }

    fun f1(x:Double): Double{
        return x + ln(x + 0.5) - 0.5
    }

    fun f3(x:Double):Double{
        return (2/3 * sin(x).pow(2.0)) - (3/4 * cos(x).pow(2.0))
    }

    fun calculateDichotomy() {
        while (abs(a-b) > eps){
            c = (a+b)/2
            if(f2(a) * f2(b) <= 0)
                b = c
            else
                a = c
            x = (a+b)/2
        }
        println("x =  $x, f(x) =  ${f1(x)} c = $c")
    }

}