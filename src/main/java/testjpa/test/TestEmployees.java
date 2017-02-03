package testjpa.test;

import java.util.List;
import testjpa.models.Employee;
import testjpa.util.DateParser;

// persistence jpa
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestEmployees{
   private static EntityManager manager;
   private static EntityManagerFactory factory;

   public static void main(String[] args){

      factory = Persistence.createEntityManagerFactory("application");
      manager = factory.createEntityManager();

      Employee employee = new Employee(2L, "Cleyber", "Rengifo f.", DateParser.parseDate("1994-12-30"));
      Employee employee2 = new Employee(3L, "Dubian", "Rengifo f.", DateParser.parseDate("1994-12-30"));
      Employee employee2 = new Employee(4L, "Example", "Example Example", DateParser.parseDate("2000-10-05"));
      manager.getTransaction().begin();
      manager.persist(employee);
      manager.persist(employee2);
      manager.persist(employee3);
      manager.getTransaction().commit();

      getAll();

   }

   public static void getAll(){
      List<Employee> employees = (List<Employee>) manager.createQuery("FROM Employee").getResultList();
      System.out.println("Employees" + employees.size());
      for (Employee employee : employees) {
         System.out.println(employee.toString());
      }
   }



}
