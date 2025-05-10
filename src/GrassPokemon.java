public class GrassPokemon extends Pokemon {
    private String grassType;
    private int grassPower;

    public GrassPokemon(String name, int level, int hp, double xp, String GrassType, int grassPower) {
        super(name, level, hp, xp);
        this.grassType = GrassType;
        this.grassPower = grassPower;
    }

    public void leafStorm() {
        System.out.println(getName() + " uses Leafstorm! ");
    }

    public void solarBeam() {
        System.out.println(getName() + " unleashes a blazing solarBeam!");


    }

    public String getGrassType() {
        return grassType;
    }

    public void setGrassType(String grassType) {
        this.grassType = grassType;
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }
}