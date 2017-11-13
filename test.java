
public class test
{
    public static void main()
    {
        WeightedEdge a = new WeightedEdge(1,2,2.0);
        WeightedEdge b = new WeightedEdge(2,4,6.0);
        WeightedEdge c = new WeightedEdge(1,3,7.0);
        WeightedEdge d = new WeightedEdge(1,6,1.0);
        WeightedGraph g = new WeightedGraph(a,b,c,d);
        System.out.println("pre sort");
        System.out.println(g.toString());
        WeightedGraph sorted = g.twoTree();
        //c.completeGraph(6);
       
        System.out.println("post sort");
        System.out.println(sorted.toString());
        
    }
}
