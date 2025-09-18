public class Personagem {
  private String nome;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;

  // Construtores
  public Personagem(String nome, int energia, int fome, int sono) {
    this(energia, fome, sono);
    this.nome = nome;
  }

  public Personagem(String nome) {
    this();
    this.nome = nome;
  }

  public Personagem() {
    energia = 10;
    fome = 0;
    sono = 0;
  }

  public Personagem(int energia, int fome, int sono) {
    if (energia >= 0 && energia <= 10) {
      this.energia = energia;
    }
    if (fome >= 0 && fome <= 10) {
      this.fome = fome;
    }
    if (!(sono < 0 || sono > 10)) {
      this.sono = sono;
    }
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  // Métodos
  void cacar() {
    if (energia >= 2) {
      System.out.println(nome + " caçando...");
      energia -= 2;
    } else {
      System.out.println(nome + " sem energia para caçar...");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1, 10);
  }

  void comer() {
    if (fome >= 1) {
      System.out.printf("%s comendo...\n", nome);
      --fome;
      energia = energia < 10 ? energia + 1 : energia;
    } else {
      System.out.printf("%s sem fome...\n", nome);
    }
  }

  void dormir() {
    if (this.sono >= 1) {
      System.out.println(nome + " dormindo...");
      sono -= 1;
      if (energia < 10) {
        energia++;
      }
    } else {
      System.out.print(nome + " sem sono...\n");
    }
  }

  @Override
  public String toString() {
    return String.format("%s -> e: %d, f: %d, s: %d", nome, energia, fome, sono);
  }
}

