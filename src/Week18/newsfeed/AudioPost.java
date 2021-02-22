package Week18.newsfeed;

public class AudioPost extends Post{
    private String audioFile;

    public AudioPost(String author, String audioFile) {
        super(author);
        this.audioFile = audioFile;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                this.audioFile + "\n" +
                super.getCommentsString();
    }
}
