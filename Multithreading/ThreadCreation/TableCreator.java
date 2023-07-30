public class TableCreator implements Runnable{
    public int x;

    public TableCreator(int i){
        this.x=i;
    }

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i+" times " +x+" is" +(i*x));
        }
    }
}
