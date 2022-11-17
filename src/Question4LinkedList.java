import java.util.LinkedList;

public abstract class Question4LinkedList {
    public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i) == list.get(i+1))
                list.remove(i+1);
        }
        return list;
    }
}
