package com.kodilla.stream.ForumUser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int id, final String name, final char gender, final int yearOfBirth, final int monthOfBirth,
                     final int dayOfBirth, final int numberOfPosts){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.birthDate=LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts=numberOfPosts;
    }

    public int hashCode(){
        return birthDate.getYear() * 100 + birthDate.getMonthValue();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int checkAge(){
        Period difference = Period.between(birthDate, LocalDate.now());
        return difference.getYears();
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
