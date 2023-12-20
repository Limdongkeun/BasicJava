package com.basic.basicjava.javaBasic.construct;

public class MethodInitMain3 {
  public static void main(String[] args) {
    
    MemberInit memberInit1 = new MemberInit();
    memberInit1.initMember("user1", 16, 90);
    
    MemberInit memberInit2 = new MemberInit();
    
    memberInit2.initMember("user2", 17, 80);
    
    MemberInit[] members = {memberInit1, memberInit2};
    
    for (MemberInit member : members) {
      System.out.println(member.name + " " + member.age + " " + member.grade);
    }
    
  }
}
