package entities;

import java.util.ArrayList;

public class Boss implements Subject {

    private static Boss instance;
    private static Boolean state;
    private static int life = 10;
    private static ArrayList<Observer> observers = new ArrayList();

    private Boss() {

    }

    public synchronized static Boss getInstance() {
        if (instance == null) {
            instance = new Boss();
        }
        return instance;
    }

    public static int getLife() {
        return life;
    }

    public static void setLife(int life) {
        Boss.life = life;
    }

    public static Boolean getState() {
        return state;
    }

    public static void setState(Boolean state) {
        Boss.state = state;
        if(state == true){
            nextBoss();
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.updateState();
        }

    }

    @Override
    public void rmObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public static void changeState() {
        Boss.state = false;
    }

    public static void nextBoss() {
        Boss.life = 10;
        System.out.println();
        System.out.println("Boss alive");
        System.out.println();
    }

}
