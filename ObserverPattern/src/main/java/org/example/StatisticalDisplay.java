package org.example;

public class StatisticalDisplay implements Observer, DisplayElement{
        private float temperature;
        private float humidity;
        private Subject weatherData;

        public StatisticalDisplay(Subject weatherData){
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
        }

        public void update(float temperature, float humidity, float pressure){
            this.temperature = temperature;
            this.humidity = humidity;
            display();
        }

        //Implement here the needed mention

        /*
        public float averageTemp(){
            float average = 0;
             for (int i =0; i < weatherData.getObservers().size(); i++){
                 System.out.println("STATISCIAL : " + weatherData.getObservers().get(i).toString());

             }
             return 1.2f;
        }
        */


        public void display(){
            System.out.println("Avg/Max/Min temperature");
        }


}
