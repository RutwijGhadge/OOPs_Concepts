import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        for(int i=1;i<=x;i++){
            TableCreator t= new TableCreator(x);
            ScalerThread t1= new ScalerThread(t);
            t1.start();
        }

    }
}

