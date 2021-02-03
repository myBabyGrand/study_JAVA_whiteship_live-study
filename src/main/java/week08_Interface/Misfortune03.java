package week08_Interface;

interface QSkill{
    default void print(String champion){
        System.out.println(champion+"'s Q Skill interface");
    }
}
interface WSkill{
    default void print(String champion){
        System.out.println(champion+"'s W Skill interface");
    }
}
public class Misfortune03 implements QSkill, WSkill{

    @Override
    public void print(String champion) {
        QSkill.super.print(champion);
        WSkill.super.print(champion);
    }

    public static void main(String[] args) {
        Misfortune03 misfortune = new Misfortune03();
        misfortune.print(misfortune.getClass().getSimpleName());
    }
}
