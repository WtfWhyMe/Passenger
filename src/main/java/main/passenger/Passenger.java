package main.passenger;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age){
        this.title = title;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public void verifyTitle(){
        if (title.equalsIgnoreCase("mrs")
            || title.equalsIgnoreCase("mr")
            || title.equalsIgnoreCase("ms")) {
           // throw new IllegalArgumentException("Invalid title");
        }   else {
            throw new IllegalArgumentException("Invalid title");
        }
    }
    public void verifyName(){
        int length = name.length();
        if(length < 3){
            throw new IllegalArgumentException("Invalid name. Too short");
        }
    }
    public void verifyId(){
        int length = id.length();
        if(length < 10){
            throw new IllegalArgumentException("Invalid name. Too short");
        }
    }
    public void verifyPhone(){
        int length = phone.length();
        if(length < 10){
            throw new IllegalArgumentException("Invalid name. Too short");
        }
    }
    public void verifyAge(){
        if(age < 17){
            throw new IllegalArgumentException("Invalid age. Too young");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
