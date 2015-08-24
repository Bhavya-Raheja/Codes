import java.util.*;
 
class linked{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
         }
    }
    public Node root = null;    
 
    public void insertbeg(int a){
        if(root == null)
            root = new Node(a);
        else{
            Node newnode = new Node(a);
            newnode.next = root;
            root = newnode;    
        }
    }
    public void  insertend(int a){
        Node newnode = new Node(a);
        Node pt = root;
        if(pt==null){
            insertbeg(a);
        }
        while(pt.next!=null){
            pt= pt.next;
        }
        pt.next = newnode;
           
    }
    public void  insertloc(int i , int loc){
        if(loc==0)
            insertbeg(i);
        Node pt= root;
        if(root == null){
            insertbeg(i);
            return ; 
        }
        Node newnode = new Node(i);
        while(--loc!=1){
            if(pt.next == null){
                break;
            }
            pt = pt.next;
        }
        newnode.next = pt.next;
        pt.next = newnode;

    }
    public void print(){
        if(root == null)
            return ;
        else{
            Node s = root;
            while(s!=null){
                System.out.println(s.data);
                s = s.next;   
            }          
        }
}    
} 

class linkedlist{
    public static void main(String args[]){
        linked ob = new linked();

        System.out.println("1. insertion at the beg");
        System.out.println("2. insertion at the a particular location");
        System.out.println("3. insertion at the last");
        System.out.println("4. printing the last node");
        Scanner ds = new Scanner(System.in);
        int i,ch,j ;
        String h ="";
        do{
            System.out.println("enter the choiceof operation u want to perform");
            ch = Integer.parseInt(ds.nextLine());             
            switch(ch){
                 case 1 : System.out.println("enter the data at its beg");
                          i = Integer.parseInt(ds.nextLine()); 
                          ob.insertbeg(i);
                          break;
    
                 case 2 : System.out.println("enter the element and its location");
                          i = Integer.parseInt(ds.nextLine()); 
                          j = Integer.parseInt(ds.nextLine()); 
                          ob.insertloc(i,j);
                          break;            
                 case 3 : System.out.println("enter the data to enter at the end ");
                          i = Integer.parseInt(ds.nextLine());
                          ob.insertend(i);
                          break;
                 case 4 : ob.print();
                       
                      
           }System.out.println("press y to enter more");
         h =ds.nextLine();     
}while('y'== h.charAt(0));
}
}

          
