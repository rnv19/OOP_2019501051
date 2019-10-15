public class OrderedList extends AbstractList{
    
    
    public void add(int item){
        list[list.length + 1] = item;
        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list [j - 1]) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
    }

}