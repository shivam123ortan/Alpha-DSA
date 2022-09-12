

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    

    // ADD FIRST
    public void addFirst(int data){
        // Step 1 -- Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -- newNode next = head
        newNode.next = head; // Link

        // Step 3 -- head = newNode
        head = newNode;
    }

    // ADD LAST
    public void addLast(int data){
        // Step 1 -- Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -- next of tail to newNode
        tail.next = newNode;

        // Step 3 -- tail is now newNode
        tail = newNode;
    }

    // ADD 
    public void add(int idx, int data){
        // For adding at first
        if(idx == 0){
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i< idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // REMOVE FIRST
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // REMOVE LAST
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // SEARCH ITERATING
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // SEARCH RECURSIVELY --> O(n)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }

    // REVERSE THE LL --> O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head; // Head ab tail bn jayega
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // FIND AND REMOVE NTH NODE FROM END (Amazon, Adobe, Qualcomm, Flipkart)
    public void deleteNthfromEnd(int n){
        // Calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; // removeFirst
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // CHECK IF LL IS PALINDROME

    // Step 1 -> Slow Fast Approach
    public Node findMid(Node head){ // helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        // Base Case
        if(head == null || head.next == null){
            return true;
        }
        
        // Step 1 -> Find Mid
        Node midNode = findMid(head);

        // Step 2 -> Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // Step 3 -> Check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    // PRINT
    public void print(){ // TC -> O(n)
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // FLOYD'S CYCLE FINDING ALGORITHM
    // DETECTING CYCLE IN LL
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
         
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exists
    }

    // REMOVE A LOOP CYCLE IN A LL
    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // find meeting point 
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    // MERGE SORT
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    
    public Node mergeSort(Node head){
        // BaseCase
        if(head == null || head.next == null){
            return head;
        }
        
        // Find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        // merge
        return merge(newLeft, newRight);
    }

    // ZIGZAG LL
    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt merge - zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);

        // ll.add(2, 9);
        // ll.print();

        
        // ll.removeFirst();
        // ll.print();
        
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(19));

        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(19));

        // ll.reverse();
        // ll.print();

        // ll.deleteNthfromEnd(2);
        // ll.print();

        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(6);
        // ll.print();

        // System.out.println(ll.checkPalindrome());

        //-------------------------------------------------------------

        // // FLOYD'S CYCLE FINDING
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2->3->2
        // System.out.println(isCycle());
        // // Removing cycle
        // removeCycle();
        // System.out.println(isCycle());

        //-------------------------------------------------------------
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();

        // ll.head = ll.mergeSort(head);
        // ll.print();

        // ZIG-ZAG
        ll.zigZag();
        ll.print();


    }
}