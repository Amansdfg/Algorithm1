package UnionFind;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickFindUF uf = new QuickFindUF(10);
        for (int i = 0; i < 10; i++) {
            int p= sc.nextInt();
            int q= sc.nextInt();
            if(!uf.connected(p,q)){
                uf.union(p,q);
                System.out.println(p+" "+q);
            }
        }
        System.out.println("Finish");
        uf.print();
    }
}