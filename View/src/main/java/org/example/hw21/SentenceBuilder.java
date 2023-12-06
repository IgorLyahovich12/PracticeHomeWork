package org.example.hw21;

@FunctionalInterface
public interface SentenceBuilder {
    String buildSentence(String... parts);
}
