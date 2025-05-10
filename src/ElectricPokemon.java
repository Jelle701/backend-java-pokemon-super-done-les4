public class ElectricPokemon extends Pokemon {
    private String electricType;
    private int electricPower;

    public ElectricPokemon(String name, int level, int hp, double xp, String electricType, int electricPower) {
        super(name, level, hp, xp);
        this.electricType = electricType;
        this.electricPower = electricPower;
    }

        public void electroBall () {
            System.out.println(getName() + " uses electroBall! ");
        }

        public void thunder () {
            System.out.println(getName() + " unleashes a blazing thunder!");
        }

        public String getElectricType () {
            return electricType;
        }

        public void setElectricType (String electricType){
            this.electricType = electricType;
        }

        public int getElectricPower () {
            return electricPower;
        }

        public void setElectricPower ( int electricPower){
            this.electricPower = electricPower;
        }

    }







