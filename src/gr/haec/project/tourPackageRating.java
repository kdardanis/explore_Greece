package gr.haec.project;

public class tourPackageRating {
    private int id;
    private float score;
    private String comments;

    public tourPackageRating (int id, float score, String comments){
        this.id = id;
        this.score = score;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
