import java.util.Random;

public class question8 {
    public class node{
        private int payload;
        private node right;
        private node left;

        public node(int payload) {
            this.payload = payload;
            this.right= null;
            this.left= null;
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

        public node getLeft() {
            return left;
        }

        public void setLeft(node left) {
            this.left = left;
        }
    }

    public class tree{
        private node root;
        private Random r;

        public tree(node root, Random r) {
            this.root = root;
            this.r = new Random();
        }

        private void addNode(int x, node current){
            if (current == null){
                this.root = new node(x) ;
            }
            else if(current.getPayload() > x)
            {
                addNode(x, current.getLeft());
            }
            else if(current.getPayload() < x)
            {
                addNode(x, current.getRight());
            }
        }
        public void push(int x){
            this.addNode(x,this.root);
        }

        private void makeRandoTree(int left, int right){

             if(left <= right){
                 if(left == right){ //if ends have been found this acts like a case stamente killing the recursion
                     this.push(left);
                 }
                 else{
                     int randoVal = r.nextInt(right)+left;    //generates any number between the boundaries and
                     // pushes it
                     this.push(randoVal);
                     this.makeRandoTree(left, randoVal);     //splits between left and random and calls the funciton
                     // again
                     this.makeRandoTree(randoVal, right);  //splits between random and right
                 }
             }
        }

        public void fillRandoTree(int N){
            this.makeRandoTree(1, N);
        }

    }

}
