package main.com.adventure.settings;

/**
 * Sprint 2 Module 3
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
    //Used in Sprint 2 Module 3
    FIGHT,
    //Used in Sprint 3 Module 1
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb verb = INVALID;

        if (verbString.equalsIgnoreCase(String.valueOf(TAKE))) {
            verb = CommandVerb.TAKE;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(MOVE))) {
            verb = CommandVerb.MOVE;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(USE))) {
            verb = CommandVerb.USE;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(DIG))) {
            verb = CommandVerb.DIG;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(EXAMINE))) {
            verb = CommandVerb.EXAMINE;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(LOOK))) {
            verb = CommandVerb.LOOK;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(HELP))) {
            verb = CommandVerb.HELP;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(FIGHT))) {
            verb = CommandVerb.FIGHT;
        }
        if (verbString.equalsIgnoreCase(String.valueOf(INVENTORY))) {
            verb = CommandVerb.INVENTORY;
        }
        return verb;
    }

}
