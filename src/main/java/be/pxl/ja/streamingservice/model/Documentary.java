package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    private String topic;

    public Documentary(String title, Rating rating) {
        super(title, rating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        StringBuilder result = new StringBuilder("Playing Documentary ");
        result.append(this);
        if (topic != null) {
            result.append(" on ").append(topic);
        }
        System.out.println(result.toString());
    }

    @Override
    public void pause() {
        System.out.println("Pausing Documentary " + this);
    }
}
