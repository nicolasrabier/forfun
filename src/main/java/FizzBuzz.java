package main.java;

public class FizzBuzz {

    private int length;

    public FizzBuzz (){
        this(100);
    }

    public FizzBuzz (int length){
        this.length = length;
    }

    public void run(){
        StringBuilder sb = new StringBuilder();
        boolean fizzbuzz=false;
        for (int i = 1; i<=length; i++){
            fizzbuzz=false;
            if(i % 3 == 0) {sb.append("Fizz");fizzbuzz=true;}
            if(i % 5 == 0) {sb.append("Buzz");fizzbuzz=true;}
            if(!fizzbuzz){sb.append(i);}
            sb.append("\n\r");
        }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {

        FizzBuzz game = new FizzBuzz(100);
        game.run();

    }


}
