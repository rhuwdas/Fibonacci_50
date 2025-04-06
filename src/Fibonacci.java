public class Fibonacci {
    public long numeroActual;
    public long numeroA;
    public long numeroB;
    public Fibonacci() {
        numeroActual = 0;
        numeroA = 0;
        numeroB = 1;
    }
    public String fibonacci50N() {
        String cadenaFibonacci = "1=0"+"\n";
        for (int i = 1; i < 50; i++) {
            numeroActual = numeroA+numeroB;
            numeroB = numeroA;
            numeroA = numeroActual ;
            cadenaFibonacci += ""+(i+1)+"-->"+numeroActual+"\n";
        }
        return cadenaFibonacci;
    }
}
