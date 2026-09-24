import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        Cachorro meu_cachorro = new Cachorro();
        meu_cachorro.setNome("Spike");
        meu_cachorro.setIdade(8);
        meu_cachorro.setRaca("Rottweiller");

        Animal animal = meu_cachorro;
        animal.comer();
        meu_cachorro.latir();
        Cachorro outroCachorro = new Cachorro();
        outroCachorro.setNome("Xena");
        outroCachorro.setIdade(5);
        outroCachorro.setRaca("Husky Siberiano");

        Cachorro cachorroAleatorio = new Cachorro();
        cachorroAleatorio.setNome("Pandora");
        cachorroAleatorio.setIdade(12);
        cachorroAleatorio.setRaca("Vira-Lata");

        Animal animalDiferente = new Animal();
        animalDiferente.setNome("Pássaro");
        animalDiferente.setRaca("Bem-te-vi");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(meu_cachorro);
        animais.add(outroCachorro);
        animais.add(cachorroAleatorio);
        animais.add(animalDiferente);

       for (Animal animal1:animais) {
        if (animal1 instanceof Cachorro cachorro) {
            System.out.println(cachorro.latir());
            
        }
       }
    }
}
