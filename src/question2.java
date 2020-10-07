import java.util.LinkedList;

//using a generic type arrayType and using a linkedList  since its a prewritten linked list that is doubly linked
//containing a pointer to the first and last, the last also connected to second to last
public class question2 {
     public class dequeue<arrayType>{
         private LinkedList<arrayType> myList;

         public dequeue() {
             this.myList = new LinkedList<>();
         }

         public void push(arrayType item){
             this.myList.push(item);
         }

         public arrayType pop(){
             return myList.pollFirst(); //handles the error if the list is empty
         }

         public void inject(arrayType item){
             this.myList.addLast(item);
         }

         public arrayType eject(){

             return myList.pollLast(); //handles the error if the list is empty
         }

     }

}
