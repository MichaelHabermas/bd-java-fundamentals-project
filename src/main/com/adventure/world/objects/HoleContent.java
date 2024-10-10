package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content;

    private boolean isCovered = true;

    public HoleContent(Key content) {
        this.content = content;
    }

    public boolean getIsCovered() {
        return this.isCovered;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public Key getKey() {
        return this.content;
    }
}
