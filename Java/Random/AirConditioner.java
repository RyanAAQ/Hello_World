public class AirConditioner{
    
    boolean isOn;
    int temperature;
    
    public AirConditioner(int defaultTemperature){
    isOn = false;
    temperature = defaultTemperature;
    
    }
    
    public void powerOn(){
    isOn = true;
    }
    
    public void powerOff(){
    isOn = false
    }
    
    public void coolDown(){
    if(isOn && temperature > 16)
    temperature -= 1;
}

    public void heatUp(){
    if(isOn && temperature < 30)
    temperature += 1;
    }
    
    public static boolean checkPower(){
        return isOn;
    }
    
    public static int getTemperature(){
        return temperature;
    }
}
