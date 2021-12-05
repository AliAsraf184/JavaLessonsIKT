public class Loopex2 {
    public static void main(String[] args){
int n=0;
int a;
int p;
int k;
int s=0;
int f=0;
int y=0;
int v=0;
int j;

        int u=0;
        for (int i = 1000; i < 10000; i++) {
                for ( p = 0; s<4; p++) {
                    n = i / 10;// bu
                    s=s+1;        }
                for (int z = 0; f <3; z++) {
                a=i/10;
                v=a%10; //bu
                f=f+1;     }
                for (int x = 0; y <2; x++) {
                k=i/10;
                 u= k%10; //bu
                y=y+1; }
            j= i%10; // bu
                if((v+n)==(u+j)) System.out.println("" + i);

        }
    }
}
