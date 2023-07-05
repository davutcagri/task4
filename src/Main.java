import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.stream.Collectors;

//Array metodlarının kullanımı.
public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        //1. add metodu.
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        //2. add metodu ile belirli bir sıradaki veriyi değiştirme.
        arr.add(0, 5);

        //3. remove metodu.
        arr.remove(3);

        //4. addAll metodu.
        ArrayList arr2 = new ArrayList<Integer>(Arrays.asList(54, 12, 21)); // 2. ArrayList
        arr.addAll(arr2);

        //5. removeAll metodu.
        arr.removeAll(arr2);

        //6. removeRange metodu.
        ArrayList removeArr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        arr.removeAll(removeArr);

        //7. size metodu.
        System.out.println(arr.size());

        //8. contains metodu.
        ArrayList arr3 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 9));
        if (arr.contains(5)) {
            System.out.println("arr dizisi 5 sayısını içeriyor.");
        }

        //9. get metodu.
        System.out.println(arr.get(0));

        //10. set metodu.
        arr.set(0, 1);

        //11. clear metodu.
        arr.clear();

        //12. isEmpty metodu.
        if (arr.isEmpty()) {
            System.out.println("Array boş");
        }

        arr.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 11)); // Array temizlendiği için yeni veriler ekledim.

        //13. indexOf metodu.
        System.out.println(arr.indexOf(1)); // output: 0
        System.out.println(arr.indexOf(8)); // output: 9

        //14. lastIndexOf metodu.
        System.out.println(arr.lastIndexOf(11)); // output: 15

        //15. toArray metodu.
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        firstArray.add(15);
        firstArray.add(32);

        Integer[] secondArray = new Integer[firstArray.size()];
        firstArray.toArray(secondArray);

        //16. clone metodu.
        ArrayList<String> originalArray = new ArrayList<String>();
        originalArray.add("İstanbul");
        originalArray.add("Ankara");
        originalArray.add("İzmir");
        originalArray.add("Antalya");

        ArrayList<String> cloneArray = (ArrayList<String>) originalArray.clone();

        //17. subList metodu.
        ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> subListArray = new ArrayList<>(intArray.subList(2, 5));
        System.out.println(subListArray);

        //18. retainAll metodu.
        ArrayList<String> flowerArray = new ArrayList<>(Arrays.asList("Menekşe", "Gül", "Begonya", "Papatya"));
        ArrayList<String> retainAllArray = new ArrayList<>(Arrays.asList("Papatya", "Gül"));
        flowerArray.retainAll(retainAllArray);

        //19. iterator ve listIterator.
        ArrayList<String> countryArray = new ArrayList<String>(Arrays.asList("Türkiye", "Azerbaycan", "Fransa", "İngiltere"));

        Iterator iter = countryArray.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + ", ");
        }

        ListIterator<String> listIterator = countryArray.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + ", ");
        }

        //20. array to ArrayList.
        ArrayList<String> colorArray = new ArrayList<String>();
        colorArray.add("Red");
        colorArray.add("Brown");
        colorArray.add("Black");

        String[] newArray = new String[]{"Yellow", "Blue"};
        Collections.addAll(colorArray, newArray);

        //21. sort metodu.
        ArrayList<Integer> randomArray = new ArrayList<Integer>(Arrays.asList(65, 12, 53, 32, 23));
        System.out.println("Düzenlenmemiş array: " + randomArray);
        Collections.sort(randomArray);
        ;
        System.out.println("Düzenlenmiş array: " + randomArray);

        //22. revers metodu.
        Collections.reverse(randomArray);

        //23. remove dublicates.
        ArrayList<Integer> dublicateArray = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 43, 154, 121, 5464, 21, 154, 121));
        System.out.println("Tekrarlı hali: " + dublicateArray);
        List<Integer> distinctList = dublicateArray.stream().distinct().collect(Collectors.toList());
        System.out.println("Tekrarsız hali: " + distinctList);

        //24. shuffle.
        ArrayList<Integer> düzenliArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5));
        System.out.println("Düzenli hali: " + düzenliArray);
        Collections.shuffle(düzenliArray);
        System.out.println("Karıştırılmış hali: " + düzenliArray);
    }
}