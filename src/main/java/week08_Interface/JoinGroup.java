package week08_Interface;

public interface JoinGroup {

    default void preJoin(){
        System.out.println("JoinGroup PreJoin");
    }
    default void afterJoin(){
        System.out.println("JoinGroup afterJoin");
    }
}
