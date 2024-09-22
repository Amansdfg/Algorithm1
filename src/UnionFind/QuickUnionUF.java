package UnionFind;
//Quick Union
public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N) {
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;

    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) return;
//        if(id[rootP]<id[rootQ]){
//            id[rootP]=id[rootQ];
//            id[rootQ]+=rootP;
//        }else{
//            id[rootQ]=id[rootP];
//            id[rootP]+=rootQ;
//        }

        id[rootP] = rootQ;
    }
}
