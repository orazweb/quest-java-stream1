import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shield {

    private static List<Hero> heroes;
//    private List<Hero> ;

    public static void main(String[] args) {

        heroes = new ArrayList<>();
        heroes.add(new Hero("Black Widow", 34, false));
        heroes.add(new Hero("Captain America", 100, false));
        heroes.add(new Hero("Vision", 3, true));
        heroes.add(new Hero("Iron Man", 48, false));
        heroes.add(new Hero("Scarlet Witch", 29, true));
        heroes.add(new Hero("Thor", 1501, false));
        heroes.add(new Hero("Spider-Man", 18, false));
        heroes.add(new Hero("Hulk", 49, true));
        heroes.add(new Hero("Doctor Strange", 42, false));

  /* phase preparatoire de test pour recupèrer
   * les valeurs de l'objet d'une classe dans une liste d'objet
   * et vérifier le resultat escompté (liste des vieux de + de 60 balles)
   */
//        System.out.println(heroes.get(0).getAge());

//        for (Hero hero: heroes) {
//            System.out.println(hero.getAge());
//        }

//        for (Hero hero: heroes) {
//            System.out.print(hero.getAge() > 60 ? hero.getName() + " " + hero.getAge() + " ans \n" : "");
//        }

        List<Hero> elders;
        // TODO 1 : filter heroes in order to found heroes older than 59
        elders = heroes.stream()
                .filter(hero -> hero.getAge() > 60)
                .collect(Collectors.toList());

        System.out.println("\nElders:");
        for (Hero elder : elders) {
            System.out.println(elder.getName());
        }

        List<Hero> intolerants;
       // TODO 2 : filter heroes in order to found heroes that are gluten intolerants
        intolerants = heroes.stream()
                .filter(hero -> hero.isGlutenIntolerant())
                .collect(Collectors.toList());
        System.out.println("\nGluten intolerants:");
        for (Hero intolerant : intolerants) {
            System.out.println(intolerant.getName());
        }
    }
}
