public class Student {

    private String name;
    private int points;
    private static int totalPoints = 0;
    private static int greatestPoints = 0;

    public Student(String nam) {
        name = nam;
        points = 0;
    }

    public void addPoints(int point) {
        points += point;
        totalPoints += point;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }
 
    public static int getGreatestPoints() {
        return greatestPoints;
    }
 
    public static String classInfo() {
        return "Total points earned by all students: " + totalPoints + "\nMost points earned by any student: " + greatestPoints;
    }
 
    public String studentInfo() {
        String str = "Student: " + name;
        str += "\nStudent's Points: " + points;
        return str;
    }
 }

