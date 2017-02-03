package testjpa.models;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{

   private static final long serialVersionUID = 1l;

   @Id
   @Column(name = "CODE")
   private long cod;

   @Column(name = "NAME")
   private String name;

   @Column(name = "LASTNAMES")
   private String lastNames;

   @Column(name = "BIRTHDATE")
   private Date birthdate;

   public Employee(){
   }

   public Employee(long cod, String name, String lastNames, Date birthdate){
      this.cod = cod;
      this.name = name;
      this.lastNames = lastNames;
      this.birthdate = birthdate;
   }

   public void setCod(long cod){
      this.cod = cod;
   }

   public long getCod(){
      return cod;
   }

   public void setName(String name){
      this.name = name;
   }

   public String getName(){
      return name;
   }

   public void setLastNames(String lastNames){
      this.lastNames = lastNames;
   }

   public String getLastNames(){
      return lastNames;
   }

   public void setBirthdate(Date birthdate){
      this.birthdate = birthdate;
   }

   public Date getBirthdate(){
      return birthdate;
   }

   @Override
   public String toString(){
      return "Employee [Code: " + cod + ", Last Names: " + lastNames + ", Name: " + name + ", Birthdate: " + birthdate + "]";
   }

}
