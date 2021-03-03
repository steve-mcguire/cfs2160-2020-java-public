package Week18.newsfeed;

public class SocialNetwork {

    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();

        Post m1 = new MessagePost("Steve", "Hello, world. I love Java");
        ImagePost i1 = new ImagePost("Paula", "image.jpg");
        EventPost e1 = new EventPost("Steve", "25/04/2021", "uni",
                "Steve's party", 0);
        VideoPost v1 = new VideoPost("Steve", "1080hd",
                "https://www.youtube.com/watch?v=qn2tbftFjno" , 600);

        nf.addPost(m1);
        nf.addPost(i1);
        nf.addPost(e1);
        nf.addPost(v1);

        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.addComment("Great picture");
        i1.addComment("I love it there");
        i1.steveTestMethod();

        e1.like();
        e1.like();
        e1.like();
        e1.like();
        e1.like();
        e1.addComment("Can't wait for the party");

        v1.like();
        v1.like();


        System.out.println(nf.printNewsFeed());
    }
}
