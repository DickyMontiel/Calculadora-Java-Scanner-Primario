public class Operaciones{

    public int resultado;
    public double decimal;

    public int suma(int uno, int dos){
        this.resultado = uno + dos;
        return resultado;
    }

    public int resta(int uno, int dos){
        this.resultado = uno - dos;
        return resultado;
    }

    public int multiplicacion(int uno, int dos){
        this.resultado = uno * dos;
        return resultado;
    }

    public double division(int uno, int dos){
        this.decimal = uno / dos;
        return decimal;
    }

    public void todo(int uno, int dos){
        System.out.println("* Suma: " + suma(uno, dos));
        System.out.println("* Resta: " + resta(uno, dos));
        System.out.println("* Multiplicacion: " + multiplicacion(uno, dos));
        System.out.println("* Division: " + division(uno, dos));
    }
}