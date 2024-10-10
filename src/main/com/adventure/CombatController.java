package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private final Player player;
    private final Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        while (true) {
            this.monster.setHealth(this.monster.getHealth() - this.player.getPower());
            if (isMonsterDefeated()) {
                return;
            }
            this.player.setHealth(this.player.getHealth() - this.monster.getPower());
            if (isPlayerDefeated()) {
                return;
            }
        }
    }

    /**
     * Checks if the player was defeated by seeing if the player's health is at or below 0
     * @return true if the player is defeated
     */
    public boolean isPlayerDefeated() {
        return this.player.getHealth() < 1;
    }

    /**
     * Checks if the monster was defeated by seeing if the monster's health is at or below 0
     * @return true if the monster is defeated
     */
    public boolean isMonsterDefeated() {
        return this.monster.getHealth() < 1;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        this.player.setHealth(10);
        this.monster.setHealth(10);
    }
}
