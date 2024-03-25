package src.component;

import java.util.ArrayList;

public class ComponentList {
    ArrayList<BaseComponent> components;

    private static ComponentList INSTANCE;

    public static ComponentList getINSTANCE(){
        if(INSTANCE != null) return INSTANCE;
        else return new ComponentList();
    }

    public ComponentList(){components = new ArrayList<>();}

    public void add(BaseComponent c){components.add(c);}

    public void remove(BaseComponent c){components.remove(c);}

    public ArrayList<BaseComponent> getList() {
        return components;
    }
}
