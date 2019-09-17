package entities;

public interface Subject {
    public void notifyObserver();
    public void rmObserver(Observer observer);
    public void addObserver(Observer observer);
    
}
