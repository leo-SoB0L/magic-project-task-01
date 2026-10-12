package ru.mirea.sobolevle.magic;

public class Student {
    private String lastName;
    private String firstName;
    private String group;
    private Card card;

    public Student(String lastName, String firstName, String group, Card card) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.card = card;
    }

    public Student() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", group='" + group + '\'' +
                ", card=" + card +
                '}';
    }
}
