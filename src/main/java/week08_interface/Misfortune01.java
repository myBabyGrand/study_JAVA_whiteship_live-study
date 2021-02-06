package week08_interface;

interface Skill {
    void q_skill();
    void w_skill();
    void e_skill();
    void r_skill();
}
abstract class Skill_Class implements Skill{

    @Override
    public void q_skill() {}
    @Override
    public void w_skill() {}
    @Override
    public void e_skill() {}
    @Override
    public void r_skill() {}
}

public class Misfortune01 extends Skill_Class{
    @Override
    public void q_skill() {
        explainSkill("Q","Double Up");
    }
    public void explainSkill(String skillKey, String SkillName){
        System.out.println(this.getClass().getSimpleName()+"'s "+skillKey+" Skill is "+ SkillName);
    }
    public static void main(String[] args) {
        Misfortune01 misfortune = new Misfortune01();
        misfortune.q_skill();
    }
}
