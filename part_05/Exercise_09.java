package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarArgs {

    static void stringTest(String ... unicorn) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < unicorn.length; i++){
            sb.append(unicorn[i]);

            if (i == unicorn.length -1){

                sb.append(".");
            }
            sb.append(" ");
        }

        System.out.println(sb.toString());


    }

    public static void main(String args[]){
        stringTest("Hello", "Hi", "Chaio", "ksjhf;oiabef;oiswb");

    }
}