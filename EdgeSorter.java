import java.util.Comparator;

public class EdgeSorter implements Comparator<WeightedEdge>
{
    public int compare (WeightedEdge e1,  WeightedEdge e2)
    {
        String s1 = "" + e1.getWeight();
        String s2 = "" + e2.getWeight();
        return s1.compareTo(s2);
    }
}