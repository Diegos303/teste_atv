import java.util.Random;

public class JogoV2 {
  public static void main(String[] abc) throws InterruptedException {
    var p1 = new Personagem(5, 10, 2);
    var p2 = new Personagem(1, 3, 10);
    var p3 = new Personagem();

    var gerador = new Random();

    p1.setNome("Cleython");
    p2.setNome("Jorge");
    p3.setNome("Maria");

    while (true) {
      // 1: caçar, 2: comer, 3: dormir
      var acaoP1 = gerador.nextInt(3) + 1;

      switch (acaoP1) {
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
      System.out.println(
