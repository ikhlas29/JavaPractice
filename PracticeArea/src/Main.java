//public class Main{
//    public static void main(String[] args){
//        System.out.println("Hello World");
//
//        }
//    }


//public class Main {
//    public static void main(String[] args) {
//        int age = 30;
//        age = 35;
//        System.out.println(age);
//    }
//}


// ----------------------------
//  PRIMITIVE TYPES
//
//public class Main {
//    public static void main(String[] args) {
//        // Integer types
//        byte age = 30;
//        short year = 2024;
//        int viewsCount = 123_456_789;    // underscores for readability
//        long viewsCountLong = 3_123_456_789L;
//
//        // Floating-point types
//        float price = 10.99F;
//        double interestRate = 3.625;
//
//        // Char and Boolean
//        char letter = 'A';
//        boolean isEligible = true;
//    }
//}


// -----------------------------------
//  REFERENCE TYPES
//import java.util.Date;
//
//public class Main {
//    public static void main(String[] args) {
//        // Reference type - stores address of object in memory
//        Date now = new Date();
//        System.out.println(now);
//    }
//}


// ----------------------------
//  PRIMITIVE TYPES vs REFERENCE TYPES

//public class Main {
//    public static void main(String[] args) {
//        // Primitives are copied by VALUE
//        int x = 1;
//        int y = x;
//        x = 2;
//        System.out.println(y); // still 1
//    }
//}
//

//------------------------------------------------
// STRINGS

//public class Main {
//    public static void main(String[] args) {
//        String message = "Hello World" + "!!";
//
//        System.out.println(message.length());           // 13
//        System.out.println(message.charAt(0));          // H
//        System.out.println(message.indexOf("o"));       // 4
//        System.out.println(message.lastIndexOf("o"));   // 7
//        System.out.println(message.contains("World"));  // true
//        System.out.println(message.startsWith("Hello"));// true
//        System.out.println(message.endsWith("!!"));     // true
//        System.out.println(message.replace("!", "*"));  // Hello World**
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());             // removes whitespace
//        System.out.println(message.isEmpty());          // false
//        System.out.println(message.isBlank());          // false
//
//        // Strings are immutable - methods return new strings
//    }
//}
//

// -----------------------------------------------------
//  ESCAPE SEQUENCES

//public class Main {
//    public static void main(String[] args) {
//
//        String path = "c:\\Windows\\Projects\\...";
//        System.out.println(path);
//
//        String text = "Hello \"Mosh\"";
//        System.out.println(text);
//    }
//}


// ------------------------------------------------
// ARRAYS

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        // Fixed size once created
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
//
//        int[] numbers2 = { 2, 3, 5, 1, 4 };
//
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//
//        // Sorting
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 4, 5]
//    }
//}


// -----------------------------------------------------
//  MULTI-DIMENSIONAL ARRAYS

//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        // 2D array (matrix)
//        int[][] matrix = new int[2][3];
//        matrix[0][0] = 1;
//
//        // Shorthand
//        int[][] matrix2 = { {1, 2, 3}, {4, 5, 6} };
//
//        System.out.println(Arrays.deepToString(matrix2));
//        // [[1, 2, 3], [4, 5, 6]]
//    }
//}


// ----------------------------------------------
// CONSTANTS
//

//public class Main {
//    public static void main(String[] args) {
//        final float PI = 3.14F;
//        // PI = 1; // Error: cannot assign a value to a final variable
//        System.out.println(PI);
//    }
//}


// ---------------------------------------
//  ARITHMETIC EXPRESSIONS
//public class Main {
//    public static void main(String[] args) {
//        int result = 10 + 3;   // 13
//        result = 10 - 3;       // 7
//        result = 10 * 3;       // 30
//        result = 10 / 3;       // 3 (integer division)
//        result = 10 % 3;       // 1 (remainder/modulus)
//
//        double result2 = (double) 10 / (double) 3; // 3.333...
//
//        // Increment and decrement
//        int x = 1;
//        x++;    // x = 2 (post-increment)
//        ++x;    // x = 3 (pre-increment)
//        x--;    // x = 2
//
//        // Augmented assignment
//        x += 2; // x = x + 2
//        x -= 2;
//        x *= 2;
//        x /= 2;
//    }
//}


// -----------------------------------------------
//  ORDER OF OPERATIONS
//
//public class Main {
//    public static void main(String[] args) {
//        // BODMAS / PEDMAS
//        // Parentheses, Multiplication/Division, Addition/Subtraction
//        int x = 10 + 3 * 2;           // 16
//        int y = (10 + 3) * 2;          // 26
//    }
//}


// ----------------------------------------------
// CASTING

//public class Main {
//    public static void main(String[] args) {
//        // Implicit casting (widening): byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2; // x implicitly cast to int
//
//        // Explicit casting (narrowing)
//        double d = 1.1;
//        int i = (int) d;    // 1 (decimal part lost)
//        System.out.println(i);
//
//        // String to number
//        String str = "123";
//        int num = Integer.parseInt(str);
//        double dbl = Double.parseDouble("1.23");
//
//        // Number to String
//        String s = Integer.toString(123);
//        String s2 = String.valueOf(123);
//    }
//}


// ------------------------------------------------
// THE MATH CLASS

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(Math.round(1.1));    // 1
//        System.out.println(Math.round(1.6));    // 2
//        System.out.println(Math.abs(-1.6));     // 1.6
//        System.out.println(Math.max(1, 2));     // 2
//        System.out.println(Math.min(1, 2));     // 1
//        System.out.println(Math.pow(2, 10));    // 1024.0
//        System.out.println(Math.sqrt(4));       // 2.0
//        System.out.println(Math.random());      // random [0.0, 1.0)
//
//        // Random number
//        int randomInt = (int) (Math.random() * 100);
//        System.out.println(randomInt);
//    }
//}


// --------------------------------------------
// FORMATTING NUMBERS
//import java.text.NumberFormat;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        // Currency
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result); // $1,234,567.89
//
//        // Percentage
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result2 = percent.format(0.1);
//        System.out.println(result2); // 10%
//
//        // Method chaining
//        System.out.println(NumberFormat.getCurrencyInstance().format(1234567.891));
//    }
//}


// ------------------------------------------------------
// READING INPUT (Scanner)
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//
//        // Reading a string (with spaces use nextLine)
//        System.out.print("Name: ");
//        String name = scanner.next();       // reads one token (no spaces)
//        // String name = scanner.nextLine(); // reads full line
//
//        System.out.println("Hello " + name);
//    }
//}

// -------------------------------------------
//  COMPARISON OPERATORS
//public class Main {
//    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//
//        System.out.println(x == y);  // true
//        System.out.println(x != y);  // false
//        System.out.println(x > y);   // false
//        System.out.println(x >= y);  // true
//        System.out.println(x < y);   // false
//        System.out.println(x <= y);  // true
//    }
//}


// --------------------------------------------------
//  LOGICAL OPERATORS

//public class Main {
//    public static void main(String[] args) {
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30; // AND
//        System.out.println(isWarm); // true
//
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // OR, NOT
//        System.out.println(isEligible); // true
//    }
//}
// ------------------------------------------------------------------
//  IF STATEMENTS
//
//public class Main {
//    public static void main(String[] args) {
//        int temp = 32;
//
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        } else if (temp > 20) {
//            System.out.println("Beautiful day");
//        } else {
//            System.out.println("Cold day");
//        }
//    }
//}


// --------------------------------------
//  SIMPLIFYING IF STATEMENTS

//public class Main {
//    public static void main(String[] args) {
//        int income = 120_000;
//
//        // Verbose
//        boolean hasHighIncome;
//        if (income > 100_000)
//            hasHighIncome = true;
//        else
//            hasHighIncome = false;
//
//        // Simplified
//        boolean hasHighIncome2 = (income > 100_000);
//    }
//}


// -------------------------------------------
// THE TERNARY OPERATOR

//public class Main {
//    public static void main(String[] args) {
//        int income = 120_000;
//
//        // condition ? valueIfTrue : valueIfFalse
//        String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);
//    }
//}

// ----------------------------------------------------
//SWITCH STATEMENTS

// public class Main {
//    public static void main(String[] args) {
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }
//    }
//}
//


