public class Animal {
    // Método com sobrecarga
    public void mostrarInfo(String nome, int idade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Outra sobrecarga do método com atributos diferentes
    public void mostrarInfo(String especie, double peso) {
        System.out.println("Espécie: " + especie);
        System.out.println("Peso: " + peso + " kg");
    }
}
