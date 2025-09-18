import java.util.Random;

public class JogoV2 {
  public static void main (String [] abc) throws Exception { // "Exceptions" não existe
    var p1 = new Personagem("Cleython", 5,10,2); // precisa passar nome porque o construtor existe
    var p2 = new Personagem("Jorge", 1,3,10);
    var p3 = new Personagem(); // construtor padrão
    var gerador = new Random();

    while(true) {
      //1: caçar, 2: comer, 3: dormir 
      var acaoP1 = gerador.nextInt(3) + 1;

      switch(acaoP1) {
        case 1:
          p1.cacar();
          break;
        case 2:
          p1.comer();
          break;
        case 3:
          p1.dormir();
          break;
      }

      System.out.println(p1);
      System.out.println("*****************************");
      Thread.sleep(2000); // deixei 2 segundos pra rodar mais rápido
    }
  }
}
