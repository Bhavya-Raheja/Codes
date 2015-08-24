import java.util.*;

class queue{
    int [] q;
    int front;
    int rear;
     queue(int size ){
        q=new int[size];
        front = 0;
        rear = 0;
    }
    void enter(int key){
        q[rear]=key;
        rear++;
    }
    int remove(){
        int key;
        key= q[front];
        front++;
        return key;
    }
    int empty(){
        if(front==rear)
            return 1;
        else
            return 0;
    }
    }
class queuearrayy{
    public static void main(String ags[]){
    
    int i , j;
    System.out.println("enter the size of the queue");
    Scanner a = new Scanner(System.in);
    i = Integer.parseInt(a.nextLine());
    queue ob = new queue(i);  //if we are passing parameterised                             //constructor then giving error    
   // ob.start(i);
    while(i!=0){
        System.out.println("enter the value to enqueue");
        j = Integer.parseInt(a.nextLine());
        ob.enter(j);
        i--;
    }
    while(ob.empty()!=1){
    
        System.out.println(ob.remove());     
}     
}
}