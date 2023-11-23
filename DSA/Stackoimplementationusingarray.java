/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.*;
public class Stackoimplementationusingarray {

    /**
     * @param args the command line arguments
     */
    int top;
    int capacity;
    int [] stack;
    Stackoimplementationusingarray()
    {
        top=-1;
        capacity=10;
        stack = new int[capacity];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==capacity-1;
    }
    public int push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        return stack[++top]=data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }
    public int peek()
    {
        return stack[top];
    }
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        Stackoimplementationusingarray st= new Stackoimplementationusingarray();
       // st.push(23);
        //st.push(12);
      //  for(int i=0; i<5; i++)
        //{
        System.out.println("Enter the value");
            st.push(45);
        //}
        System.out.println(st.pop());
    }
}
