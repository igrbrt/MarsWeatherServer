## Mars Weather Temperature

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
