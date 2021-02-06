package week08_interface;

interface Mid{
    void Nuking();
}
interface Juggler{
    void Hunting();
}
interface MidJunggleAbleChampion extends Mid, Juggler{//다중 상속
    void Carry();
}
public class Diana implements MidJunggleAbleChampion{
    @Override
    public void Nuking() {
        System.out.println(this.getClass().getSimpleName()+" can Nuke (kill enermy in very short time)");
    }
    @Override
    public void Hunting() {
        System.out.println(this.getClass().getSimpleName()+" can Hunt a Monster");
    }
    @Override
    public void Carry() {
        System.out.println(this.getClass().getSimpleName()+" can Carry the game");
    }
    public static void main(String[] args) {
        Diana diana = new Diana();
        diana.Nuking();
        diana.Hunting();
        diana.Carry();
    }
}
