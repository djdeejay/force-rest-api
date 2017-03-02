package com.force.api.http;

/**
 * Created by jjoergensen on 3/2/17.
 */
public class Codes {

    int[] codes;
    boolean any = true;

    public static final Codes ANY = new Codes();

    public static Codes expect(int... codes) {
        return new Codes(codes);
    }

    public Codes(int[] codes) {
        this.codes = codes;
        any = false;
    }

    public Codes() {}

    // since there will usually be one or two acceptable codes, it's not worth using HashSet.
    public boolean contains(int code) {
        if(this == ANY) return true;
        for(int c : codes) {
            if(c == code) return true;
        }
        return false;
    }
}
