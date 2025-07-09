package P5;

public class Document implements Cloneable {
    protected String title;
    protected  String body;
    protected  String author;

    public Document(String title,String body,String author) {
        this.title = title;
        this.body = body;
        this.author = author;
    }

    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    String getTitle(){
        return title;
    }
    String getBody(){
        return body;
    }
    String getAuthor(){
        return author;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}