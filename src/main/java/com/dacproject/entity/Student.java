package com.dacproject.entity;

public class Student {
int student_id;
String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getStudent_email() {
	return student_email;
}
public void setStudent_email(String student_email) {
	this.student_email = student_email;
}
public int getStudent_phone() {
	return student_phone;
}
public void setStudent_phone(int student_phone) {
	this.student_phone = student_phone;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
String student_name;
String student_email;
int student_phone;
int course_id;

}
