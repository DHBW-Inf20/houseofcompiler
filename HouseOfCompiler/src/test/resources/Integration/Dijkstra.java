class Dijkstra {

    void main() {
        Vertex v1 = new Vertex(1);
        Graph g = new Graph(v1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);
        Vertex v10 = new Vertex(10);
        Vertex v11 = new Vertex(11);
        Vertex v12 = new Vertex(12);

        g.addVertex(v2);
        g.addVertex(v4);
        g.addVertex(v3);
        g.addVertex(v5);
        g.addVertex(v6);
        g.addVertex(v7);
        g.addVertex(v8);
        g.addVertex(v9);
        g.addVertex(v10);
        g.addVertex(v11);
        g.addVertex(v12);

        g.addEdge(v1, v2); // A-B
        g.addEdge(v1, v5); // A-E
        g.addEdge(v1, v10); // A-J

        g.addEdge(v2, v3); // B
        g.addEdge(v2, v7);

        g.addEdge(v3, v4); // C
        g.addEdge(v3, v5);

        g.addEdge(v4, v8); // D

        g.addEdge(v5, v6); // E
        g.addEdge(v5, v9);

        g.addEdge(v6, v7); // F

        g.addEdge(v7, v8); // G

        g.addEdge(v8, v12); // H
        g.addEdge(v8, v10);

        g.addEdge(v9, v10); // I

        g.addEdge(v10, v11); // J

        g.addEdge(v11, v12); // K

        g.getShortestPath(v1, v8);
        g.getShortestPath(v1, v12);
        g.getShortestPath(v4, v12);
        g.getShortestPath(v4, v9);
        g.getShortestPath(v6, v9);

    }

}

class Graph {

    private VertexSet vertexList;

    public Graph(VertexSet vertexList) {
        this.vertexList = vertexList;
    }

    public Graph(Vertex v1) {
        this.vertexList = new VertexSet(v1);
    }

    public VertexSet getVertexSet() {
        return vertexList;
    }

    public void addVertex(Vertex vertex) {
        vertexList.add(vertex);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.addAdjancey(vertex2);
        vertex2.addAdjancey(vertex1);
    }

    public void getShortestPath(Vertex source, Vertex destination) {
        VertexSet calcList = vertexList.copy();
        calcList.get(source.id).setDistance(0);
        calcList.get(source.id).setPrevious(null);
        Vertex current = calcList.get(source.id);

        // Fill the list with the distances
        while (current != null) {
            current.setVisited(true);
            // Search for every adjacent vertex
            VertexSet currentAdjanceyList = current.getAdjanceyList();
            if (currentAdjanceyList != null) {
                for (int i = 0; i < currentAdjanceyList.size(); i = i + 1) {
                    Vertex adjancey = currentAdjanceyList.getFromIndex(i);
                    adjancey = calcList.get(adjancey.id);
                    if ((adjancey != null) && !adjancey.isVisited()) {
                        int distance = current.getDistance() + 1;
                        if (distance < adjancey.getDistance()) {
                            adjancey.setDistance(distance);
                            adjancey.setPrevious(current);
                        }
                    }

                }
            } else {
            }
            current = calcList.getNextSmallestUnvisited();
        }

        {
            // Write "Shortest path from destination to source" in chars
            System.out.print("Shortest path from ");
            source.print();
            System.out.print(" to ");
            destination.print();
            System.out.print(": ");
        }
        Vertex previous = calcList.get(destination.id);
        if (previous == null) {

            return;
        }
        IntStack path = new IntStack(previous.id);
        previous = previous.getPrevious();
        while (previous != null) {
            path.push(previous.id);
            previous = previous.getPrevious();
        }

        path.print();

        {
            // Print "With a distance of"
            System.out.print("With a distance of ");
            System.out.println(path.size - 1);
        }

    }

    public void print() {
        vertexList.print();
    }

}

class Vertex {

    public int id;
    public VertexSet adjanceyList;
    public int distance;
    public Vertex previous;
    public boolean visited;

    public Vertex(int id) {
        this.id = id;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getDistance() {
        return distance;
    }

    public VertexSet getAdjanceyList() {
        return adjanceyList;
    }

    public Vertex getPrevious() {
        return previous;
    }

    public boolean isVisited() {
        return visited;
    }

    public Vertex(Vertex vertex) {
        this.id = vertex.id;
        this.adjanceyList = vertex.adjanceyList;
        this.distance = 10000; // No infinity so...
        this.previous = null;
        this.visited = false;
    }

    public void addAdjancey(Vertex v) {
        if (adjanceyList == null) {
            adjanceyList = new VertexSet(v);
        } else {
            adjanceyList.add(v);
        }
    }

    public Vertex copy() {
        return new Vertex(this);
    }

    public void print() {
        System.out.print(id);
    }

    public void printAdjancey() {
        System.out.print("Vertex: ");
        System.out.println(this.id);
        System.out.println("\tAdjancey: ");
        if (adjanceyList != null) {
            adjanceyList.print();
        }
        System.out.println();
    }

    public boolean isDirect(Vertex v) {
        return adjanceyList.contains(v);
    }

}

class VertexSet {

    private Vertex vertex;
    private VertexSet next;

    public VertexSet(Vertex vertex) {
        this.vertex = vertex;
        this.next = null;
    }

    public int size() {
        int size = 1;
        VertexSet v = next;
        while (v != null) {
            size = size + 1;
            v = v.next;
        }
        return size;
    }

    public VertexSet(VertexSet vertexList) {
        this.vertex = vertexList.vertex.copy();
        if (vertexList.next != null) {
            this.next = vertexList.next.copy();
        } else {
            this.next = null;
        }
    }

    public Vertex getNextSmallestUnvisited() {
        VertexSet v = this.getUnvisited();
        if (v == null) {
            return null;
        } else {
            return v.getSmallestDistance();
        }
    }

    public Vertex getSmallestDistance() {
        Vertex smallest = vertex;
        VertexSet v = next;
        while (v != null) {
            if (v.vertex.getDistance() < smallest.getDistance()) {
                smallest = v.vertex;
            }
            v = v.next;
        }
        return smallest;
    }

    public VertexSet getUnvisited() {
        VertexSet unvisited = null;

        VertexSet current = this;
        while (current != null) {
            if (!current.vertex.isVisited()) {
                if (unvisited == null) {
                    unvisited = new VertexSet(current.vertex);
                } else {
                    unvisited.add(current.vertex);
                }
            }
            current = current.next;
        }

        return unvisited;
    }

    public Vertex getFromIndex(int i) {
        if (i == 0) {
            return vertex;
        } else {
            return next.getFromIndex(i - 1);
        }
    }

    public void remove(Vertex v) {
        if (vertex.id == v.id) {
            vertex = next.vertex;
            next = next.next;
        } else {
            if (next != null) {
                next.remove(v);
            }
        }
    }

    public boolean hasUnvisited() {
        if (next != null) {
            return next.hasUnvisited();
        } else {
            return vertex.isVisited();
        }
    }

    public VertexSet copy() {
        return new VertexSet(this);
    }

    public boolean contains(Vertex v) {
        if (vertex.id == v.id) {
            return true;
        }
        if (next == null) {
            return false;
        }
        return next.contains(v);
    }

    public void add(Vertex vertex) {
        if (this.next == null) {
            this.next = new VertexSet(vertex);
        } else {
            this.next.add(vertex);
        }
    }

    public Vertex get(int index) {
        if ((vertex == null)) {
            return null;
        } else if (vertex.id == index) {
            return this.vertex;
        } else if (next != null) {
            return this.next.get(index);
        } else {
            return null;
        }
    }

    public void print() {
        this.vertex.print();
        if (this.next != null) {
            this.next.print();
        }
    }

}

class IntStack {

    public int c;
    public IntStack next;
    public int size;

    public IntStack(int c) {
        this.size = 1;
        this.c = c;
        this.next = null;
    }

    public void push(int c) {
        size = size + 1;
        if (this.next == null) {
            this.next = new IntStack(c);
        } else {
            this.next.push(c);
        }
    }

    public int pop() {
        size = size - 1;
        if (this.next.next == null) {
            int temp = this.next.c;
            this.next = null;
            return temp;
        } else {
            return this.next.pop();
        }
    }

    public void print() {
        if (next != null) {
            next.print();
        }
        System.out.print(c);
        System.out.print(' ');
    }

}