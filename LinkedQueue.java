class LinkedNode<E> //internal class for Linked nodes
{
    public E value;
    public LinkedNode<E> next;

    public LinkedNode(E val)
    {
        this.value = val;
        this.next = null;
    }

    public void setValue(E val)
    {
        this.value = val;
    }
    public E getValue()
    {
        return value;
    }

    public void setNext(LinkedNode next)
    {
        this.next = next;
    }

    public LinkedNode getNext()
    {
        return next;
    }
}


public class LinkedQueue<E> implements Queue<E>
{
    
    
    
    
    //returns true if nothing in the queue
    public boolean isEmpty( )
    {

    } 
    //places object obj at the back of the queue
    public void enqueue(E obj )
    {
        
    } 
    //removes and returns object at front of the queue
    public E dequeue( )
    {
        
    } 
    //returns object at the front of the queue
    public E peekFront( )
    {
        
    } 
    //returns the number of elements in the queue
    public int size()
    {
        
    } 
    //clears all elements from the Queue.  Results in an empty queue.
    public void clear()
    {
        
    } 
}
