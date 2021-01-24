package gr.haec.project;

public class tourPackage{
    private int id;
    private String name;
    private String description;
    private float price;
    private float duration;
    private char keyWords;

    public tourPackage (int id, String name, String description, float price, float duration, char keyWords){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.keyWords = keyWords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public char getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(char keyWords) {
        this.keyWords = keyWords;
    }
}

