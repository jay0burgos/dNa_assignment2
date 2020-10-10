




public class question7 {
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

    public static boolean check(node currentNode){
        if(currentNode == null){                   //base case to return  true when null children are found
            return true;
        }
        else if((currentNode.getPayload() > currentNode.getLeft().getPayload()) && (currentNode.getPayload() < currentNode.getRight().getPayload())){    //if both left and right payloads follow the search tree order property with their parent node
            return (check(currentNode.getLeft())&&check(currentNode.getRight()));                                                                        //executes the return that recursivelly checks the rest of the tree
        }
        else
            return false;  //if the upper if statement fails, tree is wrong and will return false
    }



}
