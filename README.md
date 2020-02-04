## Mars Weather Temperature Service API

#### Simple API to get Mars temperature information
#### More information are available at https://mars.nasa.gov/insight/weather/

#### Follow the steps to use this API:

1. Download the project
2. Deploy into Tomcat Server
3. Download [Advanced REST Client](https://install.advancedrestclient.com/install)
4. Choose Method GET
5. Now you can choose two requests forms:
    #### To get average temperature of the last seven available Sols (Martian Days)
    5.1. Request URL: http://localhost:8080/MarsWeatherServer/nasa/temperature
    #### To get average temperature of a particular SOL (ex: 418)
    5.2. Request URL: http://localhost:8080/MarsWeatherServer/nasa/temperature?sol=418

![no given SOL](https://user-images.githubusercontent.com/3952551/73750825-a16b6000-473c-11ea-921b-8136fb1555c0.PNG)

![sol 418](https://user-images.githubusercontent.com/3952551/73750946-df688400-473c-11ea-96c6-dba973259933.PNG)
