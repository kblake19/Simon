/*
 * @author Kellen Lake
 * @id kblake
 * @course CSIS 252 - Programming II
 * @project Simon Lab
 * @related myQueue.java
 *	This class is the queue class that will handle
 *	all of the commands that are needed from the
 *	possible actions of the Simon game
 */
public class myQueue {
    protected final int DEFCAP = 100;
    protected Object[] queue;
    private int numElements = 0;
    private int front = 0;
    private int rear;

    public myQueue() {
        queue = new Object[DEFCAP];
        rear = DEFCAP - 1;
    }
    
    public myQueue(maxSize) {
        queue = new Object[maxSize];
        rear = maxSize - 1;
    }
    
    public void enqueue(Object element) {
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        numElements = numElements + 1;
    }
    
    public Object dequeue() {
        Object toReturn = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        numElements = numElements - 1;
        return toReturn;
    }
    
    public boolean isFull() {
        if(numElements == queue.length)
            return true;
        else
            return false;
    }
    public boolean isEmpty() {
        if(numElements == 0)
            return true;
        else
            return false;
    }
    
}
