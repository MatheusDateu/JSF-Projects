package bean;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class cmsBean implements Serializable{
    private String name = "Olá, me chamo Matheus Delmondes e este é meu primeiro projeto JSF.";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
