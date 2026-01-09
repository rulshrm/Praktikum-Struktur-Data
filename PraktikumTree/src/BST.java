public class BST {
  Node root;

  public boolean isEmpty() {
    return (root == null);
  }

  public void insert(Node input) {
    if (isEmpty()) {
      root = input;
    } else {
      // cari parent yang sesuai dan (kiri/kanan)
      Node current = root;
      Node parent = null;
      boolean diKiri = true;

      while (current != null) {
        parent = current;
        // jika data yang akan diinputkan lebih besan, maka bergeser ke kanan

        if (current.data < input.data) {
          current = current.right;
          diKiri = false;
        } else {
          // jika data yang akan diinputkan lebih kecil, maka bergeser ke kiri
          current = current.left;
          diKiri = true;
        }
      }
      if (diKiri) {
        parent.left = input;
      } else {
        parent.right = input;
      }
    }
  }

  public void traverseInOrder() {
    inorder(root);
  }

  private void inorder(Node akar) {
    if (akar != null) {
      inorder(akar.left);
      System.out.print(akar.data + " ");
      inorder(akar.right);
    }
  }

  public void traversePreOrder() {
    preorder(root);
  }

  private void preorder(Node akar) {
    if (akar != null) {
      System.out.print(akar.data + " ");
      preorder(akar.left);
      preorder(akar.right);
    }
  }

  public void traversePostOrder() {
    postorder(root);
  }

  private void postorder(Node akar) {
    if (akar != null) {
      postorder(akar.left);
      postorder(akar.right);
      System.out.print(akar.data + " ");
    }
  }

  public Node search(int key) {
    Node node = null;
    Node current = root;
    // lakukan pencarian selama current tidak null
    while (current != null) {
      if (current.data == key) {
        return node;
      } else {
        if (current.data < key) {
          current = current.right;
        } else {
          current = current.left;
        }
      }
    }
    return null;
  }
}