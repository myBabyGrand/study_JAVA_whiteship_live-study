package week02_dataType;

public class DocumentTest {

    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("doc");
        Document d3 = new Document();
        Document d4 = new Document("excel!");
        Document d5 = new Document();
    }

}
class Document{
    static int count = 0;
    String name;
    Document(){
        this("unknown"+ ++count);
    }
    Document (String name){
        this.name = name;
        System.out.println(name + " Document has created");
    }

}