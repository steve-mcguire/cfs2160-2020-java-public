package Week18.newsfeed;

public class ImagePost extends Post{
    private String imageName;

    public ImagePost(String author, String imageName) {
        super(author);
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                this.imageName + "\n" +
                super.getCommentsString();

    }
}
