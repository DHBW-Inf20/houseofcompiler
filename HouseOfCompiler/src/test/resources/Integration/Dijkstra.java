class Dijkstra {

    void main() {
        Vertex v1 = new Vertex(1);
        Graph g = new Graph(v1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);

        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        // Start Topology - Distance from v1 to any other should be 1
        g.addEdge(v1, v2);
        g.addEdge(v1, v3);
        g.addEdge(v1, v4);

        System.out.println(v1.isDirect(v2));

    }

}

class Graph {

    private VertexList vertexList;

    public Graph(VertexList vertexList) {
        this.vertexList = vertexList;
    }

    public Graph(Vertex v1) {
        this.vertexList = new VertexList(v1);
    }

    public VertexList getVertexList() {
        return vertexList;
    }

    public void addVertex(Vertex vertex) {
        vertexList.add(vertex);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.addAdjancey(vertex2);
        vertex2.addAdjancey(vertex1);
    }

    public void print() {
        vertexList.print();
    }

}

class Vertex {

    public int id;
    public VertexList adjanceyList;

    public Vertex(int id) {
        this.id = id;
    }

    public void addAdjancey(Vertex v) {
        adjanceyList.add(v);
    }

    public void print() {
        System.out.print('v');
        System.out.print(':');
        System.out.println(id);
    }

    public void printAdjancey() {
        System.out.print('v');
        System.out.print(':');
        System.out.println(id);
        System.out.print('a');
        System.out.print(':');
        adjanceyList.print();
    }

    public boolean isDirect(Vertex v) {
        return adjanceyList.contains(v);
    }

}

class VertexList {

    private Vertex vertex;
    private VertexList next;
    public int size;

    public VertexList(Vertex vertex) {
        this.vertex = vertex;
        this.next = null;
        this.size = 1;
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
        size = size + 1;
        if (this.next == null) {
            this.next = new VertexList(vertex);
        } else {
            this.next.add(vertex);
        }
    }

    public VertexList get(int index) {
        if (index == 0) {
            return this;
        } else {
            return this.next.get(index - 1);
        }
    }

    public void print() {
        this.vertex.print();
        if (this.next != null) {
            this.next.print();
        }
    }

}