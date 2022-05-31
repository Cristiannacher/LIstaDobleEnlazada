public class Element<T> {

    private T object;
    private Element<T> nextElement;
    private Element<T> previusElement;

    public Element(T object) {
        this.object = object;
        this.nextElement = null;
        this.previusElement = null;
    }

    public void setNext(Element<T> nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevius(Element<T> previusElement) {
        this.previusElement = previusElement;
    }

    public Element<T> getNext() {
        return nextElement;
    }

    public Element<T> getPrevius() {
        return previusElement;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void delete() {
        object = null;
        nextElement = null;
        previusElement = null;
    }

}
