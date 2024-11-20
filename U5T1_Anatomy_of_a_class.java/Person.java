public class Person {
    String firstName;
    String lastName;
    int meet;

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
        meet = 0;
    }

    public String getFirstName() {return firstName;}
    public int getMeetings() {return meet;}
    public void setMeetings(int newVal) {meet=newVal;}

    public void meet(Person otherPerson) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + otherPerson.getFirstName());
        meet++;
        otherPerson.setMeetings(otherPerson.getMeetings()+1);
    }


}
