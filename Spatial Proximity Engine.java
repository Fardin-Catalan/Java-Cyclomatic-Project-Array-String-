import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] planets={"Mercury","Venus","Earth","Mars","Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        System.out.print("Enter planet name:");
        String planet=sc.nextLine();
        int index=-1;
        for(int i=0;i<planets.length;i++){
            if(planets[i].equals(planet)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            double x0=x_coordinates[index];
            double y0=y_coordinates[index];
            double z0=z_coordinates[index];
            double minDistance=-1.0;
            int closestIndex=-1;
            for(int i=0;i<=planets.length-1;i++){
                if(i!=index){
                double dx=x_coordinates[i]-x0;
                double dy=y_coordinates[i]-y0;
                double dz=z_coordinates[i]-z0;
                double distance=Math.pow(dx,2)+Math.pow(dy,2)+Math.pow(dz,2);
                if(minDistance==-1.0 || distance<minDistance){
                    minDistance=distance;
                    closestIndex=i;
                }
                }
            }
            System.out.println("Closest Planet:"+planets[closestIndex]);
            System.out.println("Distance:"+minDistance);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
            
                
            
            
