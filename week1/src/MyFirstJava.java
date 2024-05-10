public class MyFirstJava {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public void variable_types() {
        byte b = 100; // 8-bit signed integer (-128 to 127) 1 byte
        short s = 1000; // 16-bit signed integer (-32,768 to 32,767) 2 bytes
        int i = 100000; // 32-bit signed integer (-2,147,483,648 to 2,147,483,647) 4 bytes
        long l = 1000000000000L; // 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) 8 bytes
        float f = 234.5f; // 32-bit floating point number 4 bytes
        double d = 234.5; // 64-bit floating point number 8 bytes
        char c = 'A'; // 16-bit Unicode character 2 bytes
        boolean bool = true; // true or false 1 byte
        String str = "Hello World"; // String of characters (text) 2 bytes per character

        final int constant = 100; // Constant variable: Will never change
    }

    public void variable_type_rules() {
        // 1. Variable names must start with a letter, $, or _
        // 2. Variable names can only contain letters, numbers, $, or _
        // 3. Variable names are case-sensitive
        // 4. Variable names cannot be a reserved keyword
        // 5. Variable names should be descriptive

        /*
         * Camel Case Convention
         * 
         * - First letter is lowercase - First word is lowercase - Every subsequent word
         * starts with an uppercase letter
         * 
         * Example: myVariableName
        */

         /*
          * Pascal Case Convention

            * - First letter is uppercase
            * - Every subsequent word starts with an uppercase letter
            
            Example: MyVariableName
        */

        /*
            * Snake Case Convention
            * 
            * - All letters are lowercase
            * - Words are separated by an underscore
            * 
            * Example: my_variable_name
        */

        /*
            * Kebab Case Convention
            * 
            * - All letters are lowercase
            * - Words are separated by a hyphen
            * 
            * Example: my-variable-name
        */

        /*
            * Hungarian Notation
            * 
            * - Prefixes are used to denote the variable type
            * 
            * Example: intMyVariableName
        */
        
        /*
            * Constant Naming Convention

            * - All letters are uppercase
            * - Words are separated by an underscore
         */

         /*
          * 
          Concatenation
            - Combining two or more strings together
            - The + operator is used to concatenate strings
                
            Example: String fullName = firstName + " " + lastName;
            
            - The + operator can also be used to concatenate strings with other data types
            - The + operator will convert the other data type to a string before concatenating
            - This is called type coercion

            Example: String message = "Hello " + name + ", you are " + age + " years old.";
          
            Trick Part:
            Using concatenation with numbers (tricking students into thinking it's addition)
            
            int a = 5;
            byte b = 5;
            String result = a + b + " is the sum of a and b."; ---> 10 is the sum of a and b.
            String result = '' + a + b + "  ---> 55 is the sum of a and b.";
            
    
          
        */

        /*
            * Prefix and Post Fix
            * 
            * - The ++ operator increments a variable by 1
            * - The -- operator decrements a variable by 1
            * 
            * Example: int a = 5; a++; // a is now 6
            * Example: System.out.println(a++); // prints 5
            * 
            * Example: int b = 5; ++b; // b is now 6
            * Example: System.out.println(++b); // prints 7
        */

        /*
         * Forced Data Loss
         * 
         * - When a larger data type is assigned to a smaller data type, data loss may occur
         * - The data is truncated to fit the smaller data type 
         * 
         * Example: int a = 1000; byte b = (byte)a; // b is now 24
         * Example: float f = 234.5f; int i = (int)f; // i is now 234
        */
        
    }
}
