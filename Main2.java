import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> perm1 = new ArrayList(Arrays.asList(1, 2, 2, 4));
        List<Integer> perm2 = new ArrayList(Arrays.asList(2, 1, 2, 4));
        List<Integer> remove = new ArrayList(Arrays.asList(1, 4, 5, 6, 5, 2, 5, 5));
        List<Integer> intlist = new ArrayList<Integer>(Arrays.asList(5, 20, 30, 40, 3, 9, 25));
        List<Integer> intlistcomp = new ArrayList<Integer>(Arrays.asList(5, 20, 30, 40, 3, 9, 25));
        List<String> stringlist = new ArrayList<String>(Arrays.asList("human", "tree", "dog", "bush"));
        System.out.println(unique(intlist));
        //System.out.println(unique(stringlist));
        System.out.println(allMultiples(intlist, 5));
        System.out.println(isPermutation(perm1, perm2));
        //System.out.println(tokenize("Hello! World"));
        System.out.println(removeAll(remove, 5));


        System.out.println("Hello world!");
    }
    public static <E> Boolean unique(List<E> list) {
        boolean f = true;
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i + 1; j<list.size()-1; j++) {
                if (list.get(i).equals(list.get(j))) {
                    f = false;
                }
                else
                {
                    f = true;
                }

            }
        }
        return f;
    }
    public static List allMultiples(List<Integer> list, int give)
    {
        List<Integer> out = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) % give == 0)
            {
                out.add(list.get(i));
            }
        }


        return out;
    }

    public static List allStringsOfSize(List<String> list, int length) {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == length)
            {
            }
        }
        return list;
    }
    public static boolean isPermutation(List list, List list2) {
        boolean f = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list2.size(); j++) {
                if(list.get(i) == list2.get(j));
                {
                    f = true;

                }
                if(!list.get(i).equals( list2.get(j)))
                {
                    f = false;
                }
            }
        }
        return f;
    }

    public static List tokenize(String input) {

        for (int i = 0; i < input.length(); i++) {
            // new String;
        }
        List<String> out = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            if (!out.get(i).equals(" "))
            {
                out.add(i, input.substring(i,i + 1));
            }
        }

        return out;
    }


    public static <E> List removeAll(List<E> list, E item) {
        List<E> list2 = new ArrayList<E>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(item))
            {
                list.remove(item);
                i--;
            }
        }
        return list;
    }

}

