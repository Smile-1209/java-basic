package dev.study.옵저버.basic;


import java.util.ArrayList;
import java.util.List;

/**
 * 기본 옵저버 패턴 구현
 *  - 뉴스 에이전시(주체)가 구독자(옵저버) 들에게 새 뉴스가 나왔을 때 알리는 시스템
 */

interface Observer{
    void update(String message);
}

class NewsAgency{
    private final List<Observer> observers = new ArrayList<>();

    //옵저버 등록
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    //옵저버 제거
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    //상태 변경 알림
    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}

class NewsSubscriber implements Observer{

    private final String name;

    public NewsSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}



public class Main
{
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsSubscriber 홍길동 = new NewsSubscriber("홀길동");
        NewsSubscriber 김유신 = new NewsSubscriber("김유신");

        newsAgency.addObserver(홍길동);
        newsAgency.addObserver(홍길동);

        newsAgency.notifyObservers("새로운 뉴스입니다.");
        newsAgency.deleteObserver(홍길동);
        newsAgency.notifyObservers("방금 들어온 뉴스입니다.");


    }
}
