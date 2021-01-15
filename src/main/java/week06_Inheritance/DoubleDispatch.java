package week06_Inheritance;

public class DoubleDispatch {
    public static void main(String[] args) {
        Game game = new Game();
        game.play(new Gallaxy());
    }
}

interface SmartPhone{
    void game(Game game);
}

class Iphone implements SmartPhone{
    @Override
    public void game(Game game) {
        System.out.println("iphone play [" + this.getClass().getSimpleName() + "]");
    }
}

class Gallaxy implements SmartPhone{
    @Override
    public void game(Game game) {
        System.out.println("gallaxy play [" + this.getClass().getSimpleName() + "]");
    }
}

class Game {
    public void play(SmartPhone phone) {
        phone.game(this);
    }
}


