public class Course {
    //private Block block;
    private String name;
    private String teacher;
    private String classroom;

    public Course(String theName, String theTeach, String theRoom) {
        name = theName;
        teacher = theTeach;
        classroom = theRoom;
    }

    public String getName() {
        return name;
    }

    

    public String toString() {
        return name + " with " + teacher + " in " + classroom;
    }
 
}
