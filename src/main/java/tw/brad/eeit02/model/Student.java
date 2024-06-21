package tw.brad.eeit02.model;

import jakarta.validation.constraints.NotNull;

import java.util.LinkedList;
import java.util.List;

public class Student {
    @NotNull
    private Integer id;
    private String name;
    private Double score;
    private Boolean gender;
    private List<String> courseList;
    private List<Bike> bikes;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {

        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public List<String> getCourseList() {
        if (courseList == null) courseList = new LinkedList<>();
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }
}
