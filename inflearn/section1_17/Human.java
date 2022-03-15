package com.company.inflearn.section1_17;

public class Human {
    String name;
    int age;
    int speed;
    int x,y;
    //모든 사람의 이름, 나이, 속도, 현재위치를 확인한다.

    // 초기화 : 컨스트럭터 만들기
    public Human(String name, int age, int speed, int x, int y) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    //위에 constructor 이용
    public Human(String name, int age, int speed) {
        this(name,age,speed,0,0);
    }
    //위치 정보를 출력할 수 있는 함수 생성
    public String getLocation(){
        return "(" + x + ',' + y + ")";
    }
    protected void WhoAmI(){
        System.out.println("name : "+ name + ", age :" + age);
    }
}
