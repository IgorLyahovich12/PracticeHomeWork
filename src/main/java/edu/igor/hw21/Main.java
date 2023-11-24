package edu.igor.hw21;

public class Main {
    public static void main(String[] args) {
        Mathematical<Integer> mathematicalAnonymous = new Mathematical<Integer>() {
            @Override
            public Integer operate(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println("Anonymous Addition: " + mathematicalAnonymous.operate(4, 5));

        Mathematical<Integer> mathematicalLambda = Integer::sum;
        Mathematical<Integer> mathematicalFunctionalSum = Main::sum;
        Mathematical<Integer> mathematicalFunctionalSub = Main::sub;
        Mathematical<Integer> mathematicalFunctionalMultiply = Main::multiply;
        Mathematical<Integer> mathematicalFunctionalDivide = Main::divide;

        // Вивід результатів для кожної операції
        System.out.println("Lambda Addition: " + mathematicalLambda.operate(5, 7));
        System.out.println("Functional Sum: " + mathematicalFunctionalSum.operate(61, 23));
        System.out.println("Functional Subtraction: " + mathematicalFunctionalSub.operate(8, 3));
        System.out.println("Functional Multiplication: " + mathematicalFunctionalMultiply.operate(12, 14));
        System.out.println("Functional Division: " + mathematicalFunctionalDivide.operate(15, 6));

        ExpressionPrinter<String> expressionPrinter = result -> System.out.println("Result: " + result);
        expressionPrinter.print("Hello, World!");

        // Реалізація для SentenceBuilder
        SentenceBuilder sentenceBuilder = parts -> {
            StringBuilder sentence = new StringBuilder();
            for (String part : parts) {
                sentence.append(part).append(" ");
            }
            return sentence.toString().trim();
        };

        String[] sentenceParts = {"This", "is", "a", "sentence."};
        String builtSentence = sentenceBuilder.buildSentence(sentenceParts);
        System.out.println("Built Sentence: " + builtSentence);
    }


    // Зроблено методи приватними, оскільки вони використовуються лише всередині класу
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        // Додано перевірку на можливість ділення на 0
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}