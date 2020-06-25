package br.edu.fatecfranca.ads;

import java.util.ArrayList;

public class State {
    private String name;
    private String initials;
    //associação 
    private ArrayList<City> cities;
    
    public State(){
        this.cities = new ArrayList();
    }
    
    public State(String name, String initials, ArrayList<City> cities){
        this.name = name;
        this.initials = initials;
        this.cities = cities;
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

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    
    @Override
    public String toString() {
        return "\nState{" + "name=" + name + ", initials=" + initials + 
                //this.cities.toString() percorre o array inteiro chamando o toString() de cada City
                ", cities=" + cities + '}';
    }
    
    //CRUD
    
    //Adiciona city em state
    public void addCity(City city){
        this.cities.add(city);
    }
    
    //Remove city de state
    public boolean removeCity(City city){
        return this.cities.remove(city);
    }
    
    //Obter posição da city em state
    public int getCity(City city){
        return this.cities.indexOf(city); // retorna -1 se não for encontrado
    }
    
    //Atualiza uma city por uma nova newCity em state
    public boolean updateCity(City city, City newCity){
        int pos = this.getCity(city);
        if (pos != -1) {// existe a city
            this.cities.set(pos, newCity);
            return true;
        } else return false;
    }
}

