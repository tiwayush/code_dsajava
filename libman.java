import java.util.*;

class books {
    String name;
    int count;
    int n;
    String arr[];

    books(String name, int count, int n, String arr[]) {
        this.name = name;
        this.count = 0;
        this.n = n;
        this.arr = new String[n]; // Create a new array
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    void add(String name) {
        if (count < n) {
            arr[count] = name;
            count++;
        }
        System.out.println(arr.length);
        
    }

    void remove(String name) {
        String re = "";
        for (int i = 0; i < n; i++) { // Iterate from 0 to n
            if (arr[i] != null && arr[i].equalsIgnoreCase(name)) {
                re = arr[i];
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = null;
                count--;
                break;
            }
        }

        if (!re.isEmpty()) {
            System.out.println("Removed book is " + re);
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}

class libman {
    public static void main(String[] args) {
        String arr[] = { "nanu", "bobo" ,"toto"};
        books ob = new books("bobo", 0, 3, arr);
        ob.add("papu");
        ob.remove("bobo");
    }
}
