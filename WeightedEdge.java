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
    
    public String toString()
    {
        return "\n Edge: " +  x + ", " + y + " with weight "+ weight;
    }
}