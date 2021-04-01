/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.mavenproject3;

/**
 *
 * @Author Aphiwe Skeyi
 * Student no: 217157785
 */
public class Student {
   private String name, surname, course, stuNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.nSurname = Surname;
    }

   public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
   
   @Override
    public String toString() {
        return "The student{" + name + " " + surname + ", with student number=" + stuNumber + 
         ", is studying=" + course + "}";
    }
}
