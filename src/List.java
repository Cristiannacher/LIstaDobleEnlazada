public class List<T> {

    private Element<T> firstElement;
    private Element<T> lastElement;

    public List() {
        this.firstElement = null;
        this.lastElement = null;
    }

    public void insertFirst(T obj) {
        Element<T> newElement = new Element<>(obj);
        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        } else {
            newElement.setNext(firstElement);
            newElement.getNext().setPrevius(newElement);
            firstElement = newElement;
        }
    }

    public void insert(T object) {
        Element<T> newElement = new Element<>(object);
        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        } else {
            newElement.setPrevius(lastElement);
            lastElement.setNext(newElement);
            lastElement = newElement;
        }
    }

    public void print() {
        Element<T> toGetObject = firstElement;
        if (firstElement != null) {
            while (toGetObject != null) {
                System.out.print(toGetObject.getObject() + " ");
                toGetObject = toGetObject.getNext();
            }
            System.out.println();
        } else System.out.println("La lista esta vacia");
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    private boolean moreThanOneElement(){
        return !(firstElement == lastElement);
    }

    public void remove(T obj) {
        Element<T> toGetObject = firstElement;
        if (firstElement != null) {
            if(moreThanOneElement())
            if (firstElement.getObject().equals(obj)) {
                firstElement = firstElement.getNext();
            } else {
                while (toGetObject != null) {
                    if (toGetObject.getObject().equals(obj)) {
                        toGetObject.getPrevius().setNext(toGetObject.getNext());

                        break;
                    } else {
                        toGetObject = toGetObject.getNext();
                    }
                }
            }
        } else System.out.println("no se encontro el elemento");
    }

    public void
}
