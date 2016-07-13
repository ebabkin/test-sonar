package hello;

public class Greeting {

    private final long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String incrementContentWithLenght(String newcontent){
   String noused = "notused";
        String _nullString = null;
        content = content + newcontent.length() + newcontent + _nullString.length();
        return content; }

    public String notUsedMethod(String newcontent){
        return null;
    }

    public String incrementContentWithLenght2(String newcontent) {
        String noused = "notused";
        String _nullString = null;
        content = content + newcontent.length() + newcontent + _nullString.length();
        return content;
    }
}
