public abstract class AbstractList implements ListInterface{

    int[] list;
    int size;
    
    AbstractList() {
        list = new int[10];
        size = 0;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return list[index];
    }

    public boolean contains(int item){
        for(int i = 0; i<size; i++){
            if (list[i] == item){
                return true;
            }
        }return false;
    }

    public void remove(int index){
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }list[size--] = 0;
    }

    public int indexOf(int item){
        for(int i = 0; i < size; i++){
            if(list[i] == item){
                return list[i];
            }
        }return 0;
    }
}