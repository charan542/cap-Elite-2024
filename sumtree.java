class BinaryTree

{    static int s=0;
    static int sum(Node head){
    if(head ==null){
        return 0;
    }
    sum(head.left);
    s+=head.data;
    sum(head.right);
    return s;
    
}   
    static int sumBT(Node head){
        //Code
    int k=sum(head);
    s=0;
        return k;
    }
}
