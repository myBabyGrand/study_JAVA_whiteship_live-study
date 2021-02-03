package week08_Interface;

public interface JoinMember {
    default void preJoin(){
        System.out.println("JoinMamber Prejoin");
    }
}
