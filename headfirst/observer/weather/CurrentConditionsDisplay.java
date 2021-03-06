package headfirst.observer.weather;


import java.util.Observable;
import java.util.Observer;

 
public class CurrentConditionsDisplay implements Observer,DisplayElement {
Observable observable;
  private float pressure;
  private float temperature;
  private float humidity;

 
 public CurrentConditionsDisplay(Observable observable) {
  this.observable = observable;
  observable.addObserver(this);
 }
 
 public void update(Observable obs,Object arg) {
   if(obs instanceof WeatherData){
     WeatherData weatherData = (WeatherData)obs;
  this.temperature = weatherData.getTemperature();
  this.humidity = weatherData.getHumidity();
  this.pressure =weatherData.getPressure();
  
  display();
   }}
 
 public void display()
 {
  System.out.println("현재 온도 : " + temperature + " , 현재 습도 : " + humidity + ", 현재 기압 : "+pressure);
 }
}
