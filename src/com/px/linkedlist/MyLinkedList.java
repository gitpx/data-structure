package com.px.linkedlist;

public class MyLinkedList<E> {

    private Node<E> dummyHead;
    private int size;

    public MyLinkedList()
    {
        this.dummyHead = new Node<E>(null,null);
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //添加元素到指定位置
    public void add(int index,E e)
    {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("");
        }

        Node<E> prev = dummyHead;
        //找出要插入位置的前一个元素
        for (int i=0; i< index ;i++){
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;

    }
    //在链表头添加元素
    public void addFirst(E e){
        add(0,e);
    }

    //向末尾添加元素
    public void addLast(E e){
        add(size,e);
    }

    //获取index位置的元素
    public E get(int index){
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return (E) cur.e;
    }

    //获取第一个元素
    public E getFirst(){
       return get(0);
    }

    //获取最后一个元素
    public E getLase(){
        return get(size-1);
    }

    //修改index位置的元素
    public void set(int index,E e) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //判断是否包含改元素
    public boolean contains(E e){
        Node<E> cur = dummyHead.next;
        while (cur.next != null){
            if(cur.e.equals(e))
            {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除一个节点
    public E delete(int index){
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("");
        }
        Node prev = dummyHead;
        //取出要删除的元素的前一个元素
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        //要删除的元素的前一个元素的next指向要要删除的next
        Node<E> retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    // 删除第一个节点
    public E deleteFirst(){
        return delete(0);
    }

    //删除最后一个节点
    public E deleteLast(){
        return delete(size-1);
    }
    private class Node<E>{
        E e;
        Node<E> next;

        public Node(E e,Node<E> next)
        {
            this.e = e;
            this.next = next;
        }

        public Node(E e)
        {
            this(e,null);
        }

        public Node()
        {
            this(null,null);
        }

        @Override
        public String toString( ){
            return e.toString();
        }
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        Node cur = dummyHead.next;
        while (cur != null) {
            sb.append(cur + "->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}
