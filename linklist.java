LINKED LIST IMPLEMENTATION ALL OPERATIONS IN JAVA


package week1;

import java.util.Scanner;

    public class LinkedList {

        static class Node{
            int data;
            Node next;
        }static Node head = null;static Node tail = null;
//ADD or CREATE
        static void addNode(int val){
            Node node = new Node();
            node.data = val;
            if(head == null) {
                node.next = null;
                head = node;
                tail = node;
            }
            else{
                node.next = null;
                tail.next = node;
                tail = tail.next;
            }
        }
//INSERTION
        static void addPos(int val, int pos){
            Node node = new Node();
            node.data = val;
            if(head == null){
                node.next = null;
                head = node;
                tail = node;
            }
            else{
                Node temp = head;
                while(pos > 2) {
                    temp = temp.next;
                    pos--;
                }
                node.next = temp.next;
                temp.next = node;
            }
        }
//DISPLAY or TRAVERSE
        static void display(){
            if(head == null)
                System.out.println("Its empty");
            else{
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("END");
            }
        }

//DELETION
        void delete(int p){

            if(p==1){
                head=head.next;
            }
            else if(p==2){
                head.next=head.next.next;
            }
            else{
                Node ptr1=head;
                Node ptr2=head.next;
                while(p>2){
                    ptr1=ptr2;
                    ptr2=ptr2.next;
                    p--;
                }
            }




        }


        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addNode(5);
            list.addNode(3);
            list.addNode(8);
            list.addNode(7);

            list.addPos(0,2);





            list.display();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the pos1");
            int p=sc.nextInt();

            list.delete(p);
            list.display();
        }
}
