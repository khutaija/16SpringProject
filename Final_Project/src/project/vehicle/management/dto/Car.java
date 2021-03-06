package project.vehicle.management.dto;

/**
 * 
 * 
 *
 */

public class Car
{

    private String VIN;
    private String dealerName;
    private int year;
    private String make;
    private String condition;
    private String model;
    private String trim;
    private String type;
    private double price;

    public Car(String VIN, String dealerName, String condition, int year, String make, String model, String trim,
            String type, double price)
    {
        this.VIN = VIN;
        this.dealerName = dealerName;
        this.year = year;
        this.make = make;
        this.condition = condition;
        this.model = model;
        this.trim = trim;
        this.type = type;
        this.price = price;
    }

    public String getVIN()
    {
        return VIN;
    }

    public void setVIN(String VIN)
    {
        this.VIN = VIN;
    }

    public String getDealerName()
    {
        return dealerName;
    }

    public void setDealerName(String dealerName)
    {
        this.dealerName = dealerName;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getTrim()
    {
        return trim;
    }

    public void setTrim(String trim)
    {
        this.trim = trim;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

}
