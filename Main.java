public class Main {
    public static void main(String[] args) {
        // Testando a classe Pessoa e suas subclasses
        PFisica pessoaFisica = new PFisica("João", 30);
        pessoaFisica.mostrarNome();

        PJuridica pessoaJuridica = new PJuridica("Empresa XYZ", 5);
        pessoaJuridica.mostrarNome();

        // Testando a classe Animal e sua sobrecarga de métodos
        Animal animal = new Animal();
        animal.mostrarInfo("Gato", 2);  // Usando a primeira sobrecarga
        animal.mostrarInfo("Cachorro", 15.5);  // Usando a segunda sobrecarga
    }
}
