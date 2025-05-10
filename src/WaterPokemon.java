public class WaterPokemon extends Pokemon {
    private String waterType;
    private int waterPower;

    public WaterPokemon(String name, int level, int hp, double xp, String WaterType, int WaterPower) {
        super(name, level, hp, xp);
        this.waterType = WaterType;
        this.waterPower = WaterPower;
    }


    public void surf() {
        System.out.println(getName() + " uses Surf");
    }

            public void hydroPump () {
                System.out.println(getName() + " unleashes a blazing HydroPump!");
            }

            public String getWaterType () {
                return waterType;
            }

            public void setWaterType (String waterType){
                this.waterType = waterType;
            }

            public int getWaterPower () {
                return waterPower;
            }

            public void setWaterPower ( int waterPower){
                waterPower = waterPower;
            }
        }





