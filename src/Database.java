public class Database {

    private Superhero[] superheroListe; // Array til superhelte
    private int numHeroes; // Antal superhelte i databasen

    // konstruktør til at initialisere databasen med plads til 5 superhelte
    public Database(){
        superheroListe = new Superhero[5];
        Superhero p1 = new Superhero();
    }


}