package com.github.chen0040.commons.messages;


import lombok.Getter;
import lombok.Setter;


/**
 * Created by xschen on 14/9/2017.
 */
@Getter
@Setter
public class Greeting {
   private String name;
   public Greeting(String name) {
      this.name = name;
   }
}
