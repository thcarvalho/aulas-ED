public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int element) {
        Node node = new Node(element);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node aux = null;
            while (true) {
                aux = current;
                if (element <= current.data) {
                    current = current.left;
                    if (current == null) {
                        aux.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        aux.right = node;
                        return;
                    }
                }
            }
        }
    }

    public Node get(int element) throws Exception {
        if (root == null) throw new Exception("Arvore vazia");
        Node current = root;
        while (current.data != element) {
            if (element <= current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) throw new Exception("ELemento não encontrado");
        }
        return current;
    }

    public void remove(int element) {
        try {
            Node e = get(element);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Node current = root;
        Node parent = root;
        boolean leftChild = true;
        while (current.data != element) {
            parent = current;
            if (element < current.data) {
                current = current.left;
                leftChild = true;
            } else {
                current = current.right;
                leftChild = false;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root)
                root = null;
            else if (leftChild)
                parent.left = null;
            else
                parent.right = null;
        } else if (current.right == null) {
            if (current == root)
                root = current.left;
            else if (leftChild)
                parent.left = current.left;
            else
                parent.right = current.left;
        } else if (current.left == null) {
            if (current == root)
                root = current.right;
            else if (leftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        } else {
            Node sucessor = getSucessor(current);
            if (current == root)
                root = sucessor;
            else if (leftChild)
                parent.left = sucessor;
            else
                parent.right = sucessor;
            sucessor.left = current.left;
        }

    }

    public Node getSucessor(Node node) {
        Node parent = node;
        Node sucessor = node;
        Node current = node.right;
        while (current != null) {
            parent = sucessor;
            sucessor = current;
            current = current.left;
        }
        if (sucessor != node.right) {
            parent.left = sucessor.right;
            sucessor.right = node.right;
        }
        return sucessor;
    }

    public void print() {
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.print("Altura: " + height(root));
    }

    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.data + " ");
            inOrder(current.right);
        }
    }

    public void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    public void postOrder(Node current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.data + " ");
        }
    }

    public int height(Node current) {
        if (current == null || (current.left == null && current.right == null))
            return 0;
        if (height(current.left) > height(current.right))
            return (1 + height(current.left));
        return (1 + height(current.right));
    }
}
