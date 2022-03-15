package com.company.inflearn.section1_17;

public class Main {

    public static void main(String[] args) {
	Human grandParent = new GrandParent("할머니", 75);
    Human Parent = new Parent("엄마",50);
    Human Child = new Child("딸",20);
    //배열에 담기

    Human[] humans = {grandParent,Parent, Child};
    for (Human human : humans){
        System.out.println(human.name+","+human.age+","+human.speed+","+ human.getLocation());
    }
    System.out.println("<활동 시작>");
    for(Human human:humans){
        if(human instanceof Walkable){
            ((Walkable) human).walk(1,1);
        }
        if (human instanceof Runnable){
            ((Runnable) human).run(2,2);
        }
        if (human instanceof Swimmable){
            ((Swimmable) human).swim(3,-1);
        }
    }
    }
}
