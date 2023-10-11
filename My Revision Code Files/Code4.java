// ---------------OverLoading Methods---------------

public class Code4 {
    public static void main(String args[]) {
        System.out.println(add(1, 2));
        // System.out.println(add(1, 2, 3));
        // System.out.println(add(1, 2, 3, 4));
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
    return a + b + c + d;
    }
}

// CONCLUSION: Even tho we overloaded the methods, the sum was only calculated as per the alotted numbers inside the methods.
// They share the same name, but have different params.

// Some factors that are taken into account are: 
// 1. No. of params,
// 2. Order of the values & 
// 3. Datatypes