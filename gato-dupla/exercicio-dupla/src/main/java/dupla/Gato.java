package dupla;

public class Gato {
    int cr;
    boolean raca;
    String nome;
    int idade;
    char sexo;

    public Gato(String g) {
        this.nome = g;
    }

    public void miar() {
        if (idade >= 2) {
            System.out.println("Miuuu");
        } else {
            System.out.println("Mieeuuuu");
        }
    }
    
}

