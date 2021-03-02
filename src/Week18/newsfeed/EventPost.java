package Week18.newsfeed;

public class EventPost extends Post{
    private String date, location, eventTitle;
    private double cost;

    public EventPost(String author, String date, String location, String eventTitle, double cost) {
        super(author);
        this.date = date;
        this.location = location;
        this.eventTitle = eventTitle;
        this.cost = cost;
    }

    @Override
    public String display() {
        return "------------------\n" +
                super.getPostMeta() +
                "Title " + this.eventTitle + "\n" +
                "On " + this.date + "\n" +
                "Where " + this.location + "\n" +
                "Cost " + this.cost + "\n" +
                super.getCommentsString();
    }
}
