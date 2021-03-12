package com.company.chapterten;

/**
 * @author czy
 * @date 2020-7-30
 */
public class TestParcel4 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("test");
        //Parcel4.PDestination pD = p.new PDestination();
        //Parcel4.PContents pContents = p.new PContents();
    }
}
