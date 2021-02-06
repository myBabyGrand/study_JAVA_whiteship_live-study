package week08_interface;

public interface JoinMember {
    default void preJoin(){
        System.out.println("JoinMamber Prejoin");
    }
}
