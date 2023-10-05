import java.util.ArrayList;

class Fruit {

    public static void main(String[] args) {
        
        int[] arrayList = new int[9]; 
        arrayList[0] = 15;
        arrayList[1] = 14;
        arrayList[2] = 13;
        arrayList[3] = 12;
        arrayList[4] = 11;
        arrayList[5] = 10;
        arrayList[6] = 9;
        arrayList[7] = 8;
        arrayList[8] = 7;
        
        for(int i = 0; i < arrayList.length; i++) {
            //System.out.println(arrayList[1] / arrayList[8]);
        }

        String[] fruits = {"Apple", "Durian", "Mango"};
        for(int i = 0; i < fruits.length; i++) {
            //System.out.println(fruits.length);
            //System.out.println(fruits[i]);
        }

        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList);
        
        myList.add(100);
        myList.add(200);
        myList.add(300);
        //System.out.println(myList);

        Integer num = myList.get(2);
        //System.out.println(num);
        myList.set(1, 600);
        //System.out.println(myList);
    }
}