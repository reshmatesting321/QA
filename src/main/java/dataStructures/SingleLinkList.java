package dataStructures;

public class SingleLinkList {

	private Link first;

    //LinkList constructor
    public SingleLinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1, double d2) {
        Link link = new Link(d1, d2);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Link delete() {
        Link temp = first;
        if(first == null){
         return null;
         //throw new NoSuchElementException(); // this is the better way. 
        }
        first = first.nextLink;
        return temp;
    }

    //Prints list data
    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

	public void printLink() {
		first.printLink();
	}

	public int hashCode() {
		return first.hashCode();
	}

	public boolean equals(Object obj) {
		return first.equals(obj);
	}

	public String toString() {
		return first.toString();
	}
}  

class LinkListTest {
    public static void main(String[] args) {
    	SingleLinkList list = new SingleLinkList();

        list.insert(1, 1.01);
        list.insert(2, 2.02);
        list.insert(3, 3.03);
        list.insert(4, 4.04);
        list.insert(5, 5.05);

        list.printList();

        while(!list.isEmpty()) {
            Link deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        list.printList();
        
    }
	
}
