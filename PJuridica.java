public class PJuridica extends Pessoa {
    public PJuridica(String nome, int idade) {
        super(nome, idade);
    }

    // Método específico para PJuridica
    public void mostrarNome() {
        System.out.println("Nome: " + nome + " (PJuridica)");
    }
}
