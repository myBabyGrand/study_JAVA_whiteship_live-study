package week11_enum;

public class Enum02 {
    static String comment1 = "s main position is ";
    static String comment2 = ", range is ";
    enum Ashe{
        Name("Ashe"), Position("Adcarry"), Range(600);

        String message;
        Ashe(String msg){
            this.message = msg;
        }

        public String getMessage() {
            return message;
        }
        int no;
        Ashe(int no){
            this.no = no;
        }
        public int getNo(){
            return no;
        }
    }


    public static void main(String[] args) {

        printNonTypeSafety("Ashe");
        System.out.println("------");
        printTypeSafety("Ashe", "AdCarry", 600);
        System.out.println("------");
        printTypeSafetyWithEnum();

    }

    private static void printTypeSafetyWithEnum() {
        System.out.println(Ashe.Name.getMessage()
                          +comment1
                          +Ashe.Position.getMessage()
                          +comment2
                          +Ashe.Range.getNo());
    }


    private static void printNonTypeSafety(String champion) {
        System.out.println(champion
                          +comment1
                          +"AdCarry"
                          +comment2
                          +600);
    }

    private static void printTypeSafety(String champion, String position, int range) {
        System.out.println(champion
                          +comment1
                          +position
                          +comment2
                          +range);
    }
}
