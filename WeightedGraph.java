import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class WeightedGraph 
{
    private ArrayList<WeightedEdge> edges;
    public double weight;

    public WeightedGraph()
    {
        weight = 0;
        edges = new ArrayList<WeightedEdge>();
    }

    public WeightedGraph(WeightedEdge ... e)
    {
        edges = new ArrayList<WeightedEdge>();
        for( WeightedEdge ed : e){
            edges.add(ed);
        }
        for (int i = 0; i<edges.size(); i++)
        {
            weight += edges.get(i).getWeight();
        }
    }

    //This method creates an Kn complete graph given n.
    //This method does not assign weights to the graph.
    public void completeGraph(int n)
    {
        edges = new ArrayList<WeightedEdge>();

        for(int i=n; i>1; i--)
        {
            for(int j=n-1; j>0; j--)
            {
                if(i!=j && j<i)
                {
                    WeightedEdge e = new WeightedEdge(i,j,0.0);
                    edges.add(e);
                }
            }
        }

    }

    public void completeGraphWeighted(int n)
    {
        edges = new ArrayList<WeightedEdge>();

        for(int i=n; i>1; i--)
        {
            for(int j=n-1; j>0; j--)
            {
                if(i!=j && j<i)
                {
                    System.out.println("Enter Weight for Edge" + i + " " + j);
                    Scanner scan = new Scanner(System.in);
                    double w = scan.nextDouble();
                    WeightedEdge e = new WeightedEdge(i,j,w );
                    edges.add(e);
                }
            }
        }

    }

    public String toString()
    {
        String edgesString = "";
        for(int i = 0; i<edges.size(); i++)
        {
            edgesString += edges.get(i).toString();
        }
        return "Total Graph Weight is " + weight + "\n The edges are " + edgesString + " "; 
    }

    public WeightedGraph twoTree()
    {
        ArrayList<WeightedEdge> sortedEdges = new ArrayList<WeightedEdge>();
        sortedEdges = edges;
        Collections.sort(sortedEdges, new EdgeSorter());
        
        ArrayList<WeightedEdge> minSpanningTree = new ArrayList<WeightedEdge>();
        for (int i = 0; i < sortedEdges.size(); i++)
        {
         
                if(!sortedEdges.get(i).createsCycle(minSpanningTree))
                {
                    minSpanningTree.add(sortedEdges.get(i));
                }
            
        }

        //doubles the minimum spanning tree 
        ArrayList<WeightedEdge> dubMinSpanningTree = new ArrayList<WeightedEdge>();
        for (int n = 0; n < minSpanningTree.size(); n++)
        {
            dubMinSpanningTree.add(minSpanningTree.get(n));
            dubMinSpanningTree.add(minSpanningTree.get(n));
        }
        WeightedEdge[] dubTreeEdges = dubMinSpanningTree.toArray(new WeightedEdge[sortedEdges.size()]);

        WeightedGraph dubtree = new WeightedGraph(dubTreeEdges);
        return dubtree;
    }
}
