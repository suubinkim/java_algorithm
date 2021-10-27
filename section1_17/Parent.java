package com.company.section1_17;

public class Parent extends Human implements Walkable, Runnable{
    //기본 위치는 0 이므로 x,y뺀거 선택
    //부모님의 기본속도는 3이다. 파라미터 줄 필요x
    public Parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void walk(int x, int y) {
        //걷는 속도 프린트 한 후 이동한 위치 프린트
        WhoAmI();
        System.out.println("walk speed: "+speed);
        this.x=x;
        this.y=y;
        System.out.println("Walked to: "+getLocation());
    }

    @Override
    public void run(int x, int y) {
        WhoAmI();
        System.out.println("run speed: "+(speed+2));
        this.x=x;
        this.y=y;
        System.out.println("ran to: "+getLocation());
    }
}
