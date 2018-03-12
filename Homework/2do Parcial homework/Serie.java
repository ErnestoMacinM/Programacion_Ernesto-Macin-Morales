/***************
Serie.java
Ernesto Macin Morales
****************/
import javax.swing.*;
public class Serie{
  private String title;
  private String numberOfSeasons;
  private boolean entregado;
  private String category;
  private String creator;
}
public Serie(){
}
public Serie(String title, String creator){
  this.title = title;
  this.creator = creator;
}
publib Serie(String title, String creator, String numberOfSeasons, String category){
  this.title = title;
  this.creator = creator;
  this.numberOfSeasons = numberOfSeasons;
  this. category = category;
}
public String getTitle(){
  return this.title;
}
publicc String setTitle(){
 this.title = title;
}
public String getCategory(){
  return this.category;
}
public String setCategory(){
  this.category = category;
}
public String getCreator(){
  return this.category;
}
public String setcreator(){
  this.creator = creator;
}
