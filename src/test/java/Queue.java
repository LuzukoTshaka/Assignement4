public class Queue {

    int size,front,rear;
    String queue[]=new String[5];

    public void enq(String data)
    {
        queue[rear]=data;
        rear=rear+1;
        size=size+1;
    }
    public String deq()
    {
        String data=queue[front];
        front=front+1;
        size=size-1;
        return data;
    }
    public void show()
    {
        System.out.print("Elements: ");
        for (int i=0;i<size;i++)
        {
            System.out.print(queue[front+i]+" ");
        }
    }
}
