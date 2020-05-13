package br.edu.fatecfranca.ads;

import java.util.ArrayList;

public class Country {
    private String continent;
    private String name;
    private String initials;
    //Associação
    private ArrayList<State> states;
    
    public Country() {
        this.states = new ArrayList();
}
    
    public Country(String continent, String name, String initials, ArrayList<State> states){
        this.continent = continent;
        this.name = name;
        this.initials = initials;
        this.states = states;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }
    
    @Override
    public String toString() {
        return "\nCountry{" + "continent=" + continent + ", name=" + name +
                ", initials=" + initials + ", states=" + this.states + '}';
    }
    
    //CRUD
    
    //Adiciona city em state
    public void addState(State state){
        this.states.add(state);
    }
    
    //Remove city de state
    public boolean removeState(State state){
        return this.states.remove(state);
    }
    
    //Obter posição da city em state
    public int getState(State state){
        return this.states.indexOf(state); // retorna -1 se não for encontrado
    }
    
    //Atualiza uma city por uma nova newCity em state
    public boolean updateState(State state, State newState){
        int pos = this.getState(state);
        if (pos != -1) {// existe a city
            this.states.set(pos, newState);
            return true;
        } else return false;
    }
    
    // adiciona uma city em um state de um country
    public boolean addCityState(City city, State state){
        int pos = this.getState(state);
        if (pos != -1){
            state.addCity(city);
            return true;
        } else return false;
    }
    
}
