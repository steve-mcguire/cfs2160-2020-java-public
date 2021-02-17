package Week18.newsfeed;

public class MessagePost extends Post{
    private String message;

    public MessagePost(String author, String message) {
        super(author);
        this.message = message;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                this.message + "\n" +
                super.getCommentsString();
    }
}
