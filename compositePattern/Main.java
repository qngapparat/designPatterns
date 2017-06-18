package compositePattern;

import java.util.Random;

/**
 * Created by qngapparat on 18.06.17.
 */
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root", null);
        root.addDatafile(new Datafile("isuegsrg"));
        root.addDatafile(new Datafile("wrgwrg"));
        root.addDatafile(new Datafile("whtretujjj"));
        root.addDatafile(new Datafile("ayy.jpg"));

        Folder home = new Folder("home", root);
        root.addFolder(home);
        home.addFolder(new Folder("qngapparat", home));
        Folder user122 = new Folder("user122", home);
        home.addFolder(user122);

        System.out.println(user122.getPath());
    }
}
