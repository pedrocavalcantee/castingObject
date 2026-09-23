public class Principal {
    public static void main(String[] args) throws Exception {
        Cachorro meu_cachorro = new Cachorro();
        meu_cachorro.setNome("Spike");
        meu_cachorro.setIdade(8);
        meu_cachorro.setRaca("Rottweiller");

        Animal animal = meu_cachorro;
        animal.comer();
        meu_cachorro.latir();
    }
}
