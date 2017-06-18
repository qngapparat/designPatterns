package compositePattern;

import java.util.ArrayList;

/**
 * Created by qngapparat on 18.06.17.
 */
public class Folder {

    private String name;
    private Folder parent;
    private ArrayList<Folder> folders = new ArrayList<>();
    private ArrayList<Datafile> datafiles = new ArrayList<>();

    public Folder(String name, Folder parent){
        this.name = name;
        this.parent = parent;
    }

    public String getName(){
        return this.name;
    }

    public String getPath(){
        if (this.parent == null) return name;

        else{
            return this.parent.getPath() + "/" + this.name;
        }
    }


    public void addFolder(Folder folder){
        this.folders.add(folder);
    }

    public void addDatafile(Datafile datafile){
        this.datafiles.add(datafile);
    }

}
