import java.util.*;
public class CircularQ {
    public static int arr[] = new int[5];
    int front = -1;
    int rear = -1;
    
    CircularQ(int data){
        arr[0] = data;
        front = 0;
        rear = 0;
    }

    public boolean isEmpty(){
        if(rear == -1 && front == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if((rear +1) % arr.length == front){
            return true;  
        }
        return false;
    }
    //enqueue
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;   
    }

    //dequeue
    public int remove(){    
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % arr.length;
        }
        return data;
    }           

    //peek
    public int peek(){  
        
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }


    
    public static void main(String args[]){
         
        CircularQ q = new CircularQ(10);    
        q.add(20);
        q.add(30);
        q.add(40);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(q.remove() + "removed");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(q.peek()  + "peek");
    }
}
