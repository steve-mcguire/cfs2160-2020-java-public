package Week18.newsfeed;

public class VideoPost extends Post{
    private String resolution, videoUrl;
    private int lengthSeconds;


    public VideoPost(String author, String resolution, String videoUrl, int lengthSeconds) {
        super(author);
        this.resolution = resolution;
        this.videoUrl = videoUrl;
        this.lengthSeconds = lengthSeconds;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                this.videoUrl + "\n" +
                this.resolution + "\n" +
                this.lengthSeconds + "\n" +
                super.getCommentsString();
    }
}
