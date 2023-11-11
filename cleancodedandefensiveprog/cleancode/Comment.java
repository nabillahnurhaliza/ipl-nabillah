package cleancode;
import java.util.regex.Pattern;

public class Comment {
    // Copyright (C) 2011 by Osoco. All rights reserved.
    // Released under the terms of the GNU General Public License
    // version 2 or later.
    // Returns an instance of the Responder being tested.
    protected abstract Responder responderInstance();
    // renaming the function: responderBeingTested
    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*,\\d*");
    assertTrue(a.compareTo(b) == -1); // a < b
    assertTrue(b.compareTo(a) == 1); // b > a
}
