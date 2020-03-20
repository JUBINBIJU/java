import java.util.Scanner;

class FuelMonitor
{
    private int tank_capacity , efficiency , fuel_in_tank;

    FuelMonitor(int tc,int eff,int ft)
    {
        tank_capacity=tc;
        efficiency=eff;
        fuel_in_tank=ft;
    }
    FuelMonitor(int tc,int eff)
    {
        this(tc,eff,0);
    }
    FuelMonitor()
    {
        this(65,12);
    }

    int getTankCapacity()
    {
        return tank_capacity;
    }
    int getEfficiency()
    {
        return efficiency;
    }

    void getData()
    {
        System.out.println(" Fuel in tank : "+fuel_in_tank +"\n Drive Distance : "+this.driveDistance()+"\n Remaining space : "+this.addFuel());
    }
    
    void setFuel(int f)
    {
        fuel_in_tank=f;
    }

    int addFuel()
    {
        return tank_capacity-fuel_in_tank;
    }

    int driveDistance()
    {
        return fuel_in_tank*efficiency;
    }

}

public class FuelMonitorDemo
{
    public static void main(String args[])
    {
        FuelMonitor f1=new FuelMonitor(50,16);
        f1.setFuel(10);
        f1.getData();
    }
}