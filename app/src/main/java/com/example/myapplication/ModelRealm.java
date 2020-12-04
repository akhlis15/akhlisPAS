package com.example.myapplication;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ModelRealm extends RealmObject {
    @PrimaryKey
    int id;
    String strTeam;
    String strStadium;
    String strStadiumThumb;
    String strDescriptionEN;
    String strTeamBadge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrTeam(){
        return  strTeam;
    }
    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }
    public String getStrStadium(){
        return  strStadium;
    }
    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }
    public String getStrStadiumThumb(){
        return  strStadiumThumb;
    }
    public void setStrStadiumThumb(String strStadiumThumb) {
        this.strStadiumThumb = strStadiumThumb;
    }
    public String getStrDescriptionEN(){
        return  strDescriptionEN;
    }
    public void setStrDescriptionEN( String strDescriptionEN){
        this.strDescriptionEN = strDescriptionEN;
    }
    public String getStrTeamBadge(){
        return  strTeamBadge;
    }
    public void setStrTeamBadge(String strTeamBadge){
        this.strTeamBadge = strTeamBadge;
    }
}

