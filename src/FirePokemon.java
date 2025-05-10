public class FirePokemon extends Pokemon {
    private String FireType;
    private int FirePower;

    public FirePokemon(String name, int level, int hp, double xp, String FireType, int FirePower) {
        super(name, level, hp, xp);
        this.FireType = FireType;
        this.FirePower = FirePower;
    }

    public void flameThrower() {
        System.out.println(getName() + " uses Flamethrower! 🔥");
    }

    public void inferno() {
        System.out.println(getName() + " unleashes a blazing Inferno!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " roars with fiery might!");
    }

    public String getFireType() {
        return FireType;
    }

    public void setFireType(String fireType) {
        this.FireType = fireType;
    }

    public int getFirePower() {
        return FirePower;
    }

    public void setFirePower(int firePower) {
        this.FirePower = firePower;
    }
}









