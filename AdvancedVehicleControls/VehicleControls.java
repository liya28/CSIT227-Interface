interface VehicleControls
{
    public void startEngine();
    public void stopEngine();
    public void turnOnHeadlights();
    public void turnOffHeadlights();
    public void honk();
}

class Car implements VehicleControls
{
    @Override
    public void startEngine()
    {
        System.out.println("Engine started.");
    }
    public void stopEngine()
    {
        System.out.println("Engine stopped.");
    }
    public void turnOnHeadlights()
    {
        System.out.println("Headlights turned on.");
    }
    public void turnOffHeadlights()
    {
        System.out.println("Headlights turned off.");
    }
    public void honk()
    {
        System.out.println("Horn sounds.");   
    }
}
