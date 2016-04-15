package com.ibm.ets.ita.ce.store.conversation.trigger.general;

public enum Word {
    WHO("who"),
    WHERE("where"),
    WHEN("when"),
    WHAT("what"),
    WHICH("which"),
    WHY("why"),
    LIST("list"),
    SUMMARISE("summarise"),
    SUMMARIZE("summarize"),
    COUNT("count"),
    INTERESTING("interesting"),
    INTERESTED("interested"),
    PROPERTY("property"),
    INSTANCE("instance"),
    CONCEPT("concept");

    private String name;

    private Word(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}