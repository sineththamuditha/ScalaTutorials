object question01 {


    def main(args: Array[String]) = {
        var (k,i,j) = (2,2,2)
        var (m,n) = (5,5)
        var (f,g) = (12.0,4.0)
        var c = 'X'
        printf("a) k + 12 * m = %d\n", k+12*m)
        printf("b) m / j = %d\n", m/j)
        //printf("c) n % j = %d\n", n%j)
        printf("d) m / j * j = %d\n", m/j*j)
        printf("e) f + 10 * 5 + g = %.2f\n", f+10*5+g)
        printf("f) ++i * n = %d\n", (i+1)*n)
    }
}