package week11_enum;

import java.util.EnumSet;

public class Enum03 {
    enum BlueTeam{
        Top("Gragas"), Junggler("Olaf"), Mid("Orianna"), AdCarry("Vayne"), Supporter("Leona");

        String champion;
        BlueTeam(String champion){
            this.champion = champion;
        }
        public String getChampion(){
            return champion;
        }
    }

    public static void main(String[] args) {
        EnumSet<BlueTeam> noneOf = EnumSet.noneOf(BlueTeam.class);
        printEnumset(noneOf, "noneOf");
        EnumSet<BlueTeam> allOf = EnumSet.allOf(BlueTeam.class);
        printEnumset(allOf, "allOf");
        EnumSet<BlueTeam> of = EnumSet.of(BlueTeam.Top, BlueTeam.Junggler); //상체
        printEnumset(of, "of");
        EnumSet<BlueTeam> copyOf = EnumSet.copyOf(of); //상체 복사
        printEnumset(copyOf, "copyOf");
        EnumSet<BlueTeam> complementOf = EnumSet.complementOf(copyOf); //상체 제외
        printEnumset(complementOf, "complementOf");
        EnumSet<BlueTeam> range = EnumSet.range(BlueTeam.Junggler, BlueTeam.AdCarry);//딜러라인
        printEnumset(range, "range");
    }
    private static void printEnumset(EnumSet<BlueTeam> enumSet, String name) {
        System.out.println("--------------");
        System.out.println(name);
        for (BlueTeam blueTeam : enumSet) {
            System.out.println(blueTeam +" : "+blueTeam.champion);
        }
    }
}
