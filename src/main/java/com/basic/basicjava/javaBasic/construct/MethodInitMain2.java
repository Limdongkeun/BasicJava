package com.basic.basicjava.javaBasic.construct;

public class MethodInitMain2 {
  public static void main(String[] args) {
    
    MemberInit memberInit1 = new MemberInit();
    initMember(memberInit1, "user1", 16, 90);
    
    MemberInit memberInit2 = new MemberInit();
    initMember(memberInit2, "user2", 17, 80);
    
    
    MemberInit[] members = {memberInit1, memberInit2};
    
    for (MemberInit member : members) {
      System.out.println(member.name + " " + member.age + " " + member.grade);
    }
    
  }
  
  static void initMember(MemberInit member, String name, int age, int grade) {
    member.name = name;
    member.age = age;
    member.grade = grade;
  }
}
