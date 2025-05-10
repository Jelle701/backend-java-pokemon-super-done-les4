//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmender",12,300,120,"Fire",80);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 12, 1000,  400,"electric",80);
        GrassPokemon seedot = new GrassPokemon("Seedot", 17,40,596,"Grass",80);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 13, 345,50,"Water",80);

        System.out.println();
        System.out.println("Next up is " + charmander.getName());
        charmander.flameThrower();
        charmander.inferno();
        charmander.levelUp();

        System.out.println();
        System.out.println("We start with " + pikachu.getName());
        pikachu.electroBall();
        pikachu.speaks();
        pikachu.thunder();

        System.out.println();
        System.out.println("Next up is " + seedot.getName());
        seedot.leafStorm();
        seedot.solarBeam();
        seedot.levelUp();

        System.out.println();
        System.out.println("Next up is " + squirtle.getName());
        System.out.println("This pokemon has type: " + squirtle.getType());
        squirtle.surf();
        squirtle.hydroPump();
    }
    }
