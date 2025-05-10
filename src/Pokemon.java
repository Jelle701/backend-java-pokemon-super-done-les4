public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private double xp;
    private String type;

    public Pokemon(String name, int level, int hp, double xp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }

    public void eats() {
        System.out.println(name + " is eating.");
    }

    public void speaks() {
        System.out.println(name + " makes a sound!");
    }


    public void levelUp() {
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}