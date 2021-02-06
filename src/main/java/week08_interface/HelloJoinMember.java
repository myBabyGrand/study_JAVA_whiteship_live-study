package week08_interface;

public class HelloJoinMember implements JoinGroup, JoinMember{

    @Override
    public void preJoin() {
        JoinGroup.super.preJoin();
        System.out.println("=============");
        JoinMember.super.preJoin();
    }

    @Override
    public void afterJoin() {

    }

    public static void main(String[] args) {
        HelloJoinMember helloJoinMember = new HelloJoinMember();
        helloJoinMember.preJoin();

    }
}
