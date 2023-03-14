//Christopher Eslinger
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayLists {
    public static void main(String args[]){
        List<Integer> perm1 = new ArrayList(Arrays.asList(1, 2, 2, 4));
        List<Integer> perm2 = new ArrayList(Arrays.asList(2, 2, 1, 4));
        List<Integer> remove = new ArrayList(Arrays.asList(1, 4, 5, 6, 5, 2, 5, 5));
        List<Integer> intlist = new ArrayList<Integer>(Arrays.asList(5, 20, 30, 40, 3, 9, 25));
        List<Integer> intlist2 = new ArrayList<Integer>(Arrays.asList(5, 5, 20, 30, 40, 3, 9, 25));
        List<Integer> intlistcomp = new ArrayList<Integer>(Arrays.asList(5, 20, 30, 40, 3, 9, 25));
        List<String> stringlist = new ArrayList<String>(Arrays.asList("cat", "tree", "dog", "bush"));
        List<String> stringlist2 = new ArrayList<String>(Arrays.asList("cat", "cat", "tree", "dog", "bush"));
        System.out.println(unique(intlist));
        System.out.println(unique(intlist2));
        System.out.println(unique(stringlist));
        System.out.println(unique(stringlist2));
        System.out.println(allMultiples(intlist, 5));
        System.out.println(allStringOfSize(stringlist, 4));
        System.out.println(isPermutation(perm1, perm2));
        System.out.println(tokenize("Hello! World"));
        System.out.println(removeAll(remove, 5));
    }

    //O(n^2)
    public static <E> boolean unique(List<E> list){
        for (int i = 0;  i < list.size(); i++) {
            //O(n)
            for (int j = 0; j < list.size(); j++) {
                //O(n)
                if (list.get(i).equals(list.get(j)) && j != i){
                    //O(1)
                    return false;
                }
            }
        } return true;
    }

    //O(n) AllMultiples()
    public static List allMultiples(List<Integer> list, int multiple){
        List newList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % multiple == 0) {
                newList.add(list.get(i));
            }
        } return newList;
    }

   //O(n^2) allStringSize()
    public static List allStringOfSize(List<String> list, int size){
        List newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                newList.add(list.get(i));
            }
        } return newList;
    }

    //O(n^2) isPermutation
    public static boolean isPermutation(List list1, List list2) {
        boolean permutable = true;
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (permutable) {
                    for (int j = 0; j < list2.size(); j++) {
                        if (list1.get(i).equals(list2.get(j))) {
                            permutable = true;
                            break;
                        } else permutable = false;
                    }
                }
            }
        } else return false;
        return permutable;
    }

    //O(n) tokenize
    public static List<String> tokenize(String str) {
        List<String> newList = new ArrayList<String>();
        String []strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            newList.add(strArray[i]);
        } return newList;
    }

    //O(n) removeAll
    public static <E>List removeAll(List <E> list, E item) {
        List <E> newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(item)){
                newList.add(list.get(i));
            }
        } return newList;
    }
}
