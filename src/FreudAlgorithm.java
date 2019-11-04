import java.util.Scanner;

/**
 * 弗洛伊德算法，核心思想为动态规划。
 */
public class FreudAlgorithm {

    public static void main(String[] args){
        int[][] e=new int[10][10];
        int k,i,j,n,m,t1,t2,t3;
           int inf=99999999; //用inf(infinity的缩写)存储一个我们认为的正无穷值
           //读入n和m，n表示顶点个数，m表示边的条数
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
           //初始化
           for(i=1;i<=n;i++)
               for(j=1;j<=n;j++)
                if(i==j) e[i][j]=0;
             else e[i][j]=inf;
            //读入边
            for(i=1;i<=m;i++)
                    {
                        t1=scanner.nextInt();
                        t2=scanner.nextInt();
                        t3=scanner.nextInt();
                       e[t1][t2]=t3;
                   }
           Floyd(e,n);
             //输出最终的结果
             for(i=1;i<=n;i++)
                     {
                 for(j=1;j<=n;j++)
                             {
                                 System.out.print(e[i][j]);
                             }
                         System.out.println("");
                     }
    }

    public static void Floyd(int[][] e,int n){
        //Floyd-Warshall算法核心语句
        for(int k=1;k<=n;k++)
            for(int i=1;i<=n;i++)
                for(int j=1;j<=n;j++)
                    if(e[i][j]>e[i][k]+e[k][j] )
                        e[i][j]=e[i][k]+e[k][j];
    }
}
