package de.dhbw.todolist;
import java.time.LocalDateTime;
import java.time.Month;
public class TodoList {


  public static void main(String[] args) {
    // Eine Todo-Liste erzeugen.
    Liste l1 = new Liste("Liste 1");
    // Namen für die Liste vergeben.
    l1.setName("Wichtige Aufgaben");

    LocalDateTime today = LocalDateTime.now();
    System.out.println(today);

    // Aufgaben hinzufügen.
    Aufgabe a1 = new Aufgabe("Hausaufgaben machen",LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10));
    System.out.println();
    //a1.setDescription("Im Lotto gewinnen");

    Aufgabe a2 = new Aufgabe("Einkaufen gehen",LocalDateTime.of(2016, Month.FEBRUARY, 1, 12, 10));
    //a2.setDescription("Dem Chef auf den Tisch ka...");

    Aufgabe a3 = new Aufgabe("Joggen gehen",LocalDateTime.of(2017, Month.FEBRUARY, 1, 5, 10));

    //Aufgabe a4 = new Aufgabe();
    //a4.setDescription("Job suchen");

    l1.addAufgabe(a1);
    l1.addAufgabe(a2);
    l1.addAufgabe(a3);

    //Liste ausgeben
    System.out.println(l1);


  }
}
