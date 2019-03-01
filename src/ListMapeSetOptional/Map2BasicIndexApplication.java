package ListMapeSetOptional;

import java.util.*;

public class Map2BasicIndexApplication {

    public static void main(String[] args) {

        Map<Integer, List<String>> book = new HashMap<>();


        System.out.println(book);


        Integer page3=3;
        Integer page2=2;
        Integer page1=1;


        String topic3="Science";
        String topic2="Math";
        String topic1="Phesics";

        book.put(page1,new ArrayList<>());
        book.put(page2,new ArrayList<>());
        book.put(page3,new ArrayList<>());
        System.out.println(book);

        book.get(page1).add(topic1);
        book.get(page2).add(topic2);
        book.get(page3).add(topic3);
        book.get(page1).add(topic3);
        System.out.println(book);

//        Collection<String> bookPages = book.values();
//
//        System.out.println(bookPages);
//
//        Set<Integer> bookTopic = book.keySet();
//
//        System.out.println(bookTopic);
        System.out.println(book.values());
        System.out.println(book.keySet());

         String newTopic1="new topic1";
         String newTopic2="new topic2";
         book.put(2, Collections.singletonList(newTopic1));
         book.get(page3).add(newTopic2);
                 System.out.println(book);

        boolean containsPage2 = book.containsKey(page2);

        System.out.println("Is Page 2 there? : " + containsPage2);

        System.out.println(book.get(2));

        System.out.println(book.size());

        System.out.println(book);


    }



}
