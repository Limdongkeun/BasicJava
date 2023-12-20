package com.basic.basicjava.javaBasic.construct;

public class ConstructMain1 {
  public static void main(String[] args) {
    
    MemberConstruct memberConstruct1 = new MemberConstruct("user1", 16, 90);
    
    MemberConstruct memberConstruct2 = new MemberConstruct("user2", 17, 80);
    
    
    MemberConstruct[] members = {memberConstruct1, memberConstruct2};
    
    for (MemberConstruct member : members) {
      System.out.println(member.name + " " + member.age + " " + member.grade);
    }
  }
}
