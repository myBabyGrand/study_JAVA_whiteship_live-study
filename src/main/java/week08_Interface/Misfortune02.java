package week08_Interface;

interface Skills{
    default void q_skill(){

    }
    default void w_skill(){

    }
    default void e_skill(){

    };
    default void r_skill(){

    };
}

public class Misfortune02 implements Skills {
    @Override
    public void w_skill() {
        explainSkill("W","Strut");
    }
    public void explainSkill(String skillKey, String SkillName){
        System.out.println(this.getClass().getSimpleName()+"'s "+skillKey+" Skill is "+ SkillName);
    }
    public static void main(String[] args) {
        Misfortune02 misfortune = new Misfortune02();
        misfortune.w_skill();
    }
}
