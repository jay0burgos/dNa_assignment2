public class question3 {
      public class node{
          private int payload;
          private node right;


          public node(int payload) {
              this.payload = payload;
              this.right = null;
          }

          public int getPayload() {
              return payload;
          }

          public void setPayload(int payload) {
              this.payload = payload;
          }


          public node getRight() {
              return right;
          }

          public void setRight(node right) {
              this.right = right;
          }
      }
      public class linkedList{
          private node root;
          private int size;

          public linkedList() {
              this.root = null;
              this.size = 0;
          }

          public node getRoot() {
              return root;
          }

          public void setRoot(node root) {
              this.root = root;
          }

          public node generateNode(int x){
              node currentNode = new node(x);
              return currentNode;
          }

          public void push(int item, node current){    //adds a node to the tree
               if (current == null){
                   this.root = this.generateNode(item);
               }
               else
                   this.push(item, current.getRight());
          }

          public int getCount(int count, node current){
              if (current == null){
                  return count;
              }
              else
                  this.getCount(count++, current.getRight());
              return count;
          }

          public int getSize() {     //returns the size, and used as the driver for getCount!
              return getCount(0, this.root);
          }

          public void print(){
              for (node current = this.root; current != null; current = current.getRight()){
                  System.out.println(current.getPayload());
              }
          }
          public boolean findVal(int x){  //returns false if val isnt found
              boolean found = false;
              for (node current = this.root; current != null; current = current.getRight()){
                  if(current.getPayload() == x){
                      found = true
                  }
              }
              return found;
          }

          public void pushModded(int x){
              if(!this.findVal(x)) {
                  this.push(x, this.root);
              }
          }

          public void remove(int x){
             node parentNode = root;
              for (node current = this.root; current != null; parentNode = current, current = current.getRight()){
                  if(current.getPayload() == x){
                       parentNode.setRight(current.getRight());
                  }
              }
          }

      }
}
