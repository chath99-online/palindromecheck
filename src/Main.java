import java.util.*;
class Stack{
    private char [] stk;
    private int top;

    public Stack(){
        char [] stk = new char[10];
        top = -1;

    }

    public boolean isEmpty(){
        return top==-1;


    }

    public boolean isFull(){
        return top == stk.length-1;

    }

    public void push (char item){
        if ( isFull()){
            System.out.println("Can't insert element");
        } else {
            top++;
            stk [top] = item;
        }
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("Nothing to delete");
            return '0';
        } else {
            char ch = stk [top];
            top--;
            return ch;
        }
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("stack underflow");
        } else {
            for (int i=top; i>=0; i--)
                System.out.println(stk[i]+" ");
        }
    }
}



class palindromeCheck {
    public static void main(String[] args) {
        Stack ob1 = new Stack();
        char ele;
        String word;
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word");

        word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            ob1.push(word.charAt(i));

        }
        for (int j = 0; j < word.length(); j++) {

            if (word.charAt(j) == ob1.pop()) {
                System.out.println("Given word is a palindrome");
            } else {
                System.out.println("Given word is not a palindrome");
            }
        }
    }
}