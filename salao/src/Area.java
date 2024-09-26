import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Area  {
    
    private double salarioBase;
    private String area;

    public Area(String area, double salarioBase) {
        this.area = area;
        this.salarioBase = salarioBase;
    }

    public String getArea() {
        return area;
    }

    public double getSalarioBase() {
        return salarioBase;

        @Override
        public String toString() {
            return "Área: " + ", Salário Base: R$" + salarioBase;
        }
        
    }
}
