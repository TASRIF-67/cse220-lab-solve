/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        int sum = 0;
        int len = key.length();

        if (len % 2 == 0) {
            for (int i = 0; i < len; i+=2 ) {
                sum += (int) key.charAt(i);
            } 
        } else {
            for (int i = 1; i < len; i+=2) {
                sum += (int) key.charAt(i);
            }
        }

        return sum % ht.length;
       
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        int idx = hashFunction(key);

        // check if key already exists -> update value, no new node
        FruitNode curr = ht[idx]; 
        while (curr != null) {
            if (curr.fruit[0].equals(key)) {
                curr.fruit[1] = value;
                return; 
            }
            curr = curr.next;
        }

        //create new node
        FruitNode newNode = new FruitNode(key, value);

        if (ht[idx] == null) {
            ht[idx] = newNode;
            return;
        }

        // Collision -> insert in descending order
        // new nodes becomes head
        if (value >= (Integer) ht[idx].fruit[1]) {
            newNode.next = ht[idx];
            ht[idx] = newNode;
            return ;
        }

        // walk chain and find correct pos
        FruitNode prev = ht[idx];
        while (prev.next != null) {
            int nextPrice = (Integer) prev.next.fruit[1];
            
            if (nextPrice <= value) {
                break;
            }
            prev = prev.next;
        }   

        newNode.next = prev.next;
        prev.next = newNode;
    }

}
