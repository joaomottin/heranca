import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 12");

        Gato gato = new Gato("Felix", "miau");
        Cachorro dog = new Cachorro("Pluto", "Auau", "Testado");

        System.out.println(gato + "\n");
        System.out.println(dog + "\n");

        Animal gato2 = new Gato("Garfield", "Lasanha");
        Animal dog2 = new Cachorro("Laica", "nenhum", "Falha");

        System.out.println(gato2 + "\n");
        System.out.println(dog2 + "\n");

        List<Animal> animais = new ArrayList<>();

        animais.add(dog);
        animais.add(dog2);
        animais.add(gato);
        animais.add(gato2);

        //animais.forEach(System.out::println);

        for (Animal animal : animais) {
            System.out.println(animal.emitirSom());
            if (animal instanceof Cachorro) {
                Cachorro newDog = (Cachorro) animal;
                System.out.println(newDog.abanarRabo());
            }
        }

        // Animal teste = new Animal("Teste", "Teste");

        // System.out.println("Gato: " + gato.abanarRabo());
















    }
}
