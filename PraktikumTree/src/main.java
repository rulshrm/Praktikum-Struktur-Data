public class main {
public static void main(String[] args) {
  BST bst = new BST();
  Node tmp;

  tmp = new Node();
  tmp.data =50;
  bst.insert(tmp);

  tmp = new Node();
  tmp.data =25;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =15;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =10;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =30;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =40;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =75;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =60;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =55;
  bst.insert(tmp);
  tmp = new Node();
  tmp.data =80;
  bst.insert(tmp);
  bst.traverseInOrder();
  System.out.println();
  bst.traversePreOrder();
  System.out.println();
  bst.traversePostOrder();
}
}
