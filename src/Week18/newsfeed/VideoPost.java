package Week18.newsfeed;

public class VideoPost extends Post{
    private String videoUrl;

    public VideoPost(String author, String videoUrl) {
        super(author);
        this.videoUrl = videoUrl;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                this.videoUrl + "\n" +
                super.getCommentsString();
    }
}
