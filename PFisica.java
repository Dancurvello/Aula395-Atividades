public class PFisica extends Pessoa {
    public PFisica(String nome, int idade) {
        super(nome, idade);
    }

    // Método específico para PFisica
    public void mostrarNome() {
        System.out.println("Bem-vindo, " + nome + "! (PFisica)");
    }
}
