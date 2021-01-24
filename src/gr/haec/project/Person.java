package gr.haec.project;

public class Person{

    private int id;
    private String name;
    private String username;
    private String email;

    public Person (int id, String name, String username, String email){
    this.id = id;
    this.name = name;
    this.username = username;
    this.email = email;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Hello i am %s %s,i have an id , and my email is  .", this.name, this.username, this.id, this.email);

    }
    }

