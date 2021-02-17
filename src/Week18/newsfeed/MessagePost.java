package Week18.newsfeed;

public class MessagePost extends Post{
    private String message;

    public MessagePost(String author, String message) {
        super(author);
        this.message = message;
    }

    @Override
    public String display() {
        return super.getAuthor() + " " + super.getLikes() + " " + this.message;
    }
}
