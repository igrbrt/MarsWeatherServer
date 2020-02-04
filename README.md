## Mars Weather Temperature Service API

#### Simple API to get Mars temperature information
#### More information are available at https://mars.nasa.gov/insight/weather/

## Requirements
Java 1.8
Tomcat v7.0 Server (minimum)

#### Follow the steps to use this API:

1. Download the project

#### ====== CHOOSE ONE OF THESE STEPS TO RUN ======
2. Inside the release folder there is MarsWeatherServer.war
    2.1. Start Tomcat Server Application (bin/startup) 
    2.2. Open Console (http://localhost:8080/manager)
    2.3. Deploy MarsWeatherServer.war by console
    
![deploy](https://user-images.githubusercontent.com/3952551/73770268-e3a39a00-475a-11ea-8413-b942645b36a0.PNG)

#### OR

2. Open with Eclipse IDE
    2.1. Deploy into Tomcat Server Application by Eclipse
#### ==============================================

3. Download [Advanced REST Client](https://install.advancedrestclient.com/install)
4. Choose Method GET
5. Now you can try two requests forms:
    #### To get average temperature of the last seven available Sols (Martian Days)
    5.1. Request URL: http://localhost:8080/MarsWeatherServer/nasa/temperature
    #### To get average temperature of a particular SOL (ex: 418)
    5.2. Request URL: http://localhost:8080/MarsWeatherServer/nasa/temperature?sol=418

![no given SOL](https://user-images.githubusercontent.com/3952551/73750825-a16b6000-473c-11ea-921b-8136fb1555c0.PNG)

![sol 418](https://user-images.githubusercontent.com/3952551/73750946-df688400-473c-11ea-96c6-dba973259933.PNG)
