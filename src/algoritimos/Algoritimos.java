
package algoritimos;

public class Algoritimos {

    public static void Quadrado (double n){
        double r = n * n;
    }
    
    public static double metade(double a){
        double r = a/2;
        return r;
    }
    
    public static void main(String[] args) {
        Quadrado(15);
        
        double raiz;
        raiz = Math.sqrt(15);
        double resultado;
        resultado = metade(15);
        
        System.out.println("A raiz é " + raiz);
    }
    
    
}
