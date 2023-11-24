package edu.igor.hw21;

@FunctionalInterface
public interface SentenceBuilder {
    String buildSentence(String... parts);
}
