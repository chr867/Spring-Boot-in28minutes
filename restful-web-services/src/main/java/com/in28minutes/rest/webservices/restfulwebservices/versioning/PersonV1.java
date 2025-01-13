package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {
  private String name;

  public PersonV1(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
  public String toString(){
    return String.format("PersonV1[name=%s]", name);
  }
}
