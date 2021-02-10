package week11_enum;

public class Enum01 {
    enum SolarSystem {
        Sun(0), Mecury(10), Venus(20), Earth(30), Mars(40),
        Jupiter(50), Saturn(60), Uranus(70), Neptune(80),
        Moon(31);

        private final int value;
        SolarSystem(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public static void main(String[] args) {
        System.out.println(SolarSystem.Earth+" : "+SolarSystem.Earth.getValue());
        System.out.println("------");
        SolarSystem [] arr = SolarSystem.values();
        for (SolarSystem solarSystem : arr) {
            System.out.println(solarSystem);
        }
        System.out.println("------");
        System.out.println(SolarSystem.valueOf("Earth"));
        System.out.println(SolarSystem.valueOf("Earth").value);
        System.out.println(SolarSystem.Moon.ordinal());

   }
}
