package de.dhbw.todolist;

import java.util.ArrayList;

public class Liste {
  private String name;
  private ArrayList<Aufgabe> tasks = new ArrayList<>();

  Liste(String name){
    this.name=name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public ArrayList<Aufgabe> getTasks()
  {
    return tasks;
  }

  public void addAufgabe(Aufgabe aufgabe)
  {
    tasks.add(aufgabe);
  }

  public String toString() {
    for (int i=0; i<tasks.size();i++){
      System.out.println(tasks.get(i));
    }
    return "";
  }
}

