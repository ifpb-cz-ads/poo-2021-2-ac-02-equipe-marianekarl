import java.lang.Math;
class CBBAtividadePratica4 {
  public static void main(String[] args) {
    int metros = 30;
    int elevado = 3;
       int valor=100;
         double resultado = Cubico(metros, elevado);
          double total = resultado * valor;
    System.out.println("Orçamento é " + total);
  }
      static double Cubico (int num, int pow){
        return Math.pow(num,pow);
    }
}