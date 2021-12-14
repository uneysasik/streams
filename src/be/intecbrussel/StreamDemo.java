package be.intecbrussel;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

//        withoutStreams();
        withStreams();
    }


    private static void withoutStreams(){


        String[] words ={"This", "day", "is", "a", "good", "day"};

        String[] wordsEqualOrLongerThanThreeLetters = new String[5];
        int index = 0;
        for (String word : words) {
            if(word.length()>=3) {
                wordsEqualOrLongerThanThreeLetters[index] = word;
                index++;
            }
        }

        for(String word: wordsEqualOrLongerThanThreeLetters) {
            if (word != null) {
                System.out.println(word);
            }
        }
    }

    private static void withStreams(){
        String[] words = {"This", "day", "is", "a", "good", "day"};

        String[] wordsEqualOrLongerThanThreeLetter = Stream.of(words)
                .filter(word-> word.length()>=3)
                .toArray(String[]::new);

        Stream.of(wordsEqualOrLongerThanThreeLetter)
                .forEach(System.out::println);
        }

    }


