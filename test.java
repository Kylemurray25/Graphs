
public class test
{
    public static void main()
    {
        WeightedEdge a = new WeightedEdge(1,2,1.0);
        WeightedEdge b = new WeightedEdge(2,3,2.0);
        WeightedEdge c = new WeightedEdge(3,4,3.0);
        WeightedEdge d = new WeightedEdge(4,1,4.0);
        WeightedEdge e = new WeightedEdge(2,7,4.0);
        WeightedEdge f = new WeightedEdge(4,5,1.0);
        WeightedEdge g = new WeightedEdge(5,6,3.0);
        WeightedEdge h = new WeightedEdge(6,4,2.0);
        
        WeightedGraph graph = new WeightedGraph(a,b,c,d,e,f,g,h);
        System.out.println("the graph");
        System.out.println(graph.toString());
        WeightedGraph dubTree = graph.twoTree();
        //c.completeGraph(6);
       
        System.out.println("double tree graph");
        System.out.println(dubTree.toString());
        
    }
}
