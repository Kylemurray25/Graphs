
import java.util.ArrayList;
public class WeightedEdge extends Edge 
{
    private double weight;

    //default constructor
    public WeightedEdge()
    {
        x=0;
        y=0;
        weight = 0.0;
    }

    //parameterized constructor
    public WeightedEdge(int a, int b, double w)
    {
        x=a;
        y=b;
        weight = w;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double w)
    {
        weight = w;
    }

    public boolean isConnected(ArrayList<WeightedEdge> e)
    {
        boolean passed = false;
        for (int i = 0; i < e.size(); i++)
        {
            if (x == e.get(i).x)
            {
                passed = true;
            }
            if (y == e.get(i).y)
            {
                passed = true;
            }
            
        }
        return passed;
    }
    
    public boolean createsCycle(ArrayList<WeightedEdge> e)
    {
        boolean cycle = false;
        int position = x;
        for (int i = 0; i < e.size(); i++)
        {
            if (position == e.get(i).x)
            {
                position = e.get(i).y;
                if (position == y)
                {
                    cycle = true;
                }
            }
            else if (x == e.get(i).y)
            {
                position = e.get(i).x;
                if (position == y)
                {
                    cycle = true;
                }
            }
          
            
        }
        return cycle;
    }
    public String toString()
    {
        return "\n Edge: " +  x + ", " + y + " with weight "+ weight;
    }
    }