package com.company.chapnineteen;

/**
 * @author czy
 * @date 2021/3/15
 */
public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked Witch of the West"),
    NORTH("Glinds, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby" +
            "Slippers, crushed by Dorothy`s house"),
    SOUTH("Good by interface , but missing");
    private String description;

    OzWitch(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public static void main(String[] args) {
        for (OzWitch value : OzWitch.values()) {
            System.out.println(value+": "+ value.getDescription());
        }
    }
}
