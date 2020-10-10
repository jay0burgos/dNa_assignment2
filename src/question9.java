import java.util.LinkedList;

public class question9{
    public class lever_Order{
        private LinkedList<question8.node> stack;
        private question8.tree myTree;

        public lever_Order(question8.tree myTree) {
            this.myTree = myTree;
        }
         //recurses linearly using a stack to push and pollLast to level order print the tree
        private void levelOrder(question8.node currentNode){
            if (currentNode != null){
                System.out.println(currentNode.getPayload());
                if(currentNode.getLeft() != null){
                    stack.push(currentNode.getLeft());
                }
                if(currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }

                levelOrder(stack.pollLast()); //removes and returns the last node to recurse
            }
            else
                System.out.println("tree is empty!");

        }

        public void printLevelOrder(){     //controls recursive function
            this.levelOrder(myTree.getRoot());
        }
    }
}
