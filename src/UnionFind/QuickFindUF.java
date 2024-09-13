package UnionFind;
// Quick find
public class QuickFindUF {
    private  int[] id;
    public QuickFindUF(int N) {
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }
    public boolean connected(int p,int q){
        return id[p]==id[q];
    }
    public void union(int p,int q){
        int pId=id[p];
        int qId=id[q];
        for(int i=0;i<id.length;i++){
            if(id[i]==pId){
                id[i]=qId;
            }
        }
    }
    public void print(){
        for(int i=0;i<id.length;i++){
            System.out.println(i+" "+id[i]);
        }
    }
}
