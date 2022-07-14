package com.yp.demo.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    private String[] course;
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> sets;

    // 学生学多门课程
    private List<Course> courseList;

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test(){
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
