package com.example.sprHib.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="restDemo")
@Entity
public class Resturant {

public String getResturantName() {
return resturantName;
}
public void setResturantName(String resturantName) {
this.resturantName = resturantName;
}
public int getResturantId() {
return resturantId;
}
public void setResturantId(int resturantId) {
this.resturantId = resturantId;
}
public String getLocation() {
return location;
}
public void setLocation(String location) {
this.location = location;
}
public float getRating() {
return rating;
}
public void setRating(float rating) {
this.rating = rating;
}
String resturantName;
@Id
int resturantId;
String location;
float rating;

}