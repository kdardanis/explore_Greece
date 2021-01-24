package gr.haec.project;

public class Tour {

    private int id;
    private String description;
    private float price;
    private float duration;
    private String region;

    public Tour (int id, String description, float price, float duration, String region){
        this.id = id;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
