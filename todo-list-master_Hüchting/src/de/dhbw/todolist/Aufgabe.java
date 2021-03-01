package de.dhbw.todolist;

import java.time.LocalDateTime;

public class Aufgabe {
  private String description;
  private LocalDateTime todoUntil;

  Aufgabe(String description, LocalDateTime todoUntil){
    this.description=description;
    this.todoUntil=todoUntil;
  }


  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public LocalDateTime getTodoUntil()
  {
    return todoUntil;
  }

  public void setTodoUntil(LocalDateTime datum)
  {
    todoUntil = datum;

  }

  public String toString() {
    return "Die Aufgabe ''"+description+"'' muss bis zum "+todoUntil+" erledigt werden.";
  }
}

