
package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Edge> edges = new ArrayList<Edge>();

    public Path(List<Edge> edges){
        this.edges = edges;
    }

    public double getLength(){
        double length = 0;
        for (int k=0; k<this.edges.size(); k++){
            length += this.edges.get(k).getCost();
        }
        return length;
    }

    public int getSize() {
        return this.edges.size();
    }

    public Edge getEdgeN(int i) {
        return this.edges.get(i);
    }
}