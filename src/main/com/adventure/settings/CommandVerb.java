package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes a users input and determines which verb to include in the command.
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        return INVALID;
    }

}
